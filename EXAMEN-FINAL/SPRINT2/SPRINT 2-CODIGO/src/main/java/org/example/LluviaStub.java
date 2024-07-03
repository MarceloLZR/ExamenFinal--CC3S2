
package org.example;

public class LluviaStub extends Lluvia {
    public LluviaStub(int valor) {
        super(valor);
    }

    @Override
    public boolean esMayorQue() {
        return getCantidad() > 20; // Simula lluvia intensa
    }
}