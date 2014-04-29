package org.eclipse.emf.ecp.ecview.services.emf.behaviour.api;

/**
 * Should not be implemented by subclasses. Interface may change.
 */
public interface IVisibilityAdapter {

	/**
	 * Sets the foregroundColor. <code>null</code> will reset the value to
	 * default.
	 * 
	 * @param color
	 * @return
	 */
	IVisibilityAdapter foregroundColor(RGBColor color);

	/**
	 * Sets the backgroundColor. <code>null</code> will reset the value to
	 * default.
	 * 
	 * @param color
	 * @return
	 */
	IVisibilityAdapter backgroundColor(RGBColor color);

	/**
	 * True if a border should be shown.
	 * 
	 * @param color
	 * @return
	 */
	IVisibilityAdapter border(boolean value);

	/**
	 * True if italic.
	 * 
	 * @param value
	 * @return
	 */
	IVisibilityAdapter italic(boolean value);

	/**
	 * True if bold.
	 * 
	 * @param value
	 * @return
	 */
	IVisibilityAdapter bold(boolean value);

	/**
	 * True if underline.
	 * 
	 * @param value
	 * @return
	 */
	IVisibilityAdapter underline(boolean value);

	/**
	 * True if strikeThrough.
	 * 
	 * @param value
	 * @return
	 */
	IVisibilityAdapter strikeThrough(boolean value);

	/**
	 * True if visible.
	 * 
	 * @param value
	 * @return
	 */
	IVisibilityAdapter visible(boolean value);

	/**
	 * True if editable.
	 * 
	 * @param value
	 * @return
	 */
	IVisibilityAdapter editable(boolean value);

	/**
	 * True if enabled.
	 * 
	 * @param value
	 * @return
	 */
	IVisibilityAdapter enabled(boolean value);
}
