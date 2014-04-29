package org.eclipse.emf.ecp.ecview.services.emf.behaviour.api;

public class RGBColor {

	private final byte red;
	private final byte green;
	private final byte blue;

	public RGBColor(byte red, byte green, byte blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	/**
	 * Returns the red value.
	 * 
	 * @return
	 */
	public byte getRed() {
		return red;
	}

	/**
	 * Returns the green value.
	 * 
	 * @return
	 */
	public byte getGreen() {
		return green;
	}

	/**
	 * Returns the blue value.
	 * 
	 * @return
	 */
	public byte getBlue() {
		return blue;
	}

}
