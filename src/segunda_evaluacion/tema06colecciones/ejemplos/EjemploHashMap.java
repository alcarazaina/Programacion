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


    }
}
