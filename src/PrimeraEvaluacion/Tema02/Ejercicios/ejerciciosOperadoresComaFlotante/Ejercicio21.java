package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresComaFlotante;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        /*
       Realiza un programa que pida el precio de venta de un producto, la cantidad de productos comprados y el porcentaje de IVA aplicado. El programa mostrará el importe total a abonar
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuánto cuesta la base de maquillaje de sephora? ");
        double precio = teclado.nextDouble();
        System.out.println("¿Cuántas bases vas a comprar? ");
        int cantidad = teclado.nextInt();
        System.out.println("Cuánto es el porcentaje de IVA: ");
        int iva = teclado.nextInt();
        double precioConIva = (precio + (precio * iva/100));

        System.out.printf("El importe total a abonar es de: %.2f", precioConIva * cantidad);
        System.out.println("€");


    }
}
