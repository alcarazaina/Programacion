package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pide 5 números por teclado y al concluir escribe el mayor y menor de ellos (sin utilizar for).
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 5 números: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();
        int num4 = teclado.nextInt();
        int num5 = teclado.nextInt();
        //La idea es que cada vez que entra un número lo comparo con el mayor que tengo si el número nuevo es mayor lo reemplaza
        //para esto utilizamos una variable temporal que va guardando el número mayor hasta el momento
        // si declaro una variable entera y no le asigno un valor es como si pusiera 0
        int mayorTemporal = num1;
        if (mayorTemporal < num2) {
            mayorTemporal = num2;
        }
        if (mayorTemporal < num3) {
            mayorTemporal = num3;
        }
        if (mayorTemporal < num4) {
            mayorTemporal = num4;
        }
        if (mayorTemporal < num5) {
            mayorTemporal = num5;
        }

        int menorTemporal = num1;
        if (menorTemporal > num2) {
            menorTemporal = num2;
        }
        if (menorTemporal > num3) {
            menorTemporal = num3;
        }
        if (menorTemporal > num4) {
            menorTemporal = num4;
        }
        if (menorTemporal > num5) {
            menorTemporal = num5;
        }

        System.out.println("El número mayor es: " + mayorTemporal + " y el menor es: " + menorTemporal);


    }
}
