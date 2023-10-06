package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio12switch {
    public static void main(String[] args) {
                /*
        Harry Potter necesita ayuda para identificar lo que significa cada casa. Lee una cadena que represente una casa (puedes asociarla a un número para hacer más fácil la entrada por teclado) y que obtenga lo siguiente:
si es "gryffindor" , salida "valentía" ;
si es "hufflepuff" , salida "lealtad" ;
si es "slytherin" , salida "astucia" ;
si es "ravenclaw" , salida "intelecto" ;
de lo contrario, se muestra "no es una casa válida" .

         */
        Scanner teclado = new Scanner(System.in);
        //Mostramos un menu para elegir la casa
        System.out.println("Elige una casa");
        System.out.println("1. Gryffindor");
        System.out.println("2. Hufflepuff");
        System.out.println("3. Slytherin");
        System.out.println("4. Ravens-claw");

        int casa = teclado.nextInt();

        switch (casa) {
            case 1:
                System.out.println("Valentía");
                break;
            case 2:
                System.out.println("Lealtad");
                break;
            case 3:
                System.out.println("Astucia");
                break;
            case 4:
                System.out.println("Intelecto");
                break;
            default:
                System.out.println("Error, no es una casa válida");
        }
    }
}
