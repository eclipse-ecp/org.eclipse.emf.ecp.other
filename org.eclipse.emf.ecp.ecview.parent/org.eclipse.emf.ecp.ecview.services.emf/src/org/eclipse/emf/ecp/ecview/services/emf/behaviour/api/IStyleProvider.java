package org.eclipse.emf.ecp.ecview.services.emf.behaviour.api;

/**
 * Service to provide visibility styles.
 */
public interface IStyleProvider {

	/**
	 * Returns the {@link RGBColor} for the given {@link ColorConstants}.
	 * 
	 * @param colorNumber
	 * @return
	 */
	RGBColor getRGBColor(byte colorNumber);
	
	public static class ColorConstants {
		public static byte BLACK = 0;
		public static byte WHITE = 1;
		public static byte BLUE = 2;
		public static byte RED = 3;
		public static byte GREEN = 4;
		public static byte MAGENTA = 5;
		public static byte CYAN = 6;
		public static byte YELLOW = 7;
	}
}
