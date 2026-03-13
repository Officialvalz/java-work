public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public AirConditioner() {
        this.isOn = false;
        this.temperature = 24;
    }

    public void turnOn()  { this.isOn = true; }
    public void turnOff() { this.isOn = false; }
    public boolean isOn() { return this.isOn; }
    public int getTemperature() { return this.temperature; }

    public void increaseTemperature() {
        if (temperature < 30) temperature++;
    }

    public void decreaseTemperature() {
        if (temperature > 16) temperature--;
    }
}
