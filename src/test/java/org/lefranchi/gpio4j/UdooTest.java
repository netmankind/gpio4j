package org.lefranchi.gpio4j;

import static org.junit.Assert.*;

import org.junit.Test;
import org.lefranchi.gpio4j.gpio.Gpio;
import org.lefranchi.gpio4j.gpio.GpioBoard;
import org.lefranchi.gpio4j.gpio.GpioFactory;
import org.lefranchi.gpio4j.gpio.Pin;
import org.lefranchi.gpio4j.gpio.Gpio.GpioDirection;
import org.lefranchi.gpio4j.gpio.PinState;

public class UdooTest {

	@Test
	public void test() {
		
		Gpio gpio = GpioFactory.factory(GpioBoard.UDOO);
		
		assertNotNull(gpio);
		
		try {
			
			Pin led01 = gpio.provisionPin(5, GpioDirection.OUT, PinState.HIGH, "PIN_1_OUT_LED1");
			
			assertNotNull(led01);
			
			led01.setState(PinState.LOW);
			
			gpio.setPinState(led01);
			
			assertEquals(led01.getState(), PinState.LOW);
			
		} catch (Exception e) {


			e.printStackTrace();
	
			// To build outside Udoo.
			if (!(e instanceof java.nio.file.NoSuchFileException)) {
				e.printStackTrace();
				fail("Error provisioning Pin Led01");
			}
			
		}  
		
	}

}
