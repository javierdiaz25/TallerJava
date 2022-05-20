package Ciclos.Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Menu misContactos = new Menu();
        misContactos.inicializarArreglo();

        int codigo;

        do {
            codigo = opcionMenu();
            evaluarMenu(codigo,misContactos);
        } while (codigo != 4);


    }

    private static Integer opcionMenu() {
        Scanner inputInteger = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("Bienvenido, A continuacion elija una opcion");
        System.out.println("-------------------------------------------");
        System.out.println("1. Crear contacto");
        System.out.println("2. Mostrar contactos");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Salir");
        System.out.println("-------------------------------------------");
        return inputInteger.nextInt();
    }

    public static void evaluarMenu(int opcion, Menu misContactos) {
        int contadorUsuario;

        contadorUsuario = misContactos.contadorObjeto+1;

        switch (opcion) {
            case 1:
                if (misContactos.contadorObjeto < 3) {
                    System.out.println("Usuario:" + contadorUsuario);
                    misContactos.crearContacto();
                } else {
                    System.out.println("No se aceptan mas contactos");
                }

                break;

            case 2:
                misContactos.Mostrar();
                break;

            case 3:
                misContactos.eliminarContacto();
                break;

            case 4:
                misContactos.salir();
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

}
