package PruebaExamen;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /**
         * @author Ainara
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int n1 = teclado.nextInt();
        System.out.println("Introduce otro número entero que sea diferente al ya introducido: ");
        int n2 = teclado.nextInt();
        while (n1 == n2){
            System.out.println("Los dos números son iguales. \nPor favor introduce dos números diferentes: ");
            n1 = teclado.nextInt();
            n2 = teclado.nextInt();
        } if (n1 < n2){
            for (int i = n1; i <= n2 ; i++) {
               if (i % 2 != 0){
                   System.out.println(i);
               }
            }
        } else {
            for (int i = n2; i <= n1 ; i++) {
               if (i % 2 != 0){
                   System.out.println(i);
               }
            }
        }
    }
}
