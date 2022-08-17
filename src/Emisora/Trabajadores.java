package Emisora;

import java.util.Scanner;

public class Trabajadores {
    
    private String cedulaIdentidad ;
    private String nombre;
    private String tipoTrabajo;

    public Trabajadores(String nombre, String cedulaIdentidad, String tipoTrabajo) {
        this.nombre = nombre;
        this.cedulaIdentidad = cedulaIdentidad;
        this.tipoTrabajo = tipoTrabajo;
    }
    
    public String getCedula_identidad() {
        return cedulaIdentidad;
    }

    public void setCedula_identidad(String cedula_identidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return tipoTrabajo;
    }

    public void setRol(String rol) {
        this.tipoTrabajo = rol;
    }

    @Override
    public String toString() {
        return "Trabajador [" + "cedulaIdentidad=" + cedulaIdentidad + ", nombre=" + nombre + ", tipoTrabajo=" + tipoTrabajo + ']';
    }
    
    
    
}
