package segunda_evaluacion.tema01.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        Haz un programa que declare tres arrays (‘a1’, ‘a2’ y ‘a3’) de cinco enteros cada uno, pida valores para ‘a1’ y ‘a2’ y calcule los elementos de a3 así: a3=a1+a2
         */

        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce a1: ");
            a1.add(teclado.nextInt());
            System.out.println("Introduce a2: ");
            a2.add(teclado.nextInt());
            a3.add(a1.get(i) + a2.get(i));

        }
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
