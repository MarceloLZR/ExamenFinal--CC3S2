package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LluviaTest {

    @Test
    public void testIsIntense() {
        Lluvia lluvia = new Lluvia(25);
        assertTrue(lluvia.esMayorQue(), "Lluvia de 25mm debería ser considerada intensa");

        lluvia.setCantidad(15);
        assertFalse(lluvia.esMayorQue(), "Lluvia de 15mm no debería ser considerada intensa");
    }
}

