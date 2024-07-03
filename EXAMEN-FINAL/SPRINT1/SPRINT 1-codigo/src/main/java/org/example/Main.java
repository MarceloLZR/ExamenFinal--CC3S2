package org.example;


public class Main {

    public static void main(String[] args) {
        // Crear instancias de las condiciones climáticas con valores específicos
        Temperatura temp = new Temperatura(35);
        Lluvia lluvia = new Lluvia(25);
        Viento viento = new Viento(55);

        // Evaluar las condiciones y generar alertas
        if (temp.esMayorQue()) {
            System.out.println("Alerta: Temperatura Alta!");
        }
        if (lluvia.esMayorQue()) {
            System.out.println("Alerta: Lluvia Intensa!");
        }
        if (viento.esMayorQue()) {
            System.out.println("Alerta: Viento Fuerte!");
        }
    }
}

