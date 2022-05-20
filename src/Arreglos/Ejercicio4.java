package Arreglos;

import java.util.Scanner;

public class Ejercicio4 {

    private static final Scanner input = new Scanner(System.in);
    private static Integer i;


    public static void main(String[] args) {
        i = 1;

        Integer[][] numeros = new Integer[4][5];

        imprimirNumeros();
        rellenarArreglo(numeros);
        System.out.println("Presione caalquier tecla para imprimir solucion");
        input.nextLine();
        imprimirSolucionArreglo(numeros);

    }

    private static void imprimirNumeros() {
        int j;
        j=1;
        for (int f = 0; f <= 3; f++) {
            for (int c = 0; c <= 4; c++) {
                if (j<10) {
                    System.out.print("0" + j + " ");
                }
                else {
                    System.out.print(j + " ");
                }
                j++;
            }
            System.out.println();
        }
    }

    private static void imprimirSolucionArreglo(Integer[][] lista) {
        for (int f = 0; f <= 3; f++) {
            for (int c = 0; c <= 4; c++) {
                if (lista[f][c] < 10) {
                    System.out.print("0" + lista[f][c] + " ");
                } else {
                    System.out.print(lista[f][c] + " ");
                }
                i++;
            }
            System.out.println();
        }
    }

    private static void rellenarArreglo(Integer[][] lista) {
        for (int f = 0; f <= 3; f++) {
            if (f == 1 || f == 3) {
                for (int c = 4; c >= 0; c--) {
                    lista[f][c] = i;
                    i++;
                }
            } else {
                for (int c = 0; c <= 4; c++) {
                    lista[f][c] = i;
                    i++;
                }
            }
        }
    }


}
