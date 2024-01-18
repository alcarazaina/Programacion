package segunda_evaluacion.tema06colecciones.ejercicios.ejecicio03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
          Escribir un programa que cree un diccionario de traducción español-inglés. El usuario introducirá las palabras en español e inglés separadas por dos puntos, y cada par <palabra>:<traducción> separados por comas. El programa debe crear un diccionario con las palabras y sus traducciones. Después pedirá una frase en español y utilizará el diccionario para traducirla palabra a palabra. Si una palabra no está en el diccionario debe dejarla sin traducir.
         */
        // perro:dog,gato:cat,mesa:table,silla:chair,clase:class,conseguir:get,establecer:set,encima:on
        Scanner teclado = new Scanner(System.in);
        String linea = teclado.nextLine();
        System.out.println(linea);
        // lo siguiente es meter en un array los pares español:inglés
        String[] pares = linea.split(",");
        System.out.println(Arrays.toString(pares));
        // creo un mapa - diccionario en que la clave es la palabra en español y el valor es la palabra en inglés, es decir utilizo la palabra en español para recuperar su traducción
        HashMap<String, String> traductor = new HashMap<>();
        for (int i = 0; i < pares.length; i++) {
            // separo la palabra en español de la palabbra en inglés
            String[] separador = pares[i].split(":");
            String español = separador[0];
            String inglés = separador[1];
            traductor.put(español, inglés);
        }
        System.out.println(traductor);
        // Pedimos una frase en español y utiliza el diccionario para traducirla. Si la palabra no está te la deja en español.
        // El perro está encima de la mesa
        System.out.println("Introduce la frase a traducir: ");
        // reutilizamos la variable línea
        linea = teclado.nextLine();
        String [] palabrasFrase = linea.split(" "); // creo un array con las palabras de la frase
        // recorremos este array de palabras para ir traduciendolas una a una
        for (String palabraEspañol: palabrasFrase) {
            if (traductor.containsKey(palabraEspañol)){
                System.out.print(traductor.get(palabraEspañol) + " "); // palabraEspañol es la clave (key) para obtener su traduccioón con get(palabraEspañol)
            } else {
                System.out.print(palabraEspañol + " "); // si no está la palabra en el mapa que me la imprima tal cual
            }
        }

    }
}
