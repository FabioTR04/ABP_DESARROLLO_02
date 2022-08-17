package Emisora;

public class Preguntas {
    
    String [] preguntas = {
        "Pregunta 1 ¿Cuantas horas semanales escucha la emisora?", "Pregunta 2 ¿Cuantos dias a la semana escucha usted la emisora?",
        "Pregunta 3 ¿Que tipo de programas le gusta escuchar?", "Pregunta 4 ¿Donde usted escucha nuestra emisora?",
        "Pregunta 5 ¿A que se dedica actualmente?", "Pregunta 6 ¿Recomendaria nuestra emisora a sus conocidos?",
        "Pregunta 7 Usted escucharia mas a nuestra emisora Sí", "Pregunta 8 ¿Cual es su edad?"
    };

    public String getPregunta(int posicion) {
        return preguntas[posicion];
    }
 
}
