package Condicionales;

import java.util.Scanner;

/**
 *
 * La video tienda que presta sus servicios de alquiler de películas a los usuarios del barrio el Porvenir, requiere de una
 * aplicación que permita registrar el alquiler de las películas que adquieren sus usuarios. Para cada usuario se debe permitir
 * la opción de alquilar película, consultar películas disponibles y recibir película en la video tienda con la opción de realizar
 * anotaciones sobre estas si se llegan a presentar daños u otra novedad sobre la película.
 *
 * @author Javier Diaz <javier.ingsistema@gmail.com>
 */

public class VideoTienda {

    private static String nombreCliente, novedad;
    private static Integer opcion, valorAlquiler, opcionDevolver;

    private static Scanner input = new Scanner(System.in);
    private static Boolean detallePelicula,rsp;

    public static void main(String[] args) {

        nombreCliente = capturarNombre();
        opcion = capturarOpcion();
        opcionMenu(opcion);

        }
    private static String capturarNombre() {
        System.out.println();
        System.out.println("Bienvenido a la Video Tienda, para continuar por favor ingrese sus datos");
        System.out.println("Ingrese su nombre completo");
        return input.nextLine();
    }

    private static Integer capturarOpcion(){
        System.out.println("A continuacion elija una opcion");
        System.out.println("1. Consultar peliculas disponibles");
        System.out.println("2. Devolver pelicula");
        return input.nextInt();
    }

    private static void opcionMenu(Integer opcion) {
        switch  (opcion) {
            case 1:
                System.out.println("Las peliculas disponibles son las siguientes:");
                imprimirPeliculas();
                System.out.println("Desea alquilar alguna de nuestras peliculas? true = Si o false = No");
                rsp = input.nextBoolean();

                opcionRespuestaAlquiler(rsp);

                break;
            case 2:
                System.out.println("Que pelicula desea devolver");
                imprimirPeliculas();
                opcionDevolver = input.nextInt();

                detallePelicula = capturarNovedad();
                novedadPelicula(detallePelicula);

                break;
            default:
                System.out.println("Opcion no valida");
        }

    }

    private static void imprimirPeliculas(){
        System.out.println("1. Rapido y Furioso 9");
        System.out.println("2. Jefe en pañales 2");
        System.out.println("3. El paseo 6");
        System.out.println("");
    }

    private static Integer respuestaAlquiler() {
            System.out.println("Que pelicula desea alquilar?");
            System.out.println("1. Rapido y Furioso 9");
            System.out.println("2. Jefe en pañales 2");
            System.out.println("3. El paseo 6");
            return input.nextInt();
    }

    private static Integer capturarValorAlquiler() {
        System.out.println( "El Alquiler de la pelicula tiene un costo de 2000 x dia");
        System.out.println("Por cuantos dias desea alquilar la pelicula?");
        return input.nextInt();
    }

    private static void imprimirValorAlquiler (String pelicula){
        valorAlquiler = capturarValorAlquiler() * 2000;
        System.out.println("El valor total del alquiler de la pelicula " + pelicula +" señor " + nombreCliente + " es de " + valorAlquiler);
    }

    private static Boolean capturarNovedad() {
        System.out.println("La pelicula presenta algun daño?");
        return input.nextBoolean();
    }

    private static String novedadPelicula(Boolean rspDetalle) {
        if (rspDetalle == true) {
            System.out.println("por favor detalle la novedad");
            return input.next();
        }
        else {
            System.out.println("Ok, muchas gracias por preferirnos");
            System.out.println("Vuelva pronto!");
        }
        return null;
    }

    private static String opcionRespuestaAlquiler (Boolean respuesta) {
        if (respuesta == true) {
            switch (respuestaAlquiler()) {
                case 1:
                    imprimirValorAlquiler("Rapido y Furioso 9");
                    break;
                case 2:
                    imprimirValorAlquiler("Jefe en pañales 2");
                    break;
                case 3:
                    imprimirValorAlquiler("El paseo 6");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
        else {
            System.out.println("Muchas gracias por visitarnos, hasta luego");
        }
        return null;
    }


}
