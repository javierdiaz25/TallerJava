package variables;

import java.util.Scanner;

/**
 * Realizar un programa el cual solicite el nombre de su mascota, edad de la mascota, el tipo de mascota y su nombre completo.
 * Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje: [Nombre de Mascota] es un(a) [Tipo de Mascota],
 * el cual, tiene [Edad de la Mascota] años de edad y [Nombre Completo] es actualmente su dueño(a).
 *
 * @author Javier Diaz <javier.ingsistema@gmail.com>
 */

public class Mascota {

    private static String nombreMascota, tipoMascota, nombrePersona;
    private static Integer edadMascota;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese nombre de la mascota");
        nombreMascota = input.nextLine();

        System.out.println("Ingrese tipo de mascota");
        tipoMascota = input.nextLine();

        System.out.println("Ingrese su nombre completo");
        nombrePersona = input.nextLine();

        System.out.println("Ingrese edad de la mascota");
        edadMascota = input.nextInt();


        imprimirMensaje();

    }

    private static void imprimirMensaje(){
        System.out.println(nombreMascota + " es un(a) " + tipoMascota + ", el cual, tiene " + edadMascota + "años de edad y " + nombrePersona + " es su actual dueño(a)");
    }
}

