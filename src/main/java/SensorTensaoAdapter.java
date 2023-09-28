public class SensorTensaoAdapter extends SensorCelsius{
    private ISensor sensorT;

    public SensorTensaoAdapter(){
        sensorT = new SensorTensao();
    }

    private double coverteParaTensao(double temp){
        return (double) ((temp-32)/1.8);
    }


    public double lerTemperatura(double sensorRead) {
        double leituraTemperaturaTensao;

        leituraTemperaturaTensao = sensorRead *10;

        return sensorT.leitura(leituraTemperaturaTensao);
    }


    public void calibrarSensor(double base, double sensorRead) {
        sensorT.calibrarSensor(base,sensorRead);
    }
}
