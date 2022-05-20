package Ciclos.Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

       Menu misUsuarios = new Menu();
        misUsuarios.inicializarArreglo();

        int codigo;

        do {
            codigo = opcionMenu();
            evaluarMenu(codigo, misUsuarios);
        } while (codigo != 3);


    }


    private static Integer opcionMenu() {
        Scanner inputInteger = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("Bienvenido a la escuela automovilistica, A continuacion elija una opcion");
        System.out.println("-------------------------------------------");
        System.out.println("1. Registrar ingreso de usuarios");
        System.out.println("2. Consultar usuarios y resultados");
        System.out.println("3. Salir");
        System.out.println("-------------------------------------------");
        return inputInteger.nextInt();
    }

    public static void evaluarMenu(int opcion, Menu misUsuarios) {

        int contadorUsuario;

        contadorUsuario = misUsuarios.contadorObjeto+1;

        switch (opcion) {
            case 1:
                if (misUsuarios.contadorObjeto < 8) {
                    System.out.println("Usuario:" + contadorUsuario);
                    misUsuarios.crearUsuario();
                }
                else System.out.println("No se aceptan mas usuarios");
                break;

            case 2:
                misUsuarios.mostrar();
                break;

            case 3:
                misUsuarios.salir();
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }
    }


}
