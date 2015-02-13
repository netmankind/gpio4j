# gpio4j

A small library to manage the GPIO boards. Enables use in analogic, digital and PWM ports.

## Example using on Udoo

//Creates new Gpio manager to Uddo Board  
Gpio gpio = GpioFactory.factory(GpioBoard.UDOO);

//Creates a Pin to control a Led on Pin 1. Starts with light on.  
Pin led1 = gpio.provisionPin(1, GpioDirection.OUT, PinState.HIGH, "LED1");

//Turn off the light.  
led01.setState(PinState.LOW);

