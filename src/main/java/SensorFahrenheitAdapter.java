public class SensorFahrenheitAdapter extends SensorCelsius implements ISensor{

    private ISensor sensorF;

    public SensorFahrenheitAdapter(ISensor sensorF){
        this.sensorF = sensorF;
    }

    private double coverteParaCelsius(double temp){
        return (double) ((temp-32)/1.8);
    }


    public double leitura() {
        double leituraTemperaturaEmCelsius;

        leituraTemperaturaEmCelsius = coverteParaCelsius(sensorF.leitura());

        return leituraTemperaturaEmCelsius;
    }


    public void calibrarSensor(double base) {
        sensorF.calibrarSensor((base*1.8)+32);
    }

}
