/**
 * Copyright (c) 2013 COMPEX Systemhaus GmbH Heidelberg. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Jose C. Dominguez - initial API and implementation
 */

package org.eclipse.emf.ecp.ecview.common.uri;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Added URI will be transformed to the most pathed way or fragmented way.
 * <p>
 * <h3>pathed URI</h3>
 * This means, that the URI-fragment is shorten to the first element and the
 * rest of the URI-Elements are placed at path structure.
 * <p>
 * For instance<br>
 * input =
 * <code>view://bean/root/invoiceInfo#value.customer.address.country</code><br>
 * pathed =
 * <code>view://bean/root/invoiceInfo/customer/address#value.country</code>
 * 
 * <h3>fragmented URI</h3> This means, that the URI-path is shorten to the first
 * element and the rest of the URI-Elements are placed at fragment structure.
 * <p>
 * 
 * For instance<br>
 * input =
 * <code>view://bean/root/invoiceInfo#value.customer.address.country</code><br>
 * fragmented =
 * <code>view://bean/root#value.invoiceInfo.customer.address.country</code>
 * 
 * @author dominguez
 * 
 */
public class URIMapper {

	private final String URI_SCHEMA_DELIMITER = "://";
	private final String URI_PATH_DELIMITER = "/";
	private final String URI_FRAGMENT_DELIMITER = ".";
	private final String URI_FRAGMENT_PATH_DELIMITER = "#";
	private Mapping mapping;

	private static final Logger logger = LoggerFactory
			.getLogger(URIMapper.class);

	public Mapping addURI(URI uri) {
		mapping = new Mapping(uri);
		return mapping;
	}

	public void activate() {
		mapping.activate = true;
	}

	public void deactivate() {
		mapping.activate = false;
	}

	public class Mapping {
		private final URI uri;
		private final String[] pathElems;
		private final String[] fragments;
		private final List<String> uriElems;
		private boolean activate;

		public Mapping(URI uri) {
			this.uri = uri;
			pathElems = uri.getPath().split("/");
			fragments = uri.getFragment().split("\\.");
			uriElems = new ArrayList<String>(pathElems.length
					+ fragments.length - 2);
			uriElems.addAll(Arrays.asList(Arrays.copyOfRange(pathElems, 1,
					pathElems.length)));
			uriElems.addAll(Arrays.asList(Arrays.copyOfRange(fragments, 1,
					fragments.length)));
		}

		/**
		 * @return the uri
		 */
		public URI getUri() {
			return uri;
		}

		private StringBuffer getURIPrefix() {
			StringBuffer strBuf = new StringBuffer();
			String schema = uri.getScheme();
			String auth = uri.getAuthority();
			strBuf.append(schema).append(URI_SCHEMA_DELIMITER).append(auth);
			return strBuf;
		}

		/**
		 * Provides the URI in the most fragmented way. This means, that the
		 * URI-path is shorten to the first element and the rest of the
		 * URI-Elements are placed at fragment structure.
		 * 
		 * @return URI
		 */
		public URI getFragmentedURI() {
			StringBuffer strBuf = getURIPrefix();
			// not starting at pathElems[0], because that Element is blank.
			strBuf.append(URI_PATH_DELIMITER).append(pathElems[1])
					.append(URI_FRAGMENT_PATH_DELIMITER).append(fragments[0]);
			combineURI(strBuf, 1, pathElems.length, URI_FRAGMENT_DELIMITER);
			combineURI(strBuf, pathElems.length, uriElems.size(),
					URI_FRAGMENT_DELIMITER);
			logger.debug("getFragmentedURI() - strBuf: " + strBuf);
			return URI.create(strBuf.toString());
		}

		private StringBuffer combineURI(StringBuffer strBuf, int pathStart,
				int pathEnd, String delimiter) {
			if (validateStartEnd(uriElems, pathStart, pathEnd)) {
				for (int i = pathStart; i < pathEnd; i++) {
					String pathElemsSplit = uriElems.get(i);
					strBuf.append(delimiter).append(pathElemsSplit);
				}
			}
			return strBuf;
		}

		private boolean validateStartEnd(Collection<String> list,
				int listStart, int listEnd) {
			if (listStart < 0 || listEnd > list.size()) {
				return false;
			}
			return true;
		}

		/**
		 * Provides the URI in the most pathed way. This means, that the
		 * URI-fragment is shorten to the first element and the rest of the
		 * URI-Elements are placed at path structure.
		 * 
		 * @return URI
		 */
		public URI getPathedURI() {
			StringBuffer strBuf = getURIPrefix();
			strBuf.append(uri.getPath());
			combineURI(strBuf, pathElems.length - 1, uriElems.size() - 1,
					URI_PATH_DELIMITER);
			strBuf.append(URI_FRAGMENT_PATH_DELIMITER).append(fragments[0]);
			// the first fragmentElement is already in the URi
			if ((fragments.length - 1) > 0) {
				strBuf.append(URI_FRAGMENT_DELIMITER).append(
						fragments[fragments.length - 1]);
			}
			logger.debug("getPathedURI() - strBuf: " + strBuf);
			return URI.create(strBuf.toString());
		}

		/**
		 * Helper method to prepare the mappings
		 * 
		 * @return List<Mapping>
		 */
		private List<Mapping> getAllMappings() {
			int idx = uriElems.size();
			List<Mapping> mappings = new ArrayList<Mapping>(idx + 1);
			int start = 0;
			int end = idx;
			for (int i = 0; i < idx; i++) {
				StringBuffer strBuf = getURIPrefix();
				// first path element is always required
				int pathEnd = end - 1;
				if (end == 1) {
					pathEnd = end;
				}
				combineURI(strBuf, start, pathEnd, URI_PATH_DELIMITER);
				strBuf.append(URI_FRAGMENT_PATH_DELIMITER).append(fragments[0]);
				// no more fragment available
				if (end > 1) {
					combineURI(strBuf, pathEnd, end, URI_FRAGMENT_DELIMITER);
				}
				Mapping mapping = new Mapping(URI.create(strBuf.toString()));
				mappings.add(mapping);
				end--;
			}
			return mappings;
		}

		/**
		 * Returns all the mappings contained in this mapper
		 * 
		 * @return List<Mapping>
		 */
		public List<Mapping> getMappings() {
			if (!activate) {
				List<Mapping> mappings = new ArrayList<URIMapper.Mapping>(1);
				mappings.add(this);
				return mappings;
			} else {
				return getAllMappings();
			}
		}

	}
}