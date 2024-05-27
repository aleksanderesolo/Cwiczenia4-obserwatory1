public class CalculateSensorsDataAndDisplayResults implements DisplayElement, SensorsObserver {

    private double pressureNow = 1000;
    private double pressureBefore;
    private SensorReader sensorReader;

    public CalculateSensorsDataAndDisplayResults(SensorReader sensorReader){
        this.sensorReader = sensorReader;
        sensorReader.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("The weather is going to be: ");
        if (pressureNow > pressureBefore) {
            System.out.println("better");
        } else if (pressureNow < pressureBefore) {
            System.out.println("worst");
        } else {
            System.out.println("same");
        }
    }

    @Override
    public void update(double pressure) {
        pressureBefore = pressureNow;
        pressureNow = pressure;

        display();
    }
}
