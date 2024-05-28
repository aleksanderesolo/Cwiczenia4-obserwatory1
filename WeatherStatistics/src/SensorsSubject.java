public interface SensorsSubject {
    public void registerObserver(SensorsObserver o);
    public void removeObserver(SensorsObserver o);
    public void notifyObservers();
}
