package primera_evaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea el nombre de una ciudad y compruebe si el nombre termina con “burgo”. El programa debe imprimir true o false
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una ciudad: ");
        String ciudad = teclado.nextLine();
        System.out.println(ciudad.endsWith("burgo"));
    }
}
