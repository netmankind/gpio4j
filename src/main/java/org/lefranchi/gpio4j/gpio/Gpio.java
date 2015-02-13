package org.lefranchi.gpio4j.gpio;

import java.io.IOException;


/**
 * The Gpio;
 * 
 * @author lefranchi
 *
 */
public abstract class Gpio {
	
	abstract public void setupPinDirection(Pin pin) throws IOException;

	/**
	 * Instantiate and configure new Pin ready to use.
	 * 
	 * @param pinNumber Number of Pin
	 * @param direction Directio of Pin. Can be INPUT or OUTPUT.
	 * @param initialState Initial state of pin.
	 * @param tag Tag to readable pin name.
	 * @return
	 * @throws Exception 
	 */
	public Pin provisionPin(int pinNumber, GpioDirection direction, PinState initialState, String tag) throws Exception {

		Pin pin = new Pin();
		
		pin.setNumber(pinNumber);
		pin.setDirection(direction);
		pin.setState(initialState);
		pin.setTag(tag);

		setupPinDirection(pin);
		
		return pin;
	}
	
	/**
	 * Direction of port. Can be input or output.
	 * 
	 * @author lefranchi
	 *
	 */
	public enum GpioDirection {
		
		IN, OUT;
		
	}
	
}
