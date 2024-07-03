package org.example;

import org.example.Viento;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VientoTest {

    @Test
    public void testIsStrong() {
        Viento viento = new Viento(55);
        assertTrue(viento.esMayorQue(), "Viento de 55km/h debería ser considerado fuerte");

        viento.setVelocidad(45);
        assertFalse(viento.esMayorQue(), "Viento de 45km/h no debería ser considerado fuerte");
    }
}

