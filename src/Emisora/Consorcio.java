package Emisora;

import java.util.Scanner;

public class Consorcio {
    
    private String nombreRadiosEmiten;
    private String companiaProductora;
    private String nombre;

    public Consorcio() {
    
    }

    public Consorcio(String nombre ,String nombreRadiosEmiten, String companiaProductora) {
        this.nombre = nombre;
        this.nombreRadiosEmiten = nombreRadiosEmiten;
        this.companiaProductora = companiaProductora;
    }
    
    
    
   
    public String getNombreRadiosEmiten() {
        return nombreRadiosEmiten;
    }

    public void setNombreRadiosEmiten(String nombreRadiosEmiten) {
        this.nombreRadiosEmiten = nombreRadiosEmiten;
    }

    public String getCompaniaProductora() {
        return companiaProductora;
    }

    public void setCompaniaProductora(String companiaProductora) {
        this.companiaProductora = companiaProductora;
    }
    
    
}
