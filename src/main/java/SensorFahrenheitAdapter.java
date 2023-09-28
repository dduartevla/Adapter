public class SensorFahrenheitAdapter extends SensorCelsius{

    private ISensor sensorF;

    public SensorFahrenheitAdapter(){
        sensorF = new SensorFahrenheit();
    }

    private double coverteParaCelsius(double temp){
        return (double) ((temp-32)/1.8);
    }


    public double lerTemperatura(double sensorRead) {
        double leituraTemperaturaEmCelsius;

        leituraTemperaturaEmCelsius = coverteParaCelsius(sensorF.leitura(sensorRead));

        return leituraTemperaturaEmCelsius;
    }


    public void calibrarSensor(double base, double sensorRead) {
        sensorF.calibrarSensor(base,sensorRead);
    }

}
