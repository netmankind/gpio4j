package org.lefranchi.gpio4j.gpio.udoo;

import java.io.IOException;

import org.lefranchi.gpio4j.gpio.Gpio;
import org.lefranchi.gpio4j.gpio.Pin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimulatedGpio extends Gpio {

	private static Logger logger = LoggerFactory.getLogger(SimulatedGpio.class);

	@Override
	public void setupPinDirection(Pin pin) throws IOException {
		logger.info("setupPinDirection["+pin+"]");
		
	}

	@Override
	public void setPinState(Pin pin) throws IOException {
		logger.info("setPinState["+pin+"]");
	}

}
