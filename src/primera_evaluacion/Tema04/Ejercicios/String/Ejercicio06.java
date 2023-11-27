package primera_evaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea dos cadenas y las compare sin tener en cuenta los espacios en blanco. El programa debería imprimir true si son iguales, false en caso contrario.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String cadena = teclado.nextLine();
        System.out.println("Introduce otra cadena de texto: ");
        String cadena2 = teclado.nextLine();

        String cadenaSE = cadena.replace(" ", "");
        String cadena2SE = cadena2.replace(" ","");
        boolean respuesta = cadena2SE.equals(cadenaSE);
        System.out.println(respuesta);
    }
}
