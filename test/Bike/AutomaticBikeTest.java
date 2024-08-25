package Bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    @Test
    public void testTurnOnBike() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void testTurnOffBike() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getGear());

    }

    @Test
    public void testGearAcceleratesToOne() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        for (int index = 0; index < 15; index++) {
            bike.accelerate();
        }
        assertEquals(15, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void testGearAcceleratesToFour() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        for (int index = 0; index <= 30; index++) {
            bike.accelerate();
            System.out.println("Speed: " + bike.getSpeed() + ", Gear: " + bike.getGear());
        }
        assertEquals(47, bike.getSpeed());
        assertEquals(4, bike.getGear());
    }
    @Test
    public void testGearDeceleratesToOne() {
        AutomaticBike bike = new AutomaticBike();
        for (int index = 0; index < 35; index++) {
            bike.accelerate();
        }
        bike.turnOn();
        for (int index = 0; index < 15; index++) {
            bike.accelerate();
            System.out.println("Speed: " + bike.getSpeed() + ", Gear: " + bike.getGear());
        }
        assertEquals(15, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

}
