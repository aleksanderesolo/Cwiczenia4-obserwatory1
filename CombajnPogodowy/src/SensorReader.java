import java.util.ArrayList;
import java.util.Observer;

public class SensorReader implements SensorsSubject{

    private double temperature;
    private double humidity;
    private double pressure;

    ArrayList<SensorsObserver> sensorsObserver;

    public SensorReader(){
        sensorsObserver = new ArrayList<>();
    }

    public void SetMeasurements(double temperature, double humidity, double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }

    @Override
    public void registerObserver(SensorsObserver o) {
        sensorsObserver.add(o);
    }

    @Override
    public void removeObserver(SensorsObserver o) {
        sensorsObserver.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (SensorsObserver o : sensorsObserver)
        {
            o.update(temperature, humidity, pressure);
        }
    }
}
