package PrimeraEvaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Pide una cadena y un carácter por teclado y muestra cuantas veces aparece el carácter en la cadena
         */
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int n = 0;
        System.out.println("introduce una cadena de texto: ");
        String cadena = teclado.nextLine();
        System.out.println("Introduce un carácter: ");
        char caracter =  teclado.next().charAt(0);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(n) == caracter) {
                contador++;
            } n++;
        }
        System.out.println(contador);
    }
}
