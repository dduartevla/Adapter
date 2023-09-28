public class SensorFahrenheit implements ISensor {
    double calibracao;

    public SensorFahrenheit(){
        this.calibracao = 0;
    }

    public double leitura(double analogRead){ //simula as leituras diferentes em cada sensor
        double tensaoSaida = (analogRead * 5000) / 1024;
        double temperaturaLida = (double) (((tensaoSaida/10) * 1.8) + 32);
        temperaturaLida = temperaturaLida + calibracao;
        return temperaturaLida;
    }

    public void calibrarSensor(double baseCalibracao, double leitura){ //simula calibrar o sensor
        this.calibracao = baseCalibracao - leitura(leitura);
    }
}
