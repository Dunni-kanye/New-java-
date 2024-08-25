package Bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {
    @Test
    public void testTurnOnAc() {
        AirCondition ac = new AirCondition();
        ac.turnOn();
        assertTrue(ac.isOn());

    }
    @Test
    public void testTurnOffAc() {
        AirCondition ac = new AirCondition();
        ac.turnOn();
        ac.turnOff();
        assertFalse(ac.isOn());

    }
    @Test
    public void testIncreaseTemperature() {
        AirCondition ac = new AirCondition();
        ac.turnOn();
        int initialTemperature = ac.getTemperature();
        ac.increaseTemperature();
        assertEquals(initialTemperature + 1, ac.getTemperature());
    }
    @Test
    public void testDecreaseTemperature() {
        AirCondition ac = new AirCondition();
        ac.turnOn();
        int initialTemperature = ac.getTemperature();
        ac.decreaseTemperature();
        assertEquals(initialTemperature - 1, ac.getTemperature());

    }
    @Test
    public void testIncreaseTemperatureBeyondMax(){
        AirCondition ac = new AirCondition();
        ac.turnOn();
        ac.setTemperature(30);
        ac.increaseTemperature();
        assertEquals(30, ac.getTemperature());

    }
    @Test
    public void testDecreaseTemperatureBelowMin(){
        AirCondition ac = new AirCondition();
        ac.turnOn();
        ac.setTemperature(16);
        ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());

    }

}
