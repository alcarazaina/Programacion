package Pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba05OtraForma {
    public static void main(String[] args) {

         /*
         Escribir un programa que pida al usuario una frase y muestre por pantalla el número de veces que aparece cada vocal.
         */

        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();

        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        int[] contador_vocales = new int[5];

        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < contador_vocales.length; j++) {
                if (frase.charAt(i) == vocales[j]){
                    contador_vocales[j]++;
                }
            }
        }

        System.out.println(Arrays.toString(contador_vocales));

    }
}
