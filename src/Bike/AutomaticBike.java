 package Bike;

import java.util.ArrayList;

public class AutomaticBike {
    private boolean isOn;
    private int speed;
    private int gear;
    private ArrayList<String> history;

    public AutomaticBike() {
        this.isOn = false;
        this.speed = 0;
        this.gear = 1;
        this.history = new ArrayList<>();
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            history.add("Bike turned on");
            System.out.println("Bike turned on");
        } else {
            System.out.println("Bike is already on");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            speed = 0;
            gear = 1;
            history.add("Bike turned off");
            System.out.println("Bike turned off");
        } else {
            System.out.println("Bike is already off");
        }
    }

    public void accelerate() {
        if (isOn) {
            switch (gear) {
                case 1:
                    speed += 1;
                    break;
                case 2:
                    speed += 2;
                    break;
                case 3:
                    speed += 3;
                    break;
                case 4:
                    speed += 4;
                    break;
                default:
                    System.out.println("Invalid gear");
            }
            updateGear();
            history.add("Accelerated to speed: " + speed + " on gear: " + gear);
        } else {
            System.out.println("Bike is off, can't accelerate.");
        }
    }

    public void decelerate() {
        if (isOn) {
            switch (gear) {
                case 1:
                    speed -= 1;
                    break;
                case 2:
                    speed -= 2;
                    break;
                case 3:
                    speed -= 3;
                    break;
                case 4:
                    speed -= 4;
                    break;
                default:
                    System.out.println("Invalid gear");
            }
            if (speed < 0) {
                speed = 0;
            }
            updateGear();
            history.add("Decelerated to speed: " + speed + " on gear: " + gear);
        } else {
            System.out.println("Bike is off, can't decelerate.");
        }
    }

    private void updateGear() {
        if (speed <= 20) {
            gear = 1;
        } else if (speed <= 30) {
            gear = 2;
        } else if (speed <= 41) {
            gear = 3;
        } else {
            gear = 4;
          }
        history.add("Gear changed to: " + gear);
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public ArrayList<String> getHistory() {
        return history;
    }
}
