package Arreglos;

import java.util.Scanner;

public class Ejercicio5 {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Integer[][] tabla = new Integer[10][10];

        rellenarArreglo(tabla);
        imprimirTabla();
        System.out.println();
        evalularTabla(tabla);

    }

    private static void rellenarArreglo(Integer[][] lista) {
        int i,j;
        i = 1;
        j = 1;

        for (int f = 0; f <= 9; f++) {
            for (int c = 0; c <= 9; c++) {
                  lista[f][c] = i*j;
                  i++;
            }
            i = 1;
            j++;
        }
    }

    private static void imprimirTabla() {
        System.out.println("     0    1    2    3    4    5    6    7    8    9");
        for (int f = 1; f <= 10; f++) {
            System.out.print(" " + (f-1)+ " ");
            for (int c = 1; c <= 10; c++) {
                if (f<10 && c<10) {
                    System.out.print(" " + f + "x" + c + " " );
                }
                else System.out.print(f + "x" + c + " ");
            }
            System.out.println();
        }
    }

    private static void evalularTabla(Integer[][] lista) {
        int resultado,f,c;

        System.out.println("Ingrese numero de fila");
        f = input.nextInt();
        System.out.println("Ingrese numero de columna");
        c= input.nextInt();

        resultado = lista[f][c];
        System.out.println("El resultado es: " + resultado);
    }

}
