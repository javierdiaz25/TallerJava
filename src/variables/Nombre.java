package variables;

import java.util.Scanner;

/**
 * Realizar un programa el cual solicite su nombre y apellidos.
 *
 * @author Javier Diaz <javier.ingsistema@gmail.com>
 */

public class Nombre {
    private static String nombre, apellido;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre ");
        nombre = input.nextLine();
        System.out.println("Ingrese su apellido ");
        apellido = input.nextLine();

        imprimirResultado();

    }

    private static void imprimirResultado(){
        System.out.println("Usted se llama " + nombre + " " + apellido);

    }

}