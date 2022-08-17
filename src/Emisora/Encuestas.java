package Emisora;

import java.util.Scanner;

public class Encuestas {
    private int cantidad_total_Encuentados;
    private int cantidad_Aprobaciones;
    private int cantidad_rechazos;
    private int cantidad_indiferencias;

    public Encuestas() {
    }
    
    public static void datosEncuesta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("== DATOS DE ENCUESTAS ==");
        System.out.println("Cantidad total de encuestados: ");
        System.out.println("Cantidad de aprobaciones: ");
        System.out.println("Cantidad de rechazos: ");
        System.out.println("Cantidad de indiferencias: ");
    }

    public int getCantidad_total_Encuentados() {
        return cantidad_total_Encuentados;
    }

    public void setCantidad_total_Encuentados(int cantidad_total_Encuentados) {
        this.cantidad_total_Encuentados = cantidad_total_Encuentados;
    }

    public int getCantidad_Aprobaciones() {
        return cantidad_Aprobaciones;
    }

    public void setCantidad_Aprobaciones(int cantidad_Aprobaciones) {
        this.cantidad_Aprobaciones = cantidad_Aprobaciones;
    }

    public int getCantidad_rechazos() {
        return cantidad_rechazos;
    }

    public void setCantidad_rechazos(int cantidad_rechazos) {
        this.cantidad_rechazos = cantidad_rechazos;
    }

    public int getCantidad_indiferencias() {
        return cantidad_indiferencias;
    }

    public void setCantidad_indiferencias(int cantidad_indiferencias) {
        this.cantidad_indiferencias = cantidad_indiferencias;
    }
    
    
           
}
