package Pruebas;

import java.util.Scanner;

public class Prueba03 {
    public static void main(String[] args) {
        /*
2- Escribe un programa que calcule cuánto dinero se gasta al mes un usuario en
gasolina. Para ello, solicita los km que hace normalmente al mes, el consumo medio de
su coche y el precio de la gasolina al que reposta
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos km haces al mes normalmente? ");
        double km = teclado.nextDouble();
        System.out.println("¿Cuál es el consumo medio de tu coche? ");
        double consumo = teclado.nextDouble();
        System.out.println("A cuánto esta la gasolina? ");
        double precioGasolina = teclado.nextDouble();

        double cienkm = km / 100;
        double precio = cienkm * consumo * precioGasolina;
        System.out.printf("Te gastas al mes %.2f" , precio);
    }
}
