package Arreglos;

import java.util.Scanner;

public class Ejercicio3 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] numeros = new Integer[1000];
        mostrarNumerosPrimos(numeros);

    }

    private static void rellenarArreglo(Integer[] lista) {
        for (Integer i = 0; i < lista.length; i++) {
            lista[i] = i;
        }
    }

    private static void mostrarNumerosPrimos(Integer[] lista) {
        Integer j, k;

        for (int i = 0; i < lista.length; i++) {
            lista[i] = i + 1;

            j = 1;
            k = 0;

            while (j <= lista[i]) {
                if (lista[i] % j == 0) {
                    k++;
                }
                j++;
            }

            if (k==2) {
                System.out.println("El numero " + lista[i] + " es primo");
            }

        }
    }
}
