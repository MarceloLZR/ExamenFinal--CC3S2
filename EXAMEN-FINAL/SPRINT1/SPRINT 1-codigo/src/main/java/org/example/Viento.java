package org.example;

public class Viento {
    // Velocidad del viento en kilómetros por hora
    private double velocidad;

    // Constructor que inicializa la velocidad del viento con el valor proporcionado
    public Viento(double velocidad) {
        this.velocidad = velocidad;
    }

    // Método para obtener la velocidad del viento
    public double getVelocidad() {
        return velocidad;
    }

    // Método para establecer la velocidad del viento
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    // Método para verificar si la velocidad del viento está por encima de un umbral
    public boolean esMayorQue() {
        return velocidad > 50; // umbral de ejemplo viento
    }
}