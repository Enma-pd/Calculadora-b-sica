package es.cic.curso25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class CocheIntegrationTest{

    public Coche cut;

    @BeforeEach
    public void  setUp(){
       cut = new Coche();
    }

    @Test

    void testAcelerar(){
        cut.acelerar(34);
        int velocidadFinal = cut.acelerar(23);
        assertEquals(57, velocidadFinal);  
      }
    @Test
    void testFrenar(){
        cut.acelerar(34);
        int velocidadFinal = cut.frenar(23);
        assertEquals(11, velocidadFinal);  
    }
    @Test
    void testGetConsumo(){
        cut.acelerar(50);
        double consumoActual = cut.getConsumo();
        assertEquals(2.15, consumoActual);
    }
    @Test
    void testGetVelocidad(){
        cut.acelerar(50);
        int velocidadFinal = cut.getVelocidad();
        assertEquals(50, velocidadFinal);
    }

}
