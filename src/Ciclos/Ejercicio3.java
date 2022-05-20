package Ciclos;

public class Ejercicio3 {

    public static void main(String[] args) {
        imprimirGrafico();
    }


    private static void imprimirGrafico() {
        int i, j, k;
        k = 1;

        for (i = 0; i <= 15; i++) {
            while (i < 11) {
                for (j = 10; j >= i; j--) {
                    System.out.print(" ");
                }
                for (j = 0; j <= (2 * i); j++) {
                    System.out.print("*");
                }
                System.out.println();
                i++;
            }

            while (i >= 12 & i <= 13) {
                for (j = 0; j <= 9; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= 3; j++) {
                    System.out.print("*");
                }
                System.out.println();
                i++;
            }

            while (i >= 14 & i <= 15) {
                for (j = 9; j >= k; j--) {
                    System.out.print(" ");
                }
                for (j = 0; j <= (2 * k) + 2; j++) {
                    System.out.print("*");
                }
                System.out.println();
                i++;
                k = k + 1;
            }
        }
    }
}

