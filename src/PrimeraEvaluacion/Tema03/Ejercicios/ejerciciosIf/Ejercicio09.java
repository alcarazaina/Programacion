package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta. Suponemos que el año no es bisiesto. Para que sea correcta, el año tiene que ser mayor que 0, el mes debe estar entre 1 y 12.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el día: ");
        int dia = teclado.nextInt();
        System.out.println("Introduce el mes: ");
        int mes = teclado.nextInt();
        System.out.println("Introduce el año: ");
        int año = teclado.nextInt();
        if ( (dia <= 31 && dia > 0) &&  (mes <= 12 && mes > 0) && (año > 0)){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
