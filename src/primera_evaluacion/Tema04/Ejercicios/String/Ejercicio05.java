package primera_evaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        /*
        Escribe un programa que compruebe si una cadena dada comienza por “J”, sin que tenga en cuenta si está en mayúsculas o minúsculas. El programa debe imprimir true o false
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String cadena = teclado.nextLine();
        String cadenaM = cadena.toUpperCase();
        boolean empiezaPorJ = cadenaM.startsWith("J");
        if (empiezaPorJ) {
            System.out.println("Sí, "+ cadena + ", empieza por J");
        } else {
            System.out.println("No empieza por J");
        }
    }
}
