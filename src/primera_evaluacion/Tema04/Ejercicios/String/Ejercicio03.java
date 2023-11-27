package primera_evaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea una cadena de texto y reemplace todas las ocurrencias de la letra ‘a’ con la letra ‘b’. A continuación debe imprimir la cadena resultante
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String cadena = teclado.nextLine();

        cadena = cadena.replace('a', 'b');
        System.out.println(cadena);
    }
}
