package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CondicionesClimaticasFakeTest {

    @Test
    public void testVerificarCondiciones() {
        // Capturar la salida de la consola
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Crear el fake con condiciones específicas
        CondicionesClimaticasFake condiciones = new CondicionesClimaticasFake(35, 25, 55);
        condiciones.verificarCondiciones();
        /*
        // Verificar la salida esperada
        String expectedOutput = "Alerta: Temperatura Alta!\nAlerta: Lluvia Intensa!\nAlerta: Viento Fuerte!\n";
        assertEquals(expectedOutput, outContent.toString());

         */
    }
}
