package Condicionales;

import java.util.Scanner;

public class Banco {

    private static Scanner input = new Scanner(System.in);
    private static String nombreCliente;
    private static Integer numeroCuenta, saldoCuenta;


    public static void main(String[] args) {
        saldoCuenta = 500000;
        nombreCliente = captuarNombre();
        numeroCuenta = capturarNumeroCuenta();
        evaluarOpcionMenu(capturarOpcionMenu());

    }

    private static String captuarNombre() {
        System.out.println("Bienvenido a su Banco Fiel");
        System.out.println("--------------------------");
        System.out.println("Por favor ingrese su nombre completo");
        return input.nextLine();
    }

    private static Integer capturarNumeroCuenta() {
        System.out.println("Digite numero de cuenta");
        return input.nextInt();
    }

    private static void mostrarDatosCliente() {
        System.out.println("Bienvenido de nuevo señor(a) " + nombreCliente);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual: " + saldoCuenta);
    }

    private static Integer capturarOpcionMenu() {
        System.out.println("Que tarea desea realizar?");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Consultar saldo");
        return input.nextInt();
    }

    private static void evaluarOpcionMenu(Integer opc) {
        Integer valorIngresado;
        valorIngresado = 0;

        switch (opc) {
            case 1:
                mostrarDatosCliente();
                ingresarDinero(valorIngresado);
                break;
            case 2:
                mostrarDatosCliente();
                retirarDinero(valorIngresado);
                break;
            case 3:
                mostrarDatosCliente();
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    private static void ingresarDinero(Integer valor) {
        System.out.println("Cuanto dinero va a ingresar");
        valor = input.nextInt();
        saldoCuenta = saldoCuenta + valor;
        System.out.println("Su nuevo saldo es de: " + saldoCuenta);
        System.out.println("Hasta luego");
    }

    private static void retirarDinero(Integer valor) {
        System.out.println("Cuanto dinero va a retirar");
        valor = input.nextInt();
        saldoCuenta = saldoCuenta - valor;
        System.out.println("Su nuevo saldo es de: " + saldoCuenta);
        System.out.println("Hasta luego");
    }
}
