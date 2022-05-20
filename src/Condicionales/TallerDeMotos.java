package Condicionales;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class TallerDeMotos {

    private static String nombre, placa, problema;
    private static Integer opcion;
    private static Scanner inputInteger = new Scanner(System.in);
    private static Scanner inputBoolean = new Scanner(System.in);
    private static Scanner inputString = new Scanner(System.in);

    public static void main(String[] args) {
        opcion = capturarOpcion();
        opcionServicio(opcion);


    }

    private static Integer capturarOpcion() {
        System.out.println("Bienvenido al Taller de motos el Maquinista");
        System.out.println("Que servicio desea?");
        System.out.println("1. Registrar ingreso de Motocicleta");
        System.out.println("2. Registrar salida de _Motocicleta");
        System.out.println("3. Inventario de repuestos");
        return inputInteger.nextInt();

    }

    private static void opcionServicio(Integer opc) {
        switch (opc) {
            case 1:
                nombre = nombreCliente();
                placa = placaMotocicleta();
                problema = detalleMotocicleta();
                System.out.println("Registro del cliente " + nombre + " de motocicleta con placas " + placa);
                System.out.println("Presenta los siguientes problemas:");
                System.out.println(problema);
            case 2:
                nombre = nombreCliente();
                placa = placaMotocicleta();
                descripcionDeReparacion();
            case 3:
                System.out.println("Ingrese datos del cliente");
                nombre = nombreCliente();
                placa = placaMotocicleta();
                opcionRespuestos();
                break;
            default:
                System.out.println("Opcion no valida");

        }
    }

    private static String nombreCliente() {
        System.out.println("Ingrese nombre completo");
        return inputString.nextLine();

    }

    private static String placaMotocicleta() {
        System.out.println("ingrese numero de placa de motociclieta(en Mayusculas y sin espacios. Ejemplo: XXX11A)");
        return inputString.nextLine();
    }

    private static String detalleMotocicleta() {
        System.out.println("Ingrese brevemente los problemas por los cuales trae la motocicleta");
        return inputString.nextLine();
    }

    private static String opcionRespuestos() {

        Boolean rsp;

        System.out.println("Realizo cambio de repuestos en la Motocicleta");
        rsp = inputBoolean.nextBoolean();

        if (rsp == true) {
            System.out.println("Mencione a continuacion los repuestos cambiados");
            return inputString.nextLine();
        }
        else
            System.out.println("ok, presione enter para salir");
            return inputString.nextLine();
    }


    private static String descripcionDeReparacion() {
        System.out.println("Mencione que trabajos se le realizaron a la Motocicleta");
        return inputString.nextLine();
    }

}
