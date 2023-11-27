package primera_evaluacion.Tema02.Ejercicios.codeandcoke;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //Realiza un programa que solicite un número entre 1 y 1000 e indique cuántos dígitos tiene

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 1000: ");
        int numero = teclado.nextInt(); teclado.nextLine();
        if (numero > 1000 || numero < 0) {
            System.out.println("Error, tu número es mayor que 1000 o menor que 0");}
        else{
                int digitos = 1;
                while (numero >= 10) {
                    numero = numero / 10;
                    digitos++;
                }
                System.out.println(digitos);

            }
    }
}
