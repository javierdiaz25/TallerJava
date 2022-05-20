package Arreglos;

import java.util.Scanner;

public class Ejercicio1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = new int[5];

        rellenarArreglo(numeros);
        mostrarArreglo(numeros);
    }
    private static void rellenarArreglo(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Ingrese numero de posicion " + i);
            lista[i] = input.nextInt();
        }
    }
    public static void mostrarArreglo(int[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("[" + i + "] = " + lista[i]);
        }
    }
}
