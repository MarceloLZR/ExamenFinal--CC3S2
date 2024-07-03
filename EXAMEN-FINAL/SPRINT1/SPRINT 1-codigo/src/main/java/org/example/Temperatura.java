package org.example;

public class Temperatura {
    // Valor de la temperatura en grados Celsius
    private double valor;

    // Constructor que inicializa la temperatura con el valor proporcionado
    public Temperatura(double valor) {
        this.valor = valor;
    }

    // Método para obtener el valor de la temperatura
    public double getValor() {
        return valor;
    }

    // Método para establecer el valor de la temparatura
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método para verificar si la temperatura está por encima de un umbral
    public boolean esMayorQue() {
        return valor > 30; //umbral de ejemplo temperatura
    }
}



