package primera_evaluacion.tema03.ejercicios.ejercicios_while;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        /*
        Escribe un programa que cuente la cantidad de números que vamos introduciendo por teclado. Cuando el programa lee 0, debe terminar y mostrar la longitud de la secuencia (sin contar el 0 final).
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una serie de números, y 0 para finalizar: ");
        int numeros = teclado.nextInt();
        int suma = 0;
        while (numeros != 0){
            numeros = teclado.nextInt();
            suma = suma + 1;
        }
        System.out.println(suma);
    }
}
