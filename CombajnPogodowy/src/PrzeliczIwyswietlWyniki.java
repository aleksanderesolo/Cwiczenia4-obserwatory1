public class PrzeliczIwyswietlWyniki implements DisplayElement, SensorsObserver {

    private double temperature;
    private double humidity;
    private double pressure;

    private double pressureNow = 1000;
    private double pressureBefore;
    private SensorReader sensorReader;

    private double maximalTemperature = -500;
    private double minimalTemperature = 500;
    private int raedingCount;
    private double addedTemperatures = 0;

    public double PokazDomyslneCisnienie(){ return pressureNow; }

    public PrzeliczIwyswietlWyniki(SensorReader sensorReader){
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

        System.out.println("Temperatura: " + temperature + " / Wilgotnosc: " + humidity + " / Cisnienie: " + pressure );

        System.out.println("Sr.temperatura: " + (addedTemperatures / raedingCount) + " / Min.temperatura: " + minimalTemperature + " / Max.temperatura: " + maximalTemperature);

        System.out.println();
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        pressureBefore = pressureNow;
        pressureNow = pressure;

        raedingCount++;
        addedTemperatures += temperature;

        if (temperature < minimalTemperature) { minimalTemperature = temperature; }
        if (temperature > maximalTemperature) { maximalTemperature = temperature; }

        display();
    }
}
