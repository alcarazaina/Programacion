package segunda_evaluacion.tema06colecciones.ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemplosIterador {
    public static void main(String[] args) {
        // Un iterador (lo tenemos que generar) lo tienen todas las colecciones (arraylist, hashset...)
        // sirve para recorrerlas elemento a elemento, lo mismo que haciamos con un for o un foreach, pero como tienen unas características especiales son la mejor opción para recorrer toda la colección
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos.add("Iván");
        alumnos.add("Alejandro");
        alumnos.add("Carlos André");
        alumnos.add("Carlos");
        alumnos.add("Javier");
        alumnos.add("Ainara");
        alumnos.add("Robert");
        alumnos.add("Sergio");
        alumnos.add("Kamilly");
        alumnos.add("Sisa");
        alumnos.add("Johan");

        // Quiero recorrer el arraylist, tengo 3 formas:
        System.out.println("Con un for: ");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.print(alumnos.get(i) + " ");
        }
        System.out.println();
        System.out.println("Con foreach: "); // la limitación que tiene es que no puedes seleccionar elementos por su índice
        for (String elemento: alumnos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
        // tercera forma: utilizando un iterador(Es un objeto que se crea así:)
        System.out.println("Con iterator: ");
        Iterator<String> iterator = alumnos.iterator();
        // lo normal es poner a continuación un while, así:
        while (iterator.hasNext()) {
            String elemento = iterator.next(); // guardo el siguiente elemento de la colección
            System.out.print(elemento + " ");
        }
    }
}
