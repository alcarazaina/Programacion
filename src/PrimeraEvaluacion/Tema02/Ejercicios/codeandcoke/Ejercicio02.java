package PrimeraEvaluacion.Tema02.Ejercicios.codeandcoke;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //Realiza un programa que solicite un número y diga si es positivo o negativo
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número positivo o negativo: ");
        int numero = teclado.nextInt(); teclado.nextLine();
        boolean positivo = numero >= 0;
        if (positivo){
            System.out.println("Tu número es positivo");
        }
        else {
            System.out.println("Tu número es negativo");
        }

    }
}
