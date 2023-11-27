package primera_evaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*
        Escribir por pantalla cada carácter de una cadena introducida por teclado.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String cadena = teclado.nextLine();

        // para verla carácter a carácter -> charAt(indice)

        for (int i = 0; i < cadena.length(); i++) { //
            System.out.println(cadena.charAt(i));

        }
    }
}
