package segunda_evaluacion.tema06colecciones.ejercicios.ejercicio04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Diccionario {

    private HashMap<String, String> diccionario;

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }

    public void nuevoPar(String español, String ingles){
        diccionario.put(español, ingles);
    }

    public String traduce (String español){
        diccionario.get(español);
        return diccionario.get(español);
    }

    public String palabraAleatoria(){
        // necesitamos saber cuantos pares hay
        int tamaño = diccionario.size();
        // System.out.println(indice);
        // vamos a generar un numero aleatorio entre 0 y el índice de la última posición
        Random generador = new Random();
        int indice = generador.nextInt(0, tamaño);
        // ahora necesito meter las claves en un array o arraylist
        String palEsp = (String) diccionario.keySet().toArray()[indice];
        System.out.println(palEsp);
        return palEsp;
    }

    public String primeraLetraTraducion (String español){
        return  diccionario.get(español).substring(0, 1);
    }

    @Override
    public String toString() {
        return "Diccionario{" +
                "diccionario=" + diccionario +
                '}';
    }
}
