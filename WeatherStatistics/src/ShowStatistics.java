public class ShowStatistics {
    public static void main(String[] args) {

        SensorsReader sensorReader = new SensorsReader();
        CalculateSensorsDataAndDisplayResults calculateSensorsDataAndDisplayResults = new CalculateSensorsDataAndDisplayResults(sensorReader);

        sensorReader.SetMeasurements(5,60,1001);
        sensorReader.SetMeasurements(15,60,985);
        sensorReader.SetMeasurements(0,60,985);
        sensorReader.SetMeasurements(25,60,1007);
    }
}