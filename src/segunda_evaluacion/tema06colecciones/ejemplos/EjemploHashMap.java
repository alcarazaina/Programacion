package segunda_evaluacion.tema06colecciones.ejemplos;

import java.util.HashMap;
import java.util.Scanner;

public class EjemploHashMap {
    public static void main(String[] args) {
        // mapas
        // sirven para almacenar pares de variables de la forma clave - valor
        // se declaran poniendo entre <> primero el tipo de la clave y luego el tipo del valor
        HashMap<String, String> mapa = new HashMap<>();

        // para añadir datos: tiene que ir en pares:
        mapa.put("11111111A", "A. Arribas");
        mapa.put("22222222B", "B. Blazquez");
        mapa.put("33333333C", "C. Calvo");
        mapa.put("44444444D", "D. Díaz");
        System.out.println(mapa);

        // para recuperar valores basta con darle la clave
        Scanner teclado = new Scanner(System.in);
        System.out.println("DNI: ");
        String dni = teclado.nextLine();
        System.out.println(mapa.get(dni));


        // Vamos a hacer un mapa que me guarde los numeros en inglés

        HashMap<Integer, String> numeroIng = new HashMap<>();
        numeroIng.put(1, "One");
        numeroIng.put(2, "Two");
        numeroIng.put(3, "Three");
        numeroIng.put(4, "Four");
        numeroIng.put(5, "Five");
        numeroIng.put(6, "Six");
        numeroIng.put(7, "Seven");
        numeroIng.put(8, "Eight");
        numeroIng.put(9, "Nine");
        numeroIng.put(10, "Ten");


        int numero = 0;
        do {
            System.out.println("¿Cómo se dice en inglés? 1 - 10 (0 para salir)");
            numero = teclado.nextInt(); teclado.nextLine();
            // recupero la traducción, si está, en el mapa y la imrpimo
            if (numeroIng.containsKey(numero)) {
            System.out.println(numeroIng.get(numero));
            } else {
                if (numero != 0) {
                    System.out.println("Ese no me la sé. ¿Quieres enseñarmelo?\nDime la traducción: ");
                    String traduccion = teclado.nextLine();
                    numeroIng.put(numero, traduccion);
                }
            }
        } while (numero != 0);





    }
}
