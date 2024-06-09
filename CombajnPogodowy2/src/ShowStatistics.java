public class ShowStatistics {
    public static void main(String[] args) {

        SensorsReader sensorReader = new SensorsReader();
        DisplayResults calculateSensorsDataAndDisplayResults = new DisplayResults(sensorReader);
        DisplayCalculatedStatistics displayCalculatedStatistics = new DisplayCalculatedStatistics(sensorReader);
        DisplayCalculatedForecast displayCalculatedForecast = new DisplayCalculatedForecast(sensorReader);

        sensorReader.SetMeasurements(5,60,1001);
        sensorReader.SetMeasurements(15,60,985);
        sensorReader.SetMeasurements(0,60,985);
        sensorReader.SetMeasurements(25,60,1007);
    }
}