package Condicionales;

import java.util.Scanner;

/**
 * La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicación para poder facturar los
 * productos que vende a sus clientes y para ello, los productos tienen unas características que deben indicársele al cliente
 * para que pueda escoger el producto a comprar. Para cada cliente, se tienen las opciones de compra de producto, consulta de
 * precios por producto y devoluciones en caso de que se presenten.
 *
 * @author Javier Diaz <javier.ingsistema@gmail.com>
 */

public class Drogueria {

    private static String nombreCliente;
    private static Scanner inputString = new Scanner(System.in);
    private static Scanner inputInteger = new Scanner(System.in);
    private static Scanner inputBoolean = new Scanner(System.in);


    public static void main(String[] args) {

        Integer opcion;

        nombreCliente = capturarNombre();
        opcion = capturarOpcion();
        opcionMenu(opcion);

    }

    private static String capturarNombre() {
        System.out.println();
        System.out.println("Bienvenido a la Drogueria Mi Salud, para continuar por favor ingrese sus datos");
        System.out.println("Ingrese su nombre completo");
        return inputString.nextLine();
    }

    private static Integer capturarOpcion() {
        System.out.println("Que desea hacer?");
        System.out.println("1. Consultar productos disponibles");
        System.out.println("2. Devolver producto");
        return inputInteger.nextInt();
    }

    private static void opcionMenu(Integer opcion) {
        boolean rsp;
        int opcionProducto;

        switch (opcion) {
            case 1 -> {
                System.out.println("Nuestros productos disponibles son:");
                imprimirProductos();
                System.out.println("Desea alguno de nuestros productos? true = Si o false = No");
                rsp = inputBoolean.nextBoolean();
                opcionRespuesta(rsp);
            }
            case 2 -> {
                System.out.println("Que producto desea devolver");
                imprimirProductos();
                opcionProducto = inputInteger.nextInt();
                opcionDevolverProducto(opcionProducto);
            }

            default -> System.out.println("Opcion no valida");
        }

    }

    private static void imprimirProductos() {
        System.out.println("1. Vitamina C");
        System.out.println("2. Acetaminofen");
        System.out.println("3. Pañales etapa 5");
        System.out.println("4. Jabon");
        System.out.println(" ");
    }

    private static Integer respuestaComprarProducto() {
        System.out.println("1. Vitamina C");
        System.out.println("2. Acetaminofen");
        System.out.println("3. Pañales etapa 5");
        System.out.println("4. Jabon");
        return inputInteger.nextInt();
    }

    private static void opcionRespuesta(Boolean respuesta) {
        if (respuesta) {
            switch (respuestaComprarProducto()) {
                case 1:
                    System.out.println("El valor del sobre de vitamina C es de $3.500");
                    imprimirValorProducto(3500);
                    break;
                case 2:
                    System.out.println("El valor del sobre de Acetaminofen es de 1.500");
                    imprimirValorProducto(1500);
                    break;
                case 3:
                    System.out.println("El valor del pañal es de 2.500");
                    imprimirValorProducto(2500);
                    break;
                case 4:
                    System.out.println("El valor del jabon es de $3.000");
                    imprimirValorProducto(3000);
                default:
                    System.out.println("Opcion no valida");
            }
        } else {
            System.out.println("Muchas gracias por visitarnos, hasta luego");
        }
    }

    private static Integer capturarValorProducto() {
        System.out.println("Cuantos sobres va a llevar?");
        return inputInteger.nextInt();
    }

    private static void imprimirValorProducto(Integer valor) {
        int valorProducto;

        valorProducto = capturarValorProducto() * valor;
        System.out.println("Señor " + nombreCliente + "el valor total a cancelar es de " + valorProducto);
    }

    private static String capturarNovedad() {
        System.out.println("Porque devuelve el producto?");
        return inputString.nextLine();
    }

    private static void opcionDevolverProducto(Integer rsp) {
        int cantidad, resultado;

        switch (rsp) {
            case 1 -> {
                capturarNovedad();
                System.out.println("Cuantos sobres va a devolver?");
                cantidad = inputInteger.nextInt();
                resultado = cantidad * 3500;
                System.out.println("Señor " + nombreCliente + "le devuelvo" + resultado);
            }
            case 2 -> {
                capturarNovedad();
                System.out.println("Cuantos sobres va a devolver?");
                cantidad = inputInteger.nextInt();
                resultado = cantidad * 1500;
                System.out.println("Señor " + nombreCliente + "le devuelvo " + resultado);
            }
            case 3 -> {
                capturarNovedad();
                System.out.println("Cuantos pañales va a devolver?");
                cantidad = inputInteger.nextInt();
                resultado = cantidad * 2500;
                System.out.println("Señor " + nombreCliente + "le devuelvo" + resultado);
            }
            case 4 -> {
                capturarNovedad();
                System.out.println("Cuantos jabones va a devolver?");
                cantidad = inputInteger.nextInt();
                resultado = cantidad * 3000;
                System.out.println("Señor " + nombreCliente + "le devuelvo" + resultado);
            }
            default ->
                System.out.println("Opcion no valida");

        }
    }

}
