package primera_evaluacion.tema03.ejercicios.MasEjercicios;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará: El total de números introducidos, excluido el 0. El total de números fallados.
         */
        Scanner teclado = new Scanner(System.in);
        int contadorfallo = 0;
        int contador = 0;
        int n = 1;
        int referencia = teclado.nextInt();
        while (n != 0){
            n = teclado.nextInt();
            if (n < referencia){
                contadorfallo++;
                referencia = n;
            }
            contador++;
        }
        System.out.println("Total números introducidos: " + contador);
        System.out.println("El número de fallos: " + contadorfallo);
    }
}
