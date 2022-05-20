package Ciclos.Ejercicio6;

import Ciclos.Ejercicio7.Usuario;

import java.util.Scanner;


public class Menu {
    private static Scanner inputString = new Scanner(System.in);
    private static Scanner inputInteger = new Scanner(System.in);
    private static Scanner inputBoolean = new Scanner(System.in);
    Persona[] Objeto = new Persona[3];
    public Integer contadorObjeto = 0;


    public void inicializarArreglo() {
        for (int i = 0; i < 3; i++) {
            Objeto[i] = new Persona();
        }
    }

    public void crearContacto() {
        System.out.println("Por favor introduzca el nombre:");
        String nom = inputString.nextLine();
        System.out.println("Por favor introduzca la organizacion:");
        String org = inputString.nextLine();
        System.out.println("Por favor introduzca el teléfono(numero):");
        String tel = inputString.nextLine();


        for (int i = 0; i < contadorObjeto; i++) {

            while (Objeto[i].getTelefono().equals(tel)) {
                System.out.println("el numero telefonico ya existe, ingrese otro");
                tel = inputString.nextLine();
                i = 0;
            }

        }
        Objeto[contadorObjeto] = new Persona();
        Objeto[contadorObjeto].setNombre(nom);
        Objeto[contadorObjeto].setOrganizacion(org);
        Objeto[contadorObjeto].setTelefono(tel);
        contadorObjeto++;

    }

    public void Mostrar() {
        if (contadorObjeto == 0) {
            System.out.println("No hay contactos guardados");
        } else {
            for (int i = 0; i < 3; i++) {
                if (Objeto[i].getTelefono() == "") {
                    i++;
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("Nombre: " + Objeto[i].getNombre());
                    System.out.println("Organizacion: " + Objeto[i].getOrganizacion());
                    System.out.println("Telefono: " + Objeto[i].getTelefono());
                    System.out.println("--------------------------------");
                }

            }
        }
    }

    public void eliminarContacto() {

        Mostrar();

        if (contadorObjeto != 0) {
            System.out.println("Nunero de contacto a eliminar:");
            String eliminar = inputString.nextLine();

            for (int i = 0; i < contadorObjeto; i++) {
                if (Objeto[i].getTelefono().equals(eliminar)) {
                    System.out.println("¿Estas seguro (Si: true / No: false)?");
                    Boolean respuesta = inputBoolean.nextBoolean();

                    if (respuesta == true) {

                        Objeto[i] = new Persona();
                        Objeto[i].setNombre("");
                        Objeto[i].setOrganizacion("");
                        Objeto[i].setTelefono("");
                        contadorObjeto--;
                        System.out.println("Contacto eliminado correctamente");
                    }
                }
            }
        }
    }


    public void salir() {
        System.out.println("Hasta la vista, Baby");
    }


}