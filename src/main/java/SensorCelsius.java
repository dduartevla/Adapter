public class SensorCelsius implements ISensor{
    double calibracao;

    public SensorCelsius(){
        this.calibracao = 0;
    }

    public double leitura(){
        double tensaoSaida = (LeituraParaTeste.getInstance().getSensorRead() * 5000) / 1024;
        double temperaturaLida = tensaoSaida/10 + calibracao;
        return temperaturaLida;
    }

    public void calibrarSensor(double baseCalibracao){ //simula calibrar o sensor
        this.calibracao = baseCalibracao - leitura();
    }
}
