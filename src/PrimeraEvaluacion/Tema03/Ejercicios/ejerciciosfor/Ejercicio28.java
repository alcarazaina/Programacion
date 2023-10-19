package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosfor;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        /*
        Hacer un programa que imprima todos los números múltiplos de 5 entre 1 y n, siendo n un número introducido por el usuario.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int n = teclado.nextInt();
        //Recorremos todos los enteros entre 0 y n
        int multiplo = 5;
        for (int i = 1; i <= n; i++) {
            // si i es múltiplo de 5 lo imprimo
          if (i % multiplo == 0){
              System.out.println("Los múltiplos de 5 entre 1 y " + n + " son " + i);
          }
        }
    }
}
