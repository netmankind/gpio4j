package org.lefranchi.gpio4j.gpio.udoo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;

import org.lefranchi.gpio4j.gpio.Gpio;
import org.lefranchi.gpio4j.gpio.Pin;

/**
 * Implementation of Udoo Gpio.
 * 
 * @author lefranchi
 *
 */
public class UdooGpio extends Gpio {

	/**
	 * System Path of GPIO.
	 */
	private final String PATH = "/sys/class/gpio/gpio%2d/";
	
	/**
	 * Path to GPIO direction.
	 */
	private final String PATH_DIRECTION = "direction";
	
	/**
	 * Path to GPIO value.
	 */
	private final String PATH_VALUE = "value";
	
	/**
	 * Relationship between pin number and gpio card number.
	 */
	private Map<Integer, Integer> pinToGpioNumber;
	
	/**
	 * Default contructor. Loads class setup.
	 */
	public UdooGpio() {
		loadSetup();
	}

	/*
	 * (non-Javadoc)
	 * @see org.lefranchi.gpio4j.gpio.Gpio#setupPinDirection(org.lefranchi.gpio4j.gpio.Pin)
	 */
	@Override
	public void setupPinDirection(Pin pin) throws IOException {
		
		Path path = Paths.get(String.format(PATH, this.pinToGpioNumber.get(pin.getNumber())), PATH_DIRECTION);
		
		Files.write( path, pin.getDirection().name().toLowerCase().getBytes(), StandardOpenOption.APPEND);
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.lefranchi.gpio4j.gpio.Gpio#setPinState(org.lefranchi.gpio4j.gpio.Pin)
	 */
	@Override
	public void setPinState(Pin pin) throws IOException {
		
		Path path = Paths.get(String.format(PATH, this.pinToGpioNumber.get(pin.getNumber())), PATH_VALUE);
		
		Files.write( path, String.valueOf(pin.getState().getValue()).getBytes(), StandardOpenOption.APPEND);
		
	}
	
	/**
	 * Load setup.
	 */
	private void loadSetup() {
		
		pinToGpioNumber = new HashMap<Integer, Integer>();
		
		pinToGpioNumber.put(0, 116);
		pinToGpioNumber.put(1, 112);
		pinToGpioNumber.put(2, 20);
		pinToGpioNumber.put(3, 16);
		pinToGpioNumber.put(4, 17);
		pinToGpioNumber.put(5, 18);
		pinToGpioNumber.put(6, 41);
		pinToGpioNumber.put(7, 42);
		pinToGpioNumber.put(8, 21);
		pinToGpioNumber.put(9, 19);
		pinToGpioNumber.put(10, 1);
		pinToGpioNumber.put(11, 9);
		pinToGpioNumber.put(12, 3);
		pinToGpioNumber.put(13, 40);
		pinToGpioNumber.put(14, 150);
		pinToGpioNumber.put(15, 162);
		pinToGpioNumber.put(16, 160);
		pinToGpioNumber.put(17, 161);
		pinToGpioNumber.put(18, 158);
		pinToGpioNumber.put(19, 159);
		pinToGpioNumber.put(20, 92);
		pinToGpioNumber.put(21, 85);
		pinToGpioNumber.put(22, 123);
		pinToGpioNumber.put(23, 124);
		pinToGpioNumber.put(24, 125);
		pinToGpioNumber.put(25, 126);
		pinToGpioNumber.put(26, 127);
		pinToGpioNumber.put(27, 133);
		pinToGpioNumber.put(28, 134);
		pinToGpioNumber.put(29, 136);
		pinToGpioNumber.put(30, 137);
		pinToGpioNumber.put(31, 138);
		pinToGpioNumber.put(32, 138);
		pinToGpioNumber.put(33, 139);
		pinToGpioNumber.put(34, 140);
		pinToGpioNumber.put(35, 141);
		pinToGpioNumber.put(36, 142);
		pinToGpioNumber.put(37, 143);
		pinToGpioNumber.put(38, 54);
		pinToGpioNumber.put(39, 205);
		pinToGpioNumber.put(40, 32);
		pinToGpioNumber.put(41, 35);
		pinToGpioNumber.put(42, 34);
		pinToGpioNumber.put(43, 33);
		pinToGpioNumber.put(44, 101);
		pinToGpioNumber.put(45, 144);
		pinToGpioNumber.put(46, 145);
		pinToGpioNumber.put(47, 89);
		pinToGpioNumber.put(48, 105);
		pinToGpioNumber.put(49, 104);
		pinToGpioNumber.put(50, 57);
		pinToGpioNumber.put(51, 56);
		pinToGpioNumber.put(52, 55);
		pinToGpioNumber.put(53, 88);
	}

}
