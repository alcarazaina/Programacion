package primera_evaluacion.Tema02.Ejercicios.ejerciciosOperadoresComaFlotante;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
        Realiza un programa que pida el lado de un cuadrado, y muestre por pantalla El perímetro.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la medida de un lado del cuadrado en centímetros: ");
        double lado = teclado.nextDouble();
        double resultado = lado * 4;
        System.out.println("El perímetro de un cuadrado que mide " + lado + " centímetros es: " + resultado + " centímetros");
    }
}
