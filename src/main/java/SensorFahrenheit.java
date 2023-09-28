public class SensorFahrenheit implements ISensor {
    double calibracao;

    public SensorFahrenheit(){
        this.calibracao = 0;
    }

    public double leitura(){ //simula as leituras diferentes em cada sensor
        double tensaoSaida = (LeituraParaTeste.getInstance().getSensorRead() * 5000) / 1024;
        double temperaturaLida = (double) (((tensaoSaida/10) * 1.8) + 32);
        temperaturaLida = temperaturaLida + calibracao;
        return temperaturaLida;
    }

    public void calibrarSensor(double baseCalibracao){ //simula calibrar o sensor
        this.calibracao = baseCalibracao - leitura();
    }
}
