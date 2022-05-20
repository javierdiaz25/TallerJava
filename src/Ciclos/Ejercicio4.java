package Ciclos;

import java.util.Scanner;

public class Ejercicio4 {
    private static Scanner input = new Scanner(System.in);
    private static Integer i, num, resul;

    public static void main(String[] args) {
        capturarNumero();
        imprimirTabla();
    }

    private static void capturarNumero() {
        System.out.println("Ingrese el numero del cual desea ver la tabla");
        num =  input.nextInt();
    }

    private static void imprimirTabla() {
        for (i=1;i<=10;i++) {
            resul = i * num;
            System.out.println(i + " x " + num + " = " + resul);
        }
    }
}
