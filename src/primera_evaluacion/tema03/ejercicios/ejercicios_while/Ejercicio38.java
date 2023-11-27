package primera_evaluacion.tema03.ejercicios.ejercicios_while;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        /*
        Hacer un programa que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.
         */
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        char letra = 'a';
        while (letra != ' '){
            System.out.println("Introduce una letra del abecedario: ");
            letra = teclado.next().charAt(0); //tiene que ser teclado.nextLine().charAt(0) porque si pongo solo next no coge el espacio
            letra = Character.toLowerCase(letra); // convertimos las vocales mayúsculas a minúsculas porque si no una A dice no vocal
            if (letra != ' ') {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println("VOCAL");
                } else {
                    System.out.println("NO VOCAL");
                }
            } else {
                System.out.println("Fin del programa");
            }
        }

    }
}
