package PrimeraEvaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea una cadena de texto que consista en un nombre y sus apellidos y a continuación muestre las iniciales en mayúsculas.
         */
        Scanner teclado = new Scanner(System.in);
        String nombreCompleto = teclado.nextLine();
        String iniciales = nombreCompleto.substring(0,1);
        //a iniciales le vamos a añadir las demás
        // vamos a recorrer carácter a carácter el nombre completo y cuando encontremos un espacio sabemos que lo siguiente es una inicial
        for (int i = 0; i < nombreCompleto.length() - 1; i++) {
            if (nombreCompleto.substring(i, (i + 1)).equals(" ")) {
                iniciales = iniciales + nombreCompleto.substring(i + 1, i + 2);
             }
            }
            System.out.println(iniciales.toUpperCase());
    }
}
