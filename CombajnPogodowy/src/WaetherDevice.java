//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WaetherDevice {
    public static void main(String[] args) {
        SensorReader sensorReaderPredict = new SensorReader();
        PrzeliczIwyswietlWyniki przeliczPredykcjeIwyswietlWyniki = new PrzeliczIwyswietlWyniki(sensorReaderPredict);
        double pokazDomyslneCisnienie = przeliczPredykcjeIwyswietlWyniki.PokazDomyslneCisnienie();

        System.out.println();
        System.out.println("Domyslne cisnienie: " + pokazDomyslneCisnienie);
        sensorReaderPredict.SetMeasurements(10,40,1001);
        sensorReaderPredict.SetMeasurements(5,50,985);
        sensorReaderPredict.SetMeasurements(25,60,985);
        sensorReaderPredict.SetMeasurements(0,70,1007);
    }
}