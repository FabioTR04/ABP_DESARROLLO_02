package Emisora;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    
    private String correo;
    private String password;

    public Login() {
    
    }
    
    public static void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("== Iniciar Sesion ==");
        System.out.print("Ingresar Correo");
        String correo = sc.nextLine();
        System.out.print("Ingresar Contraseña");
        String contraseña = sc.nextLine();
        System.out.println("");
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
  
    
  
  
}


