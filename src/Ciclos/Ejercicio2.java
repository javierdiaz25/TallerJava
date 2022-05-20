package Ciclos;

public class Ejercicio2 {

    private static Integer i,j;

    public static void main(String[] args) {
        imprimirFigura();
    }

    private static void imprimirFigura() {
        for(i = 10; i >= 1; i--) {
            for(j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(j = i; j <= 10; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
