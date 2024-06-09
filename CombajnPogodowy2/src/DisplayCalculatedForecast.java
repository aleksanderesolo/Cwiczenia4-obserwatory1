public class DisplayCalculatedForecast implements DisplayElement, SensorsObserver{

    private double pressureNow = 1000;
    private double lastPressure;
    private SensorsReader sensorsReader;

    public DisplayCalculatedForecast(SensorsReader sensorReader) {
        this.sensorsReader = sensorReader;
        sensorsReader.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("The weather is going to be: ");
        if (pressureNow > lastPressure) {
            System.out.println("better");
        } else if (pressureNow < lastPressure) {
            System.out.println("worst");
        } else {
            System.out.println("same");
        }
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        lastPressure = pressureNow;
        pressureNow = pressure;

        display();
    }
}
