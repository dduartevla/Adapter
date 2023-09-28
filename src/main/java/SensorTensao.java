public class SensorTensao implements ISensor{

    double calibracao;

    public SensorTensao(){
        this.calibracao = 0;
    }

    @Override
    public double leitura(double analogRead) {
        double tensaoSaida = ((analogRead * 5000) / 1024) + calibracao;
        return tensaoSaida;
    }

    @Override
    public void calibrarSensor(double baseCalibracao, double leituraTensao) {
        calibracao = baseCalibracao - leituraTensao;
    }
}
