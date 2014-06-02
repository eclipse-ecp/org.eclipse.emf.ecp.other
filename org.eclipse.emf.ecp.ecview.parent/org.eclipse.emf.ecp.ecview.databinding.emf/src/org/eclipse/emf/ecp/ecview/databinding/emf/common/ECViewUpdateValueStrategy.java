package org.eclipse.emf.ecp.ecview.databinding.emf.common;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.databinding.conversion.IConverter;
import org.eclipse.core.internal.databinding.conversion.NumberToBigDecimalConverter;
import org.eclipse.core.internal.databinding.conversion.NumberToBigIntegerConverter;
import org.eclipse.core.internal.databinding.conversion.NumberToByteConverter;
import org.eclipse.core.internal.databinding.conversion.NumberToDoubleConverter;
import org.eclipse.core.internal.databinding.conversion.NumberToFloatConverter;
import org.eclipse.core.internal.databinding.conversion.NumberToIntegerConverter;
import org.eclipse.core.internal.databinding.conversion.NumberToLongConverter;
import org.eclipse.core.internal.databinding.conversion.NumberToShortConverter;
import org.eclipse.core.internal.databinding.conversion.ObjectToStringConverter;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;

import com.ibm.icu.text.NumberFormat;

@SuppressWarnings("restriction")
public class ECViewUpdateValueStrategy extends EMFUpdateValueStrategy {

	private static final Map<ConverterKey, IConverter> converterMap = new HashMap<ConverterKey, IConverter>();
	static {

		NumberFormat integerFormat = NumberFormat.getIntegerInstance();
		NumberFormat numberFormat = NumberFormat.getNumberInstance();

		converterMap.put(new ConverterKey(Number.class, BigDecimal.class),
				new NumberToBigDecimalConverter(numberFormat, Number.class));
		converterMap.put(new ConverterKey(Number.class, BigInteger.class),
				new NumberToBigIntegerConverter(integerFormat, Number.class));

		converterMap.put(new ConverterKey(Number.class, Byte.class),
				new NumberToByteConverter(integerFormat, Number.class, false));
		converterMap.put(new ConverterKey(Number.class, Byte.TYPE),
				new NumberToByteConverter(integerFormat, Number.class, true));

		converterMap.put(new ConverterKey(Number.class, Double.class),
				new NumberToDoubleConverter(numberFormat, Number.class, false));
		converterMap.put(new ConverterKey(Number.class, Double.TYPE),
				new NumberToDoubleConverter(numberFormat, Number.class, true));

		converterMap.put(new ConverterKey(Number.class, Float.class),
				new NumberToFloatConverter(numberFormat, Number.class, false));
		converterMap.put(new ConverterKey(Number.class, Float.TYPE),
				new NumberToFloatConverter(numberFormat, Number.class, true));

		converterMap
				.put(new ConverterKey(Number.class, Integer.class),
						new NumberToIntegerConverter(integerFormat,
								Number.class, false));
		converterMap
				.put(new ConverterKey(Number.class, Integer.TYPE),
						new NumberToIntegerConverter(integerFormat,
								Number.class, true));

		converterMap.put(new ConverterKey(Number.class, Long.class),
				new NumberToLongConverter(integerFormat, Number.class, false));
		converterMap.put(new ConverterKey(Number.class, Long.TYPE),
				new NumberToLongConverter(integerFormat, Number.class, true));

		converterMap.put(new ConverterKey(Number.class, Short.class),
				new NumberToShortConverter(integerFormat, Number.class, false));
		converterMap.put(new ConverterKey(Number.class, Short.TYPE),
				new NumberToShortConverter(integerFormat, Number.class, true));

	}

	public ECViewUpdateValueStrategy() {
		super();
	}

	public ECViewUpdateValueStrategy(boolean provideDefaults, int updatePolicy) {
		super(provideDefaults, updatePolicy);
	}

	public ECViewUpdateValueStrategy(int updatePolicy) {
		super(updatePolicy);
	}

	@Override
	protected IConverter createConverter(Object fromType, Object toType) {
		if (toType instanceof EAttribute) {
			final EAttribute eAttribute = (EAttribute) toType;
			final EDataType eDataType = eAttribute.getEAttributeType();
			final Class<?> toTypeClass = eDataType.getInstanceClass();
			if (isNumber(fromType)) {
				if (isNumber(toTypeClass)) {
					final Class<?> fromTypeClass = (Class<?>) fromType;
					IConverter converter = findNumberToNumberConverter(
							toTypeClass, fromTypeClass);
					if (converter != null) {
						return converter;
					}
				} else if (toTypeClass == String.class) {
					return new ObjectToStringConverter();
				}
			} else if (fromType == String.class
					&& (toTypeClass == String.class || toTypeClass == Object.class)) {
				return null;
			}
		} else if (fromType instanceof EAttribute) {
			final EAttribute eAttribute = (EAttribute) fromType;
			final EDataType eDataType = eAttribute.getEAttributeType();
			final Class<?> fromTypeClass = eDataType.getInstanceClass();
			if (isNumber(toType)) {
				// if eAttribute == number
				if (isNumber(fromTypeClass)) {
					final Class<?> toTypeClass = (Class<?>) toType;
					IConverter converter = findNumberToNumberConverter(
							toTypeClass, fromTypeClass);
					if (converter != null) {
						return converter;
					}
				}
			} else if (toType == String.class
					&& (fromTypeClass == String.class || fromTypeClass == Object.class)) {
				return null;
			}
		}
		return super.createConverter(fromType, toType);
	}

	/**
	 * Tries to find a proper number converter.
	 * 
	 * @param toTypeClass
	 * @param fromTypeClass
	 * @return
	 */
	private IConverter findNumberToNumberConverter(final Class<?> toTypeClass,
			final Class<?> fromTypeClass) {
		// if (toTypeClass == BigDecimal.class)
		// return new NumberToBigDecimalConverter(
		// NumberFormat.getNumberInstance(), fromTypeClass);
		// if (toTypeClass == BigInteger.class)
		// return new NumberToBigIntegerConverter(
		// NumberFormat.getNumberInstance(), fromTypeClass);
		// if (toTypeClass == Byte.class || toTypeClass == Byte.TYPE)
		// return new NumberToByteConverter(NumberFormat.getNumberInstance(),
		// fromTypeClass, toTypeClass.isPrimitive());
		// if (toTypeClass == Double.class || toTypeClass == Double.TYPE)
		// return new NumberToDoubleConverter(
		// NumberFormat.getNumberInstance(), fromTypeClass,
		// toTypeClass.isPrimitive());
		// if (toTypeClass == Float.class || toTypeClass == Float.TYPE)
		// return new NumberToFloatConverter(NumberFormat.getNumberInstance(),
		// fromTypeClass, toTypeClass.isPrimitive());
		// if (toTypeClass == Integer.class || toTypeClass == Integer.TYPE)
		// return new NumberToIntegerConverter(
		// NumberFormat.getNumberInstance(), fromTypeClass,
		// toTypeClass.isPrimitive());
		// if (toTypeClass == Long.class || toTypeClass == Long.TYPE)
		// return new NumberToLongConverter(NumberFormat.getNumberInstance(),
		// fromTypeClass, toTypeClass.isPrimitive());
		// if (toTypeClass == Short.class || toTypeClass == Short.TYPE)
		// return new NumberToShortConverter(NumberFormat.getNumberInstance(),
		// fromTypeClass, toTypeClass.isPrimitive());

		return converterMap.get(new ConverterKey(Number.class, toTypeClass));
	}

	/**
	 * Returns true, if the given type is a number.
	 * 
	 * @param type
	 * @return
	 */
	private boolean isNumber(Object type) {
		return type instanceof Class
				&& (((Class<?>) type).isAssignableFrom(Number.class) || isPrimitiveNumber((Class<?>) type));
	}

	/**
	 * Returns true, if the given type is a date.
	 * 
	 * @param type
	 * @return
	 */
	private boolean isDate(Object type) {
		return type instanceof Class
				&& (((Class<?>) type).isAssignableFrom(Date.class));
	}

	/**
	 * Returns true, if the given type is a string.
	 * 
	 * @param type
	 * @return
	 */
	private boolean isString(Object type) {
		return type == String.class;
	}

	/**
	 * Returns true, if the given type is a primitive number.
	 * 
	 * @param type
	 * @return
	 */
	private boolean isPrimitiveNumber(Class<?> type) {
		if (type.isPrimitive()) {
			return type == Short.TYPE || type == Byte.TYPE
					|| type == Double.TYPE || type == Float.TYPE
					|| type == Integer.TYPE || type == Long.TYPE;
		}
		return false;
	}

	/**
	 * A key to access the converter map.
	 */
	private static final class ConverterKey {

		private final Class<?> fromType;
		private final Class<?> toType;

		public ConverterKey(Class<?> fromType, Class<?> toType) {
			super();
			this.fromType = fromType;
			this.toType = toType;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((fromType == null) ? 0 : fromType.hashCode());
			result = prime * result
					+ ((toType == null) ? 0 : toType.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ConverterKey other = (ConverterKey) obj;
			if (fromType == null) {
				if (other.fromType != null)
					return false;
			} else if (!fromType.equals(other.fromType))
				return false;
			if (toType == null) {
				if (other.toType != null)
					return false;
			} else if (!toType.equals(other.toType))
				return false;
			return true;
		}

	}

}
