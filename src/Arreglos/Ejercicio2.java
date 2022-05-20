package Arreglos;

import java.util.Scanner;

public class Ejercicio2 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[] numeros = new Integer[20];

        rellenarAleatoriamente(numeros);
        mostrarNumerosPares(numeros);
        mostrarNumerosImpares(numeros);


    }

    private static void rellenarAleatoriamente(Integer[] lista) {
        for (Integer i=0; i< lista.length; i++) {
            lista[i] = (int) (Math.floor(Math.random()*100)+1);
        }
    }

    private static void mostrarNumerosPares(Integer[] lista) {
        Integer i;
        i=0;
        System.out.print("Numeros pares: ");
        while (i<lista.length) {
            if (lista[i]%2==0) {
                System.out.print(lista[i] + ", ");
            }
            i++;
        }
        System.out.println();
    }

    private static void mostrarNumerosImpares(Integer[] lista) {
        Integer i;
        i=0;
        System.out.print("Numeros impares: ");
        while (i<lista.length) {
            if (lista[i]%2==1) {
                System.out.print(lista[i] + ", ");
            }
            i++;
        }
    }
}
