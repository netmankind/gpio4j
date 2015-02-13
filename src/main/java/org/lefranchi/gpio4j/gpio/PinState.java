package org.lefranchi.gpio4j.gpio;

/**
 * Pin State. HIGH or LOW for digital ports. 0 to 255 for PWM ports.
 * 	
 * @author lefranchi
 *
 */
public class PinState extends Number {

	private static final long serialVersionUID = 6764651533138982652L;
	
	public static final PinState HIGH = new PinState(1);
	public static final PinState LOW = new PinState(0);
	
	//TODO: Test Min and Max Values (PWM).
	private final int MIN_VALUE = 0;
	private final int MAX_VALUE = 255;

	/**
	 * The Value.
	 */
	private int value;
	
	/**
	 * Deafult constructor.
	 * 
	 * @param value
	 */
	public PinState(int value) {
		setValue(value);
	}
	
	@Override
	public int intValue() {
		return getValue();
	}

	@Override
	public long longValue() {
		return getValue();
	}

	@Override
	public float floatValue() {
		return new Float(getValue());
	}

	@Override
	public double doubleValue() {
		return new Double(getValue());
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
