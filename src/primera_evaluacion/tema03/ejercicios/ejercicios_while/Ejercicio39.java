package primera_evaluacion.tema03.ejercicios.ejercicios_while;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
/*
Realizar un ejemplo de menú, donde podemos escoger las distintas opciones hasta que seleccionamos la opción de “Salir”.
 */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Menu: Elige opción: ");
        System.out.println("Salir, para salir");
        String opcion = teclado.nextLine();
        opcion = opcion.toLowerCase();
        String salida = "salir";
        while (!salida.equals(opcion)){
            System.out.println("¿Algo más? ");

                opcion = teclado.nextLine();
                opcion = opcion.toLowerCase();
        }
            System.out.println("Fin");

    }
}
