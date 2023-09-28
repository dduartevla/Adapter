public class SensorCelsius{
    double calibracao;

    public SensorCelsius(){
        this.calibracao = 0;
    }

    public double leitura(double analogRead){
        double tensaoSaida = (analogRead * 5000) / 1024;
        double temperaturaLida = tensaoSaida/10 + calibracao;
        return temperaturaLida;
    }

    public void calibrarSensor(double baseCalibracao, double leitura){ //simula calibrar o sensor
        calibracao = baseCalibracao - leitura(leitura);
    }
}
