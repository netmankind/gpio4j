package org.lefranchi.gpio4j.gpio;

import org.lefranchi.gpio4j.gpio.udoo.SimulatedGpio;
import org.lefranchi.gpio4j.gpio.udoo.UdooGpio;

/**
 * Factory to Gpio Boards.
 * 
 * @author lefranchi
 *
 */
public class GpioFactory {

	public static final Gpio factory(GpioBoard board) {

		switch (board) {
		case SIMULATED:
			return new SimulatedGpio();
		case UDOO:
			return new UdooGpio();
		default:
			return null;
		}

	}

}
