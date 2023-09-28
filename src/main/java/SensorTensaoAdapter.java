public class SensorTensaoAdapter extends SensorCelsius implements ISensor{
    private ISensor sensorT;

    public SensorTensaoAdapter(ISensor sensorT){
        this.sensorT = sensorT;
    }

    private double coverteParaCelsius(double temp){
        return temp/10;
    }

    public double leitura() {
        double leituraTensaoemCelsius;

        leituraTensaoemCelsius = coverteParaCelsius(sensorT.leitura());

        return leituraTensaoemCelsius;
    }


    public void calibrarSensor(double base) {

        sensorT.calibrarSensor(base*10.0);
    }
}
