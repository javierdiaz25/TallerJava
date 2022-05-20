package Ciclos.Ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Menu misUsuarios = new Menu();
        misUsuarios.inicializarArreglo();

        int codigo;

        do {
            codigo = opcionMenu();
            evaluarMenu(codigo, misUsuarios);
        } while (codigo != 4);

    }

    private static Integer opcionMenu() {
        Scanner inputInteger = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("Bienvenido, A continuacion elija una opcion");
        System.out.println("-------------------------------------------");
        System.out.println("1. Ingresar Vehiculo");
        System.out.println("2. Retirar Vehiculo");
        System.out.println("3. Consultar Vehiculo");
        System.out.println("4. Salir");
        System.out.println("-------------------------------------------");
        return inputInteger.nextInt();
    }

    public static void evaluarMenu(int opcion, Menu misUsuarios) {
        int contadorUsuario;

        contadorUsuario = misUsuarios.contadorObjeto + 1;

        switch (opcion) {
            case 1:

                if (misUsuarios.contadorObjeto < 8) {
                    System.out.println("Usuario:" + contadorUsuario);
                    misUsuarios.crearUsuario();
                } else System.out.println("El parqueadero está lleno");
                break;
            case 2:
                misUsuarios.eliminarUsuario();
                break;

            case 3:
                misUsuarios.mostrar();
                break;

            case 4:
                misUsuarios.salir();
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
}
