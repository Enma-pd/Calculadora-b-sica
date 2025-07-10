package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testLimpiar() {
        Calculadora cut = new Calculadora();
        cut.sumar(4.2);
        cut.limpiar();
        double valorActual = cut.getTotal();
        assertEquals(0, valorActual);
    }
}
