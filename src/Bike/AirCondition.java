package Bike;

public class AirCondition {
    private boolean isOn;
    private int temperature;
    private final int MIN_TEMPERATURE = 16;
    private final int MAX_TEMPERATURE = 30;
    public AirCondition() {
        this.isOn = false;
        this.temperature = 24;
    }
    public void turnOn() {
        isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }
    public boolean isOn() {
        return isOn;
    }
    public void increaseTemperature() {
        if (isOn && temperature < MAX_TEMPERATURE) {
            temperature++;
        }
    }
    public void decreaseTemperature() {
        if (isOn && temperature > MIN_TEMPERATURE) {
            temperature--;
        }
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        if(temperature >= MIN_TEMPERATURE && temperature <= MAX_TEMPERATURE) {
            this.temperature = temperature;
        }
    }


}
