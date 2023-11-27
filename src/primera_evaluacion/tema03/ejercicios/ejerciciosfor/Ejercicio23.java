package primera_evaluacion.tema03.ejercicios.ejerciciosfor;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        /*
        [FOR ANIDADO] Escribe un programa que, dado un número n introducido por teclado, dibuje un cuadrado de dimensiones n * n, con un carácter también introducido por teclado.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las medidas de la tabla cuadrada: ");
        int n = teclado.nextInt();
        System.out.println("Introduce un carácter: ");
        String caracter = teclado.next();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(caracter + "\t");
            }
            System.out.println();
        }
    }
}
