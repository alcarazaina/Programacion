package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosBasicos;

import java.util.Scanner;

public class EjerciciosBasicos {
    //Ejercicio 1
    public static void main(String[] args) {
     //Ejercicio 2
        System.out.println("primera");
        System.out.println("segunda");
        System.out.println("tercera");
     //Ejercicio 3
        System.out.println("********");
        System.out.println("      **");
        System.out.println("      **");
        System.out.println("      **");
        System.out.println("**    **");
        System.out.println("**    **");
        System.out.println(" *******");
    //Ejercicio 4
        System.out.println("0");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
     //Ejercicio 5
        System.out.println(" 9 8 7 6 5 4 3 2 1 0");
     //Ejercicio 6
        System.out.println("  *  ");
        System.out.println(" *** ");
        System.out.println("*****");
        System.out.println(" *** ");
        System.out.println("  *  ");
     //Ejercicio 7
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.nextLine();
        String palabra2 = teclado.nextLine();
        String palabra3 = teclado.nextLine();
        System.out.println(" ");
        System.out.println(palabra3);
        System.out.println(palabra2);
        System.out.println(palabra);
     //Ejercicio 8
        Scanner tecla = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = tecla.nextLine();
        System.out.println("Introduce ahora tu edad: ");
        String edad = tecla.nextLine();
        System.out.println("¿Cuántos años tienes de experiencia? ");
        String experiencia = tecla.nextLine();
        System.out.println("¿Qué te gusta cocinar? ");
        String cocina = tecla.nextLine();

        System.out.println("El formulario de " + nombre + ", de " + edad+ " años y " + experiencia + " de experiencia, está completo. Nos comunicaremos con usted si necesitamos alguien que cocine comida " + cocina);

     //Ejercicio 9
        int numerico = 123456;
        System.out.println(numerico);

    }
}
