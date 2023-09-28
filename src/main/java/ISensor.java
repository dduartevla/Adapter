public interface ISensor {

    double leitura(double analogRead);
    void calibrarSensor(double baseCalibracao, double leitura);
}
