package org.lefranchi.gpio4j;

import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.lefranchi.gpio4j.gpio.Gpio;
import org.lefranchi.gpio4j.gpio.GpioFactory;

public class GpioTest {

	@Test
	public void test() {
		
		Gpio gpio = GpioFactory.factory(null);
		
		assertNull(gpio);
		
	}

}
