//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PredictingDevice {
    public static void main(String[] args) {

        SensorReader sensorReader = new SensorReader();
        CalculateSensorsDataAndDisplayResults calculateSensorsDataAndDisplayResults = new CalculateSensorsDataAndDisplayResults(sensorReader);

        sensorReader.SetMeasurements(10,60,1001);
        sensorReader.SetMeasurements(10,60,985);
        sensorReader.SetMeasurements(10,60,985);
        sensorReader.SetMeasurements(10,60,1007);
    }
}