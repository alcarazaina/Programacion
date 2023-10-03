package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresEnteros;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
/*
Escribe un programa que, dado un importe en euros, indique el número mínimo de billetes y monedas que se puede utilizar para obtener dicha cantidad. Por ejemplo:
Ejemplo: 232 euros son 1 billete de 200, 1 billete de 20, un billete de 10, y una moneda de 2 euros.
 */
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce una cantidad en euros: ");
        int euros = teclado.nextInt();
        System.out.println(euros+ "€");
        int billetes200 = 0;
        int billetes100 = 0;
        int billetes50 = 0;
        int billetes20 = 0;
        int billetes10 = 0;
        int billetes5 = 0;
        int moneda2 = 0;
        int moneda1 = 0;

        if ( euros - 200 >= 0 ){
            billetes200 = euros / 200;
            euros = euros - billetes200 * 200;
        }
        if (euros - 100 >= 0){
            billetes100 = euros / 100;
            euros = euros - billetes100 * 100;
        }
        if (euros - 50 >= 0){
            billetes50 = euros / 50;
            euros = euros - billetes50 * 50;
        }
        if (euros - 20 >= 0){
            billetes20 = euros / 20;
            euros = euros - billetes20 * 20;
        }
        if (euros - 10 >= 0){
            billetes10 = euros / 10;
            euros = euros - billetes10 * 10;
        }
        if (euros - 5 >= 0){
            billetes5 = euros / 5;
            euros = euros - billetes5 * 5;
        }
        if (euros - 2 >= 0){
            moneda2 = euros / 2;
            euros = euros - moneda2 * 2;
        }
        moneda1 = euros;

        System.out.print("Son " + billetes200 + " billetes de 200€, ");
        System.out.print( billetes100 + " billetes de 100€, " );
        System.out.print( billetes50 + " billetes de 50€, " );
        System.out.print( billetes20 + " billetes de 20€, " );
        System.out.print( billetes10 + " billetes de 10€, " );
        System.out.print( billetes5 + " billetes de 5€, " );
        System.out.print( moneda2 + " monedas de 2€, " );
        System.out.print( moneda1 + " monedas de 1€, " );

    }
}
