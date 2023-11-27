package primera_evaluacion.tema03.ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida dos números e indique si el primero es mayor que el segundo o no.
           */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos números: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
         if (num1 > num2 ) {
             System.out.println("El primer número es mayor que el segundo");
         }
         else {
             System.out.println("El primer número no es mayor que el segundo");
         }
    }
}
