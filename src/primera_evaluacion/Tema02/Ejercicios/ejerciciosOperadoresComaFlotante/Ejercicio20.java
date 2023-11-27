package primera_evaluacion.Tema02.Ejercicios.ejerciciosOperadoresComaFlotante;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        /*
        Realiza un programa que pida un número y un porcentaje, y
Calcule y muestre ese número incrementado en ese porcentaje.
Calcule y muestre ese número decrementado en ese porcentaje.
	Por ejemplo: si se introduce 10 y 20, el resultado es 12 y 8
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        double numero = teclado.nextDouble();
        System.out.println("Ahora introduce un porcentaje, es decir un número del 0 al 100: ");
        double porcentaje = teclado.nextDouble();
        double pIncrementado = numero + (numero * (porcentaje / 100));
        double pDecrementado = numero - (numero * (porcentaje / 100));

        System.out.printf("El número con el incremento del porcentaje es: %.0f", pIncrementado);
        System.out.printf(", y con el decremento del porcentaje es: %.0f", pDecrementado);
    }
}
