package Emisora;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class CompanyProductora {
    
    private String numeroRFC;
    private static Set<String> nombres = new HashSet<>();
    private String nombre = "";
    private String telefono;
    
    
    public CompanyProductora() {
        
    }

    public CompanyProductora(String numeroRFC, String nombre, String telefono) {
        this.numeroRFC = numeroRFC;
        this.setNombre( nombre );
        this.telefono = telefono;
       
    }
    
    public void setNombre(String nombre) {
        if (nombres.contains( nombre )) {
            JOptionPane.showMessageDialog(null, "NO SE PERMITEN NOMBRES IGUALES");
        }
        nombres.add( nombre );
        this.nombre = nombre;
    }
    
    

    public String getNumeroRFC() {
        return numeroRFC;
    }

    public void setNumeroRFC(String numeroRFC) {
        this.numeroRFC = numeroRFC;
    }

    public String getNombre() {
        return nombre;
    }

   
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "CompanyProductora{" + "numeroRFC=" + numeroRFC + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }

    
    

}
