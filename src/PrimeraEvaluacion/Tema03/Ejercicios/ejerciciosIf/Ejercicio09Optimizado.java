package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio09Optimizado {
    public static void main(String[] args) {
         /*
        Escribe un programa que pida una fecha (día, mes y año) y diga si es correcta. Suponemos que el año no es bisiesto. Para que sea correcta, el año tiene que ser mayor que 0, el mes debe estar entre 1 y 12.
         */
        Scanner teclado = new Scanner(System.in);
        String fecha = teclado.nextLine();
        String[] arrayFecha = fecha.split("-");
        int dia = Integer.parseInt(arrayFecha[0]);
        int mes = Integer.parseInt(arrayFecha[1]);
        int año = Integer.parseInt(arrayFecha[2]);
        if ((año >= 0) && (mes >= 1 && mes <= 12) || (((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia >= 1 && dia <= 31) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 31) || (dia >= 1 && dia <= 28))){
            System.out.println("Fecha correcta.");

        } else {
            System.out.println("Fecha incorrecta.");
        }
    }
}
