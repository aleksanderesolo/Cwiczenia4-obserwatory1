import java.util.ArrayList;

public class SensorsReader implements SensorsSubject{

    private double temperature;
    private double humidity;
    private double pressure;

    ArrayList<SensorsObserver> sensorsObservers;

    public SensorsReader(){
        sensorsObservers = new ArrayList<>();
    }

    public void SetMeasurements(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }


    @Override
    public void registerObserver(SensorsObserver o) {
        sensorsObservers.add(o);
    }

    @Override
    public void removeObserver(SensorsObserver o) {
        sensorsObservers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (SensorsObserver o : sensorsObservers)
        {
            o.update(temperature);
        }
    }
}
