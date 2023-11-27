package primera_evaluacion.Tema02.Ejercicios.ejerciciosOperadoresComaFlotante;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*
        Realiza un programa que calcule el área de un triangulo.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuánto mide la base del triángulo en centímetros? ");
        double base = teclado.nextDouble();
        System.out.println("¿Y la altura? ");
        double altura = teclado.nextDouble();
        double resultado = base * altura / 2;
        System.out.println("El área del triangulo es: " + resultado + " centímetros cuadrados");
    }
}
