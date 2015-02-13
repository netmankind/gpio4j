package org.lefranchi.gpio4j.gpio;

import org.lefranchi.gpio4j.gpio.udoo.UdooGpio;

/**
 * Factory to Gpio Boards.
 * 
 * @author lefranchi
 *
 */
public class GpioFactory {
	
	public static final Gpio factory(GpioBoard board) {
		
		if (board == null)
			return null;
		else if (board.equals(GpioBoard.UDOO))
			return new UdooGpio();
		else 
			return null;
		
	}

	/**
	 * Board.
	 * 
	 * @author lefranchi
	 *
	 */
	public enum GpioBoard {
		
		UDOO;
		
	}

}
