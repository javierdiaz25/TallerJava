package Condicionales;

import java.util.Scanner;

public class Pasteleria {

    private static Scanner input = new Scanner(System.in);
    private static String nombreCliente;

    public static void main(String[] args) {

        System.out.println("Bienvenido a la Pasterleria de Don carlos");
        System.out.println("-----------------------------------------");
        nombreCliente = registroClientes();
        respuestaOpcionMenu();
        opcionTortasDisponibles();

    }

    private static String registroClientes() {
        System.out.println("Ingrese su nombre completo");
        return input.nextLine();
    }

    private static void respuestaOpcionMenu() {
        System.out.println("Nuestras tortas disponibles son las siguientes:");
        System.out.println("1. Torta de Maria Luisa");
        System.out.println("2. Torna de Nucita");
        System.out.println("3. Torta de Yogurt");
    }

    private static void opcionTortasDisponibles() {

        Integer opcion, var1, var2;
        String var3;

        System.out.println("Que torta desea?");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Nuestra Torta Maria Luisa tiene un precio de $30000");
                var2 = cantidadPorciones();
                var1 = respuestaDesicionDecoracion();
                var3 = opcionDecoracion(var1);
                valorTotalCompra(var1, var2, 30000, "Maria Luisa", var3);
                break;
            case 2:
                System.out.println("Nuestra Torta de Nucita tiene un precio de $35000");
                var2 = cantidadPorciones();
                var1 = respuestaDesicionDecoracion();
                var3 = opcionDecoracion(var1);
                valorTotalCompra(var1, var2, 35000, "Nucita", var3);
                break;
            case 3:
                System.out.println("Nuestra Torta de Yogurt tiene un precio de $40000");
                var2 = cantidadPorciones();
                var1 = respuestaDesicionDecoracion();
                var3 = opcionDecoracion(var1);
                valorTotalCompra(var1, var2, 40000, "Yogurt", var3);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
    private static Integer cantidadPorciones() {
        System.out.println("Cuantas porciones desea");
        return input.nextInt();
    }
    private static Integer respuestaDesicionDecoracion() {
        Boolean rsp;

        System.out.println("Desea agregar alguna decoracion? (Si = true | No = false)");
        rsp = input.nextBoolean();

        if (rsp == true) {
            System.out.println("Todas nuestras decoraciones tienen un precio de $5000. Por favor elija una opcion:");
            System.out.println("1. Grajeas de colores");
            System.out.println("2. Salsas de frutos rojos");
            return input.nextInt();
        } else
            System.out.println("Ok, a continuacion le daremos el valor de su compra");
        return 0;
    }
    private static String opcionDecoracion(Integer valorDecoracion) {
        String nombreDecoracion = null;
        if (valorDecoracion == 1) {
            nombreDecoracion = "Grajeas de colores";
            return nombreDecoracion;
        } else if (valorDecoracion == 2) {
            nombreDecoracion = "Salsa de frutos rojos";
            return nombreDecoracion;
        }
        return nombreDecoracion;
    }
    private static void valorTotalCompra(Integer rspDecoracion, Integer valorPorciones, Integer precioTorta, String nombreTorta, String nombreDecoracion) {
        Integer valorTotal;

        if (rspDecoracion == 1 || rspDecoracion == 2) {
            valorTotal = valorPorciones * (precioTorta + 5000);
            System.out.println("-----------------------------------");
            System.out.println("Nombre de cliente: " + nombreCliente);
            System.out.println(valorPorciones + " Torta de " + nombreTorta + " mas decoracion de " + nombreDecoracion);
            System.out.println("El valor total de su compra es de: " + valorTotal);
        }
        else {
            valorTotal = valorPorciones * precioTorta;
            System.out.println("-----------------------------------");
            System.out.println("Nombre de cliente: " + nombreCliente);
            System.out.println(valorPorciones + " Torta de " + nombreTorta);
            System.out.println("El valor total de su compra es de: " + valorTotal);
        }
    }

}