package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresComaFlotante;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        /*
        Realiza un programa que pida las notas finales de todos los módulos de 1º y muestre la nota final del curso. La nota final es la media de las notas de todos los módulos, redondeada a un número entero (por ejemplo, si la media es 7,5, la nota final es 8; si es 7,4, la nota final es 7).
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nota de Programación: ");
        double programacion = teclado.nextDouble();
        System.out.println("Introduce tu nota de Base de Datos: ");
        double basededatos = teclado.nextDouble();
        System.out.println("Introduce tu nota de Lenguaje de marcas: ");
        double lenguajedemarcas = teclado.nextDouble();
        System.out.println("Introduce tu nota de FOL: ");
        double fol = teclado.nextDouble();
        System.out.println("Introduce tu nota de Entornos de Desarrollo: ");
        double entornos = teclado.nextDouble();
        System.out.println("Introduce tu nota de Sistemas informáticos: ");
        double sistemas = teclado.nextDouble();

        double suma = programacion + basededatos + lenguajedemarcas + fol + entornos + sistemas;
        double media = suma / 6;
        System.out.printf("Mentira, no has podido sacar notas porque todavía no hemos hecho ningún examen, aun así la media con los datos que has introducido es: \n%.2f", media);
        System.out.printf("\nPor lo tanto tu nota final se quedaría en un %.0f", media);
    }
}
