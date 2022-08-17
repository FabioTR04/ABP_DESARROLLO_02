package Emisora;

import java.util.StringTokenizer;

public class Respuestas {
    
    String [] respuestas = {
        "1","2","3","4","5","6","7","8"
    };
    
    String [] radioR = {
        "Menos de una hora,1 - 3 Horas,4 - 6 Horas, Mas de 7 horas semanales", 
        "1 Dia,2 - 4 Dias,5 - 6 Dias, Los 7 Dias",
        "Periodistico o Noticias Cortas,Deportivo,Musical Y Cultural,Variedades",
        "En su trabajo,Hogar,En el GYM, Manejando",
        "Es Empresario,Estudiante,Empleado,Emprendedor de Negocio Pequeño",
        "Si,No,Tal vez SI, Tal vez NO ",
        "Tuviera mas variedad de programas,Mejor contenido, Mas noticias, Mas contenido musical",
        "6-15, 16-25, 26 - 46, 46+"
    };

    public String getRespueta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena, separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken();
            i++;
        }
        
    return a;
  
}
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1, ",");
        
        return s2;
    }
}
