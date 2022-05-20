package Ciclos.Ejercicio7;


import java.util.Objects;
import java.util.Scanner;

public class Menu {

    private static final Scanner inputString = new Scanner(System.in);
    private static final Scanner inputBoolean = new Scanner(System.in);
    public Integer contadorObjeto = 0;
    Usuario[] Objeto = new Usuario[5];
    public void inicializarArreglo() {
        for (int i = 0; i < 5; i++) {
            Objeto[i] = new Usuario();
        }
    }
    public void crearUsuario() {
        System.out.println("Por favor introduzca el nombre:");
        String nom = inputString.nextLine();
        System.out.println("Por favor introduzca el numero de telefono:");
        String tel = inputString.nextLine();
        System.out.println("Por favor introduzca la marca del vehiculo:");
        String mar = inputString.nextLine();
        System.out.println("Por favor introduzca la placa del vehiculo:");
        String plac = inputString.nextLine();

        for (int i = 0; i < contadorObjeto; i++) {

            while (Objeto[i].getPlaca().equals(plac)) {
                System.out.println("el numero de esta placa ya existe, ingrese otra");
                plac = inputString.nextLine();
                i = 0;
            }

        }
        Objeto[contadorObjeto] = new Usuario();
        Objeto[contadorObjeto].setNombre(nom);
        Objeto[contadorObjeto].setNumeroCel(tel);
        Objeto[contadorObjeto].setMarca(mar);
        Objeto[contadorObjeto].setPlaca(plac);
        contadorObjeto++;

    }
    public void mostrar() {
        if (contadorObjeto == 0) {
            System.out.println("No hay vehiculos registrados");
        } else {
            for (int i = 0; i < 5; i++) {
                if (Objects.equals(Objeto[i].getPlaca(), "")) {
                    i++;
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("Nombre: " + Objeto[i].getNombre());
                    System.out.println("Telefono: " + Objeto[i].getNumeroCel());
                    System.out.println("Marca " + Objeto[i].getMarca());
                    System.out.println("Placa: " + Objeto[i].getPlaca());
                    System.out.println("--------------------------------");
                }
            }
        }
    }

    public void eliminarUsuario() {

        mostrar();

        if (contadorObjeto != 0) {
            System.out.println("Nunero de placa a retirar:");
            String retirar = inputString.nextLine();

            for (int i = 0; i < contadorObjeto; i++) {
                if (Objeto[i].getPlaca().equals(retirar)) {
                    System.out.println("¿Estas seguro (Si: true / No: false)?");
                    boolean respuesta = inputBoolean.nextBoolean();

                    if (respuesta) {

                        Objeto[i] = new Usuario();
                        Objeto[i].setNombre("");
                        Objeto[i].setMarca("");
                        Objeto[i].setPlaca("");
                        Objeto[i].setNumeroCel("");
                        contadorObjeto--;
                        System.out.println("Vehiculo retirado correctamente");
                    }
                }
            }
        }
    }

    public void salir() {
        System.out.println("Hasta la vista, Baby");
    }
}
