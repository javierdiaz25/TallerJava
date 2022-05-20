package Ciclos.Ejercicio8;

import java.util.Objects;
import java.util.Scanner;

public class Menu {
    private static final Scanner inputString = new Scanner(System.in);
    public Integer contadorObjeto = 0;
    Usuario[] Objeto = new Usuario[8];

    public void inicializarArreglo() {
        for (int i = 0; i < 8; i++) {
            Objeto[i] = new Usuario();
        }
    }
    public void crearUsuario() {
        System.out.println("Por favor introduzca el nombre:");
        String nombre = inputString.nextLine();
        System.out.println("Por favor introduzca cedula:");
        String cedula = inputString.nextLine();

        for (int i = 0; i < contadorObjeto; i++) {

            while (Objeto[i].getCedula().equals(cedula)) {
                System.out.println("el usuario ya existe, ingrese otro numero");
                cedula = inputString.nextLine();
                i = 0;
            }

        }

        System.out.println("Por favor introduzca resultado de prueba:");
        String resultadoPrueba = inputString.nextLine();

        Objeto[contadorObjeto] = new Usuario();
        Objeto[contadorObjeto].setNombre(nombre);
        Objeto[contadorObjeto].setCedula(cedula);
        Objeto[contadorObjeto].setResultadoPrueba(resultadoPrueba);
        contadorObjeto++;

    }

    public void mostrar() {
        if (contadorObjeto == 0) {
            System.out.println("No hay usuarios registrados");
        } else {
            for (int i = 0; i < 8; i++) {
                if (Objects.equals(Objeto[i].getCedula(), "")) {
                    i++;
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("Nombre : " + Objeto[i].getNombre());
                    System.out.println("Cedula : " + Objeto[i].getCedula());
                    System.out.println("Resultado Prueba: " + Objeto[i].getResultadoPrueba());
                    System.out.println("--------------------------------");
                    if (Integer.parseInt(Objeto[i].resultadoPrueba) < 80) {
                        System.out.println("El usuario no aprobó el curso");
                    }
                    else System.out.println("El usuario aprobó el curso");
                }
            }
        }
    }


    public void salir() {
        System.out.println("Hasta la vista, Baby");
    }
}
