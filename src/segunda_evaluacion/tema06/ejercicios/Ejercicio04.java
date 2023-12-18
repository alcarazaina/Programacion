package segunda_evaluacion.tema06.ejercicios;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        Haz un programa en el que se cree un array que lea por teclado la longitud que debe tener y a continuación lo inicialice con números aleatorios comprendidos entre 1 y 10. Mostrar la suma de todos los números que se guardan en el array
         */
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();

        int longitud = teclado.nextInt();
        ArrayList<Integer> aleatorios = new ArrayList<>(longitud);

        for (int i = 0; i < longitud; i++) {
            aleatorios.add(generador.nextInt(1,11));
        }
        System.out.println(aleatorios);

        int suma = 0;
        for (int i = 0; i < longitud; i++) {
            suma += aleatorios.get(i);
        }
        System.out.println(suma);
    }
}
