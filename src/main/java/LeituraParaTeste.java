public class LeituraParaTeste {
    private LeituraParaTeste() {};
    private static LeituraParaTeste instance = new LeituraParaTeste();
    public static LeituraParaTeste getInstance() {
        return instance;
    }

    private double sensorRead;

    public double getSensorRead() {
        return sensorRead;
    }

    public void setSensorRead(double sensorRead) {
        this.sensorRead = sensorRead;
    }
}
