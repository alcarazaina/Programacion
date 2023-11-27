package primera_evaluacion.tema03.ejercicios.ejercicios_while;

import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
/*
Escribe un programa que pida números al usuario entre 1 al 100 hasta que éste adivine un número que el programa ha elegido al azar. El programa debe ir dando pistas sobre si el número que tiene que adivinar es mayor o es menor que el introducido. El juego termina cuando te rindes (pulsando 0) o adivinas el número. Si se introduce un número fuera del intervalo debe dar un mensaje de error.
Para que el programa elija un número al azar utilizamos el método random de la clase Math:
		int numAleatorio = (int) (Math.random() * 100 + 1);
 */
        Scanner teclado = new Scanner(System.in);
        int numAleatorio = (int) (Math.random() * 100 + 1);
        int n = -1;
        while (n != numAleatorio && n != 0) {
            System.out.println("Introduce un número del 1 al 100");
            n = teclado.nextInt();
            if (n == 0){
                System.out.println("Te has rendido, el número era: " + numAleatorio);
            } else if (n < 1 || n > 100) {
                System.out.println("Error");
            } else {
                if (n < numAleatorio) {
                    System.out.println("Oops, no, prueba otra vez, \nPista: El número secreto es mayor");
                } else if (n > numAleatorio) {
                    System.out.println("Vaya, ese no es. \nPrueba con un número menor");
                } else {
                    System.out.println("Genial, has acertado");
                }
            }
        }
    }
}
