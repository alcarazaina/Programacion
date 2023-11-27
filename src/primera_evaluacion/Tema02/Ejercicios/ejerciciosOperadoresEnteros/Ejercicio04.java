package primera_evaluacion.Tema02.Ejercicios.ejerciciosOperadoresEnteros;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
/*
Unas ardillas encuentran unas nueces y deciden dividirlas equitativamente. Escribe un programa que pregunte por el número de ardillas y nueces, y, a continuación, calcule (y muestre) cuántas nueces corresponden a cada ardilla y cuántas sobrarán tras el reparto.
*/
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas ardillas hay en el árbol? ");
        int ardillas = teclado.nextInt();
        System.out.println("Cuántas nueces hay en el cesto? ");
        int nueces = teclado.nextInt();
        System.out.println("Hay "+ ardillas + " ardillas y "+ nueces + " nueces");

        int resultado = nueces / ardillas;
        int sobran = nueces % ardillas;

        System.out.println("A cada ardilla le corresponde " + resultado + " nueces y sobran " + sobran + " nueces");
    }
}
