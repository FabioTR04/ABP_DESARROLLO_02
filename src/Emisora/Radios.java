package Emisora;

public class Radios {
    private String nombre;
    private String frecuencia;
    private String transmision;

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

    public void mostrarTransmicion(){
        System.out.println("transmicion: " + getTransmision());
    }
    
    
}
