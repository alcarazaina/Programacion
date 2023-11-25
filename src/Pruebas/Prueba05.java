package Pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba05 {
    public static void main(String[] args) {
        /*
         Escribir un programa que pida al usuario una frase y muestre por pantalla el número de veces que aparece cada vocal.
         */

        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();

        char a = 'a';
        char e = 'e';
        char is = 'i';
        char o = 'o';
        char u = 'u';
        int[] vocales = new int[5];
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == a) {
                vocales[0] = vocales[0] + 1;
            } else if (frase.charAt(i) == e) {
                vocales[1] = vocales[1] + 1;
            } else if (frase.charAt(i) == is) {
                vocales[2] = vocales[2] + 1;
            } else if (frase.charAt(i) == o) {
                vocales[3] = vocales[3] + 1;
            } else if(frase.charAt(i) == u) {
                vocales[4] = vocales[4] + 1;
            }
        }
        System.out.println(Arrays.toString(vocales));
    }
}
