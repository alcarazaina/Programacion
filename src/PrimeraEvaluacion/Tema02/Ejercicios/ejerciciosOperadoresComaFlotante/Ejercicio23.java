package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresComaFlotante;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        /*
        Un vendedor recibe un sueldo base mas un 10% de comisión por comisión sobre el total de las ventas que realice. El vendedor realiza tres ventas este mes y quiere saber cuánto dinero obtendrá por concepto de comisiones y el total que cobrará. Todos los datos que se desconocen se piden por teclado
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuál es tu salario base? ");
        double salarioBase = teclado.nextDouble();
        System.out.println("¿De cuánto ha sido tu primera venta? ");
        double venta1 = teclado.nextDouble();
        System.out.println("¿y la segunda? ");
        double venta2 = teclado.nextDouble();
        System.out.println("Y la tercera? ");
        double venta3 = teclado.nextDouble();
        double totalVentas = venta1 + venta2 + venta3;
        double comision = totalVentas * 0.10;

        System.out.printf(" Tu comisión de este mes es: %.2f", comision);

        double salarioTotal = salarioBase + comision;

        System.out.printf(" y tu salario total es: %.2f", salarioTotal);
    }
}
