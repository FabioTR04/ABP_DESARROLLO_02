package Emisora;

import java.util.Scanner;

public class Radios {
    private String nombre;
    private String frecuencia;
    private String transmision;

    public Radios() {
    
    }

    public Radios(String nombreRadio, String frecuencia, String transmision) {
        this.nombre = nombreRadio;
        this.frecuencia = frecuencia;
        this.transmision = transmision;
        
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "Radios{" + "nombre=" + nombre + ", frecuencia=" + frecuencia + ", transmision=" + transmision + '}';
    }
    
    
    
}
