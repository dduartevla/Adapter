import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SistemaControleTemperaturaTest {

    double baseCalibracao;
    SistemaControleTemperatura sct;

    @BeforeEach
    void setUp(){
        baseCalibracao = 34;
        sct = new SistemaControleTemperatura();
        LeituraParaTeste.getInstance().setSensorRead(61.44);
    }

    @Test
    void deveRetornarLeiturasIguaisSemCalibrar(){
        assertEquals("SensorC: 30.0" + "  SensorF: 30.0" + "  SensorT: 30.0"
                ,sct.getLeituras());
    }

    @Test
    void deveRetornarLeiturasIguaisAposCalibrar(){
        sct.calibrarSensores(baseCalibracao);
        assertEquals("SensorC: 34.0" + "  SensorF: 34.0" + "  SensorT: 34.0"
                ,sct.getLeituras());
    }


}