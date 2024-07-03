
package org.example;

public class VientoStub extends Viento {
    public VientoStub(int valor) {
        super(valor);
    }

    @Override
    public boolean esMayorQue() {
        return getVelocidad() > 50; // Simula viento fuerte
    }
}