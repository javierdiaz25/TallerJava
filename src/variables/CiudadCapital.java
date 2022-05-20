package variables;

import java.util.Scanner;

/**
 * Realizar un programa el cual solicite el nombre de una ciudad capital y el país.
 * Al finalizar debe imprimir en pantalla el siguiente mensaje "La ciudad [Nombre de la Ciudad],
 * es la capital del país [Nombre del País]
 *
 * @author Javier Diaz <javier.ingsistema@gmail.com>
 */

public class CiudadCapital {

    private static String nombreCiudad, nombreCapital;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escriba nombre de la ciudad capital");
        nombreCiudad = input.nextLine();

        System.out.println("Escriba nombre del pais");
        nombreCapital = input.nextLine();

         imprimirCiudad();
    }

    private static void imprimirCiudad(){
        System.out.println("La ciudad " + nombreCiudad + ", es la capital del pais " + nombreCapital);
    }
}
