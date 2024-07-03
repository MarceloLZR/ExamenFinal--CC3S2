package org.example;

public class Lluvia {
    // Cantidad de lluvia en milímetros
    private double cantidad;

    // Constructor que inicializa la cantidad de lluvia con el valor proporcionado
    public Lluvia(double cantidad) {
        this.cantidad = cantidad;
    }

    // Método para obtener la cantidad de lluvia
    public double getCantidad() {
        return cantidad;
    }

    // Método para establecer la cantidad de lluvia
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Método para verificar si la cantidad de lluvia está por encima de un umbral
    public boolean esMayorQue() {
        return cantidad > 20; //umbra de ejemplo lluvia
    }
}