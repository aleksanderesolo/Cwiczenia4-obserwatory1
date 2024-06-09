public class DisplayCalculatedStatistics implements DisplayElement, SensorsObserver {

    private double maximalTemperature = 0;
    private double minimalTemperature = 200;
    private int raedingCount;
    private double addedTemperatures = 0;
    private SensorsReader sensorsReader;

    public DisplayCalculatedStatistics(SensorsReader sensorReader) {
        this.sensorsReader = sensorReader;
        sensorsReader.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Average temperature = " + (addedTemperatures / raedingCount));
        System.out.println("Minimal temperature = " + minimalTemperature);
        System.out.println("Maximal temperature = " + maximalTemperature);
        System.out.println();
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        raedingCount++;
        addedTemperatures += temperature;

        if (temperature < minimalTemperature) { minimalTemperature = temperature; }
        if (temperature > maximalTemperature) { maximalTemperature = temperature; }

        display();
    }
}
