package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosfor;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        /*
        Escribe un programa que, dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el método  Math.pow().
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número y su potencia: ");
        int numero = teclado.nextInt();
        int potencia = teclado.nextInt();
        int resultado = 0;
        for (int i = numero; i <= potencia; resultado =  numero * numero) {
            System.out.println(numero);
        }
    }
}
