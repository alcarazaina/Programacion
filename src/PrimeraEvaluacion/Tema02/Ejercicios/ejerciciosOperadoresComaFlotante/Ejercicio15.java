package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresComaFlotante;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*
        Hacer un programa que lea una temperatura en grados centígrados y la visualice en las escalas reamur, Fahrenheit y kelvin, teniendo en cuenta que
		Reamur = Centígrados x 0.8
           		Fahenheit = (Centígrados * 9/5)+32
           		Kelvin = Centígrados + 273
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la temperatura en grados centígrados: ");
        double centigrados = teclado.nextDouble();
        double reamur = centigrados * 0.8;
        double fahrenheit = (centigrados * 9 / 5) + 32;
        double kelvin = centigrados + 273;

        System.out.println(centigrados + " grados centígrados son " + reamur + " grados reamur, " + fahrenheit + " grados fahrenheit y " + kelvin + " grados kelvin ");

    }
}
