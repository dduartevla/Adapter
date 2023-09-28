public class SensorTensao implements ISensor{

    double calibracao;

    public SensorTensao(){
        this.calibracao = 0;
    }

    @Override
    public double leitura() {
        double tensaoSaida = ((LeituraParaTeste.getInstance().getSensorRead() * 5000) / 1024) + calibracao;
        return tensaoSaida;
    }

    @Override
    public void calibrarSensor(double baseCalibracao) {
        this.calibracao = baseCalibracao -leitura();
    }
}
