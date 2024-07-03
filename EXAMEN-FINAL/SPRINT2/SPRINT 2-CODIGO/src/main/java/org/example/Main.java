package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer valores de temperatura, lluvia y viento desde la consola
        System.out.print("Ingrese la temperatura (en grados Celsius): ");
        double temperatura = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de lluvia (en mm): ");
        double lluvia = scanner.nextDouble();

        System.out.print("Ingrese la velocidad del viento (en km/h): ");
        double viento = scanner.nextDouble();

        // Crear instancias de las condiciones climáticas con los valores ingresados
        Temperatura temp = new Temperatura(temperatura);
        Lluvia lluviaObj = new Lluvia(lluvia);
        Viento vientoObj = new Viento(viento);

        // Evaluar las condiciones y generar alertas
        if (temp.esMayorQue()) {
            System.out.println("Alerta: Temperatura Alta!");
        }
        if (lluviaObj.esMayorQue()) {
            System.out.println("Alerta: Lluvia Intensa!");
        }
        if (vientoObj.esMayorQue()) {
            System.out.println("Alerta: Viento Fuerte!");
        }

        scanner.close();
    }
}
