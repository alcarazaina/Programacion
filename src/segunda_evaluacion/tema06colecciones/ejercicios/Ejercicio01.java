package segunda_evaluacion.tema06colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*
        Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los muestre en el mismo orden introducido.
         */
        Scanner teclado = new Scanner(System.in);
        ArrayList<Double> decimales = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

        decimales.add(teclado.nextDouble());
            System.out.println(decimales.get(i));
        }
        System.out.println(decimales);
    }
}
