package Condicionales;

import java.util.Scanner;

/**
 * Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona. Si la persona es mayor o igual a 18 años,
 * entonce se deberá imprimir en pantalla [Nombre completo] usted es mayor de edad, por lo tanto puede entrar a la fiesta.
 * Si la edad de la persona es menor que 18 años, entonces, deberá imprimirse el siguiente mensaje: [Nombre completo] usted
 * es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.
 *
 * @author Javier Diaz <javier.ingsistema@gmail.com>
 */

public class EdadMayorMenor {

    private static String nombrePersona, apellidoPersona;
    private static Integer edadPersona;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        nombrePersona = input.nextLine();

        System.out.println("Ingrese su apellido");
        apellidoPersona = input.nextLine();

        System.out.println("Ingrese su edad");
        edadPersona = input.nextInt();

        imprimirMensaje();
    }

    private static void imprimirMensaje(){
        if (edadPersona >= 18) {
            System.out.println(nombrePersona + " " + apellidoPersona + " usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        }
        else {
            System.out.println(nombrePersona + " " + apellidoPersona + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");

        }
    }
}
