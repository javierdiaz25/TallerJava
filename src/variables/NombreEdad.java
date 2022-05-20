package variables;

import java.util.Scanner;

/**
 * Realizar un programa el cual solicite su nombre, apellidos, edad y estatura.
 *
 * @author Javier Diaz <javier.ingsistema@gmail.com>
 */
public class NombreEdad {
        private static String nombre, apellido;
        private static Integer edad;
        private static Double estatura;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Ingrese su nombre ");
            nombre = input.nextLine();

            System.out.println("Ingrese su apellido ");
            apellido = input.nextLine();

            System.out.println("Ingrese su edad ");
            edad = input.nextInt();

            System.out.println("Ingrese su estatura ");
            estatura = input.nextDouble();

            imprimirResultado();

        }

        private static void imprimirResultado(){
            System.out.println("Usted se llama " + nombre + " " + apellido + " su edad es " + edad + " y su estatura es " + estatura);

        }

    }
