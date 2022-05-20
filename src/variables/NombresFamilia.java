package variables;

import java.util.Scanner;

/**
 *
 * Realizar un programa el cual solicite su nombre y apellidos, también debe capturar nombre y apellidos de su padre y madre.
 * Al finalizar debe imprimir en pantalla el siguiente mensaje "Yo [Nombre Completo], soy hijo de [Nombre de la Madre] y
 * [Nombre del Padre].
 *
 * @author Javier Diaz <javier.ingsistema@gmail.com>
 */

public class NombresFamilia {

    private static String nombre, apellidos, nombrePadre, apellidoPadre, nombreMadre, apellidoMadre;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escriba su nombre");
        nombre = input.nextLine();

        System.out.println("Escriba su apellido");
        apellidos = input.nextLine();

        System.out.println("Escriba nombre del padre");
        nombrePadre = input.nextLine();

        System.out.println("Escriba apellido del padre");
        apellidoPadre = input.nextLine();

        System.out.println("Escriba nombre de la madre");
        nombreMadre = input.nextLine();

        System.out.println("Escriba apellido de la madre");
        apellidoMadre = input.nextLine();

        imprimirNombres();

    }

    private static void imprimirNombres(){
        System.out.println("Yo " + nombre + " " + apellidos + ", soy hijo de " + nombreMadre+ " " + apellidoMadre + " y " + nombrePadre + " " + apellidoPadre);
    }
}
