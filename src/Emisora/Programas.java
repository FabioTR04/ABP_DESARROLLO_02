package Emisora;

import java.util.Scanner;

public class Programas {
    
    private String nombrePrograma;
    private String generoPrograma;
    private String radiosEmitan;

    public Programas() {
    }
    public static void programa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("- registrar programas -");
        System.out.print("Introducir nombre de programa: ");
        String nombrePrograma = sc.nextLine();
        System.out.print("Introducir genero de programa: ");
        String generoPrograma = sc.nextLine();
        System.out.println("Introducir radios qen los que transmiten: ");
        String radiosEmitan = sc.nextLine();
        System.out.println("");
    }
    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    public String getGeneroPrograma() {
        return generoPrograma;
    }

    public void setGeneroPrograma(String generoPrograma) {
        this.generoPrograma = generoPrograma;
    }

    public String getRadiosEmitan() {
        return radiosEmitan;
    }

    public void setRadiosEmitan(String radiosEmitan) {
        this.radiosEmitan = radiosEmitan;
    }
    
    
}
