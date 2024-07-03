package org.example;

public class TemperaturaStub extends Temperatura {
    public TemperaturaStub(int valor) {
        super(valor);
    }

    @Override
    public boolean esMayorQue() {
        return getValor() > 30; // Simula alta temperatura
    }
}