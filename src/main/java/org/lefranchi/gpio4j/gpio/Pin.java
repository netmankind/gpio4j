package org.lefranchi.gpio4j.gpio;

import java.io.IOException;

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

	/**
	 * Gpio.
	 */
	private Gpio gpio;

	public Pin(Gpio gpio) {
		this.gpio = gpio;
	}

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

	/**
	 * Sets and execute PinState.
	 * 
	 * @param state
	 *            State of Pin.
	 * @throws IOException
	 */
	public void setState(PinState state) throws IOException {
		this.state = state;

		gpio.setPinState(this);

	}

	public GpioDirection getDirection() {
		return direction;
	}

	public void setDirection(GpioDirection direction) {
		this.direction = direction;
	}

	public Gpio getGpio() {
		return gpio;
	}

	public void setGpio(Gpio gpio) {
		this.gpio = gpio;
	}

}
