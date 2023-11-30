package primera_evaluacion.tema03.ejercicios.MasEjercicios;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        Realiza un programa que lea un número y a continuación escriba el carácter “*” tantas veces igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá escribir un único asterisco.
         */
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        if (n < 0){
            System.out.println("*");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }
    }
}
