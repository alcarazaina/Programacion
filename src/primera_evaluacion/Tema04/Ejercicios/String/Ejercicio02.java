package primera_evaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        Realizar un programa que compruebe si una cadena leída por teclado comienza por una subcadena introducida también por teclado.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String cadena = teclado.nextLine();
        System.out.println("Ahora introduce el texto que quieras comprobar si está: ");
        String texto = teclado.nextLine();

        if (cadena.contains(texto)){
            System.out.println("Sí, el texto \"" + texto + "\" esta dentro de \"" + cadena + "\"");
        }else {
            System.out.println("No, \"" + texto + "\" no esta dentro de " + cadena);
        }

    }
}
