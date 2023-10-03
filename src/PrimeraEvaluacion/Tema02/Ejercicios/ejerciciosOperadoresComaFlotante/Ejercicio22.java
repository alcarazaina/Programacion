package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresComaFlotante;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        /*
        Haz el ejercicio anterior aplicando, además, un descuento del 15% sobre el total de la compra.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuánto cuesta una base de maquillaje de sephora? ");
        double precio = teclado.nextDouble();
        System.out.println("¿Cuántas bases vas a comprar? ");
        double cantidad = teclado.nextDouble();
        double iva = 0.21;
        double precioConIva = (precio + (precio * iva));
        double descuento = precioConIva * 0.15;
        double conDescuento = precioConIva - descuento;

        System.out.printf("El importe total a abonar es de: %.2f", conDescuento * cantidad);
        System.out.println("€");
    }
}
