package Ciclos.Ejercicio8;

public class Usuario {

    String cedula, resultadoPrueba, nombre;

    public Usuario() {
        this.cedula = "";
        this.resultadoPrueba = "";
        this.nombre = "";
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getResultadoPrueba() {
        return resultadoPrueba;
    }

    public void setResultadoPrueba(String resultadoPrueba) {
        this.resultadoPrueba = resultadoPrueba;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
