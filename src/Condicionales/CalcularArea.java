package Condicionales;

import java.util.Scanner;

public class CalcularArea {

    private static Scanner input = new Scanner(System.in);
    private static Float base1, base2, altura, valorArea;

    public static void main(String[] args) {

        Integer opcion;

        opcion = mostrarMenu();
        evaluarOpcionMostrarMenu(opcion);

    }

    private static Integer mostrarMenu() {
        System.out.println("Que area desea calcular?");
        System.out.println("1. Area de un rectangulo");
        System.out.println("2. Area de un triangulo");
        System.out.println("3. Area de un Trapecio");
        return input.nextInt();

    }

    private static void evaluarOpcionMostrarMenu(Integer opcion) {
        switch (opcion) {
            case 1:
                System.out.println("El area de un rectangulo es igual a:");
                System.out.println("base * altura");
                evaluarAreaRectangulo();
                break;
            case 2:
                System.out.println("El area de un triangulo es igual a:");
                System.out.println("(base * altura) / 2");
                evalularAreaTriangulo();
                break;
            case 3:
                System.out.println("El area de un trapecio es igual a:");
                System.out.println("((base1 + base2) * altura) / 2");
                evaluarAreaTrapcio();
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    private static void evaluarAreaRectangulo() {
        System.out.println("Ingrese la base");
        base1 = input.nextFloat();
        System.out.println("Ingrese la altura");
        altura = input.nextFloat();

        valorArea = base1 * altura;

        System.out.println("El area del rectangulo es de: " + valorArea);
    }

    private static void evalularAreaTriangulo() {
        System.out.println("Ingrese la base");
        base1 = input.nextFloat();
        System.out.println("Ingrese la altura");
        altura = input.nextFloat();

        valorArea = (base1 * altura) / 2;

        System.out.println("El area del triangulo es de: " + valorArea);
    }

    private static void evaluarAreaTrapcio() {
        System.out.println("Ingrese la base 1");
        base1 = input.nextFloat();
        System.out.println("Ingrese la base 2");
        base2 = input.nextFloat();
        System.out.println("Ingrese la altura");
        altura = input.nextFloat();

        valorArea = ((base1 + base2) * altura) /2;

        System.out.println("El area del trapecio es de: " + valorArea);
    }
}
