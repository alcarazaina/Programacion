package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Realizar un programa que pida un número entero por teclado y visualice el dia de la semana correspondiente.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero del 1 al 7: ");
        int numero = teclado.nextInt();
        //se puede hacer con if, else if, else... pero mejor con switch
        switch (numero){
            case 1:
                System.out.println("Pff Otra vez Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El número introducido no es ninguno de la semana");
        }
    }
}
