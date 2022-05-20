package Condicionales;

import java.util.Scanner;

/**
 * La Secretaría de Salud Municipal requiere de una aplicación que le permita calcular el IMC (Índice de masa corporal) y requiere los
 * datos peso en kilogramos y estatura en metros Para cada persona encuestada adicional a los datos suministrados, debe mostrar el
 * resultado para cada uno y establecer en qué rango se encuentra (bajo peso, normal, sobrepeso y obeso).
 *
 * @author Javier Diaz <javier.ingsistema@gmail.com>
 */
public class ValorIMC {
    private static String nombre;
    private static Float peso, estatura;
    private static Double resultadoIMC;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido al registro de IMC (Indice de Masa coropotal)");
        System.out.println("-------------------------------------------------------");
        nombre = capturarNombre();
        peso = capturarPeso();
        estatura = capturarEstatura();
        resultadoIMC = calcularValorIM();
        evaluarCondicion(resultadoIMC);
    }

    private static String capturarNombre() {
        System.out.println("Ingrese su nombre completo");
        return input.nextLine();
    }

    private static Float capturarPeso() {
        System.out.println("Ingrese su peso en kilogramos");
        return input.nextFloat();
    }

    private static Float capturarEstatura() {
        System.out.println("Ingrese su estatura en metros");
        return input.nextFloat();
    }

    private static double calcularValorIM() {
        double valorIMC;

        valorIMC = peso / (Math.pow(estatura, 2));
        return valorIMC;
    }

    private static void capturarDatos() {
        System.out.println("El paciente " + nombre);
        System.out.println("Peso: " + peso);
        System.out.println("Estatura: " + estatura);
        System.out.println("Valor de IMC: " + resultadoIMC);
    }

    private static void evaluarCondicion(double rspIMC) {
        if (rspIMC < 18.5) {
            capturarDatos();
            System.out.println("se encuentra bajo de peso");
        } else if (rspIMC >= 18.5 & rspIMC <= 24.9) {
            capturarDatos();
            System.out.println("Se encuentra en un peso normal");
        } else if (rspIMC >= 25 & rspIMC <= 29.9) {
            capturarDatos();
            System.out.println("Se encuentra en sobrepreso");
        } else if (rspIMC > 30) {
            capturarDatos();
            System.out.println("Se encuentra obeso");
        }
    }

}
