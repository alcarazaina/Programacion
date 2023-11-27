package primera_evaluacion.tema03.ejercicios.ejerciciosfor;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio30random {
    public static void main(String[] args) {
         /*
        Realizar un programa que pida números (al arrancar el programa se pedirá por teclado la cantidad de números a introducir). El programa debe informar de cuántos números introducidos son mayores que 0, menores que 0 e iguales a 0
         */
        //vamos a hacer que los números se generen random entre 10 y -10
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números se van a introducir? ");
        int cantidad = teclado.nextInt();
        int cantidadMayor = 0;
        int cantidadMenor = 0;
        int cantidadIgual = 0;
        int n = 0;
        Random generador = new Random();
        for (int i = 0; i < cantidad ; i++) {
            System.out.println("Introduce los números: ");
            n = generador.nextInt(-10,10);
            System.out.println(n);
            if (n < 0){
                cantidadMenor++;
            } else if (n == 0) {
                cantidadIgual++;
            }else {
                cantidadMayor++;
            }
        }
        System.out.println("Cantidad de números menores a 0: " + cantidadMenor + ", \nCantidad de números iguales a 0: " + cantidadIgual + ",\nCantidad de números mayores a 0: " + cantidadMayor);
    }
}
