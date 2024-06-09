public class DisplayResults implements DisplayElement, SensorsObserver {

    private double temperature;
    private double humidity;
    private double pressure;
    private SensorsReader sensorsReader;

    public DisplayResults(SensorsReader sensorReader) {
        this.sensorsReader = sensorReader;
        sensorsReader.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature/Humidity/Pressure");
        System.out.println(temperature + "/" + humidity + "/" + pressure);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
