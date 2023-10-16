package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida tres números y los muestre ordenados (de menor a mayor).
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 3 números: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        if (num1 < num2 && num2 < num3){
            System.out.println(num1 + " " + num2 + " " + num3);
        }else if (num2 < num1 && num1 < num3){

        }
    }
}
