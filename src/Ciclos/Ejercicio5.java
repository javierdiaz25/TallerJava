package Ciclos;

import java.util.Scanner;

public class Ejercicio5 {

    private static final Scanner inputInteger = new Scanner(System.in);
    private static final Scanner inputString = new Scanner(System.in);

    public static void main(String[] args) {

        Integer opcionMenu;
        opcionMenu = 1;

        while (opcionMenu!=3) {
            opcionMenu = imprimirMenu();
            evaluarOpcionMenu(opcionMenu);
        }
    }

    private static Integer imprimirMenu() {
        System.out.println("Menu de usuario");
        System.out.println("1. Capturar nombre");
        System.out.println("2. Saludar persona");
        System.out.println("3. Salir del sistema");
        return inputInteger.nextInt();
    }

    private static void evaluarOpcionMenu(Integer opcion) {
        String nombre;

        switch (opcion) {
            case 1 -> {
                nombre = capturarNombre();
                System.out.println(nombre + " su nombre ha sido guardado correctamente");
            }
            case 2 -> {
                nombre = capturarNombre();
                System.out.println("Hola " + nombre);
            }
            case 3 -> System.out.println("Hasta luego");
            default -> System.out.println("Opcion invalida");
        }
    }
    private static String capturarNombre() {
        System.out.println("Ingrese su nombre");
        return inputString.nextLine();
    }

}
