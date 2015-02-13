package org.lefranchi.gpio4j.gpio;

import org.lefranchi.gpio4j.gpio.Gpio.GpioDirection;

/**
 * A Gpio Pin.
 */
public class Pin {

	/**
	 * Pin number.
	 */
	private int number;
	
	/**
	 * Tag for human readable.
	 */
	private String tag;
	
	/**
	 * Pin State.
	 */
	private PinState state;
	
	/**
	 * Pin Direction.
	 */
	private GpioDirection direction;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public PinState getState() {
		return state;
	}

	public void setState(PinState state) {
		this.state = state;
	}

	public GpioDirection getDirection() {
		return direction;
	}

	public void setDirection(GpioDirection direction) {
		this.direction = direction;
	}
	
	
}
