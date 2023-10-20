package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosWhile;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos (sin contar el 0 con que finaliza el programa).
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una serie de números, y 0 para finalizar: ");
        double numeros = teclado.nextInt();
        double media = 0;
        double contador = 0;
        double suma = 0;
        while (numeros != 0){
            numeros = teclado.nextInt();
            contador = contador + 1;
            suma = suma + numeros;
        }
        media = suma/contador;
        System.out.printf ("%.0f", suma);
        System.out.println();
        System.out.printf("%.2f", media);
    }
}
