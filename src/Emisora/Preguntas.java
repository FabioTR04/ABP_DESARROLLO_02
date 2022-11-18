package Emisora;

public class Preguntas {
    String[] preguntas = new String[2];
    
    public String[] llamadaVector(){
        
        preguntas[0] = "¿cuantas horas escucha la radio diariamente?";
        preguntas[1] = "¿que programas escucha en la radio?";
        preguntas[2] = "¿en que frecuencia escucha la radio?";
        
        return preguntas;
    }

}
