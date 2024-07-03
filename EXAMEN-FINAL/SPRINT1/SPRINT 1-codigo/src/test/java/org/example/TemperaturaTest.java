package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperaturaTest {

    @Test
    public void testIsHigh() {
        Temperatura temp = new Temperatura(35);
        assertTrue(temp.esMayorQue(), "Temperatura de 35°C debería ser considerada alta");

        temp.setValor(25);
        assertFalse(temp.esMayorQue(), "Temperatura de 25°C no debería ser considerada alta");
    }
}
