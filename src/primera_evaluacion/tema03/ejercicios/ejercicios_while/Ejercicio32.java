package primera_evaluacion.tema03.ejercicios.ejercicios_while;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        /*
        Escribe un programa que solicite al usuario un número entre 1 y 100, ambos inclusive. Si se introduce un número fuera del intervalo debe indicarlo mediante un error y seguir pidiendo el número hasta que se introduzca el número en el rango indicado. Al terminar debe imprimir por pantalla el número introducido.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero del 1 al 100: ");
        int numero = teclado.nextInt();
        if  (numero > 100 || numero < 1) {
            while (numero < 1 || numero > 100) {
                System.out.println("Error, Por favor introduce otro número dentro del rango");
                numero = teclado.nextInt();
            }
        }
        {

        }
        System.out.println(numero);
    }

}
