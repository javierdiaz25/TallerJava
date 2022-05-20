package Condicionales;

import java.util.Scanner;

/**
 * Realizar un programa en el cual se solicite la edad de una persona. Si la persona es menor a 18 años,
 * deberá mostrar en pantalla: Usted aún es un niño(a).
 *
 * @author Javier Diaz <javier.ingsistema@gmail.com>
 */

public class EdadMenor{

    private static Integer edadPersona;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        edadPersona = input.nextInt();

        imprimirMensaje();
    }

    private static void imprimirMensaje(){
        if (edadPersona < 18) {
            System.out.println("Usted aún es un niño(a).");
        }
    }

}

