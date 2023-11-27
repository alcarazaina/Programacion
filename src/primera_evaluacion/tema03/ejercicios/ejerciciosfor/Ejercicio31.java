package primera_evaluacion.tema03.ejercicios.ejerciciosfor;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        /*
        [FOR ANIDADO] Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado, siendo n un número introducido por teclado, utilizando asteriscos (*). Por ejemplo, para n = 5:
*****
****
***
*

         */
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
