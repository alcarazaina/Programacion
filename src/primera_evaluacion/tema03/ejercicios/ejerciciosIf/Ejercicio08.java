package primera_evaluacion.tema03.ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea un año e indique si es bisiesto. Nota: un año es bisiesto si es divisible por 4, y no es divisible por 100, excepto que también sea divisible por  400
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un año:" );
        int año = teclado.nextInt();
        if ((año % 4 == 0 && año % 100!= 0) || (año % 4 == 0 && año % 100 == 0 && año % 400 == 0) ){
            System.out.println("El " +  año + " es bisiesto");
        }else {
            System.out.println("El " +  año + " no es bisiesto");
        }
    }
}
