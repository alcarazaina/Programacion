package segunda_evaluacion.tema06.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el orden inverso al introducido
         */

        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> decimales = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            decimales.add(teclado.nextDouble());
        }

        for (int i = 5 -1 ; i >= 0; i--) {

            System.out.print(decimales.get(i) + ", ");
        }
    }
}
