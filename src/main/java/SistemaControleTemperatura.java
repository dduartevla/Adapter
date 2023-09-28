public class SistemaControleTemperatura {

    private ISensor sensorC;
    private ISensor sensorT;
    private ISensor sensorTAdapter;
    private ISensor sensorF;
    private ISensor sensorFAdapter;

    public SistemaControleTemperatura(){

        sensorC = new SensorCelsius();
        sensorT = new SensorTensao();
        sensorF = new SensorFahrenheit();

        sensorFAdapter = new SensorFahrenheitAdapter(sensorF);
        sensorTAdapter = new SensorTensaoAdapter(sensorT);
    }

    public String getLeituras(){
        double leituraSensorC;
        double leituraSensorF;
        double leituraSensorT;

        leituraSensorC = sensorC.leitura();
        leituraSensorT = sensorTAdapter.leitura();
        leituraSensorF = sensorFAdapter.leitura();

        String leituras = "SensorC: " + leituraSensorC + "  SensorF: " + leituraSensorF+ "  SensorT: " +leituraSensorT;

        return leituras;
    }

    public void calibrarSensores(double base){
        sensorC.calibrarSensor(base);
        sensorFAdapter.calibrarSensor(base);
        sensorTAdapter.calibrarSensor(base);
    }
}
