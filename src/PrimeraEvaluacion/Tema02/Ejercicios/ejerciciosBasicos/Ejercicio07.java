package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosBasicos;

import java.util.Scanner;

/*
Escribe un programa que lea tres cadenas de texto y las muestre en orden inverso, cada una en una nueva línea.
Entrada:
Java
Programación
Idioma
Salida:
Idioma
Programación
Java
*/
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.nextLine();
        String palabra2 = teclado.nextLine();
        String palabra3 = teclado.nextLine();
        System.out.println();
        System.out.println(palabra3);
        System.out.println(palabra2);
        System.out.println(palabra);
    }
}
