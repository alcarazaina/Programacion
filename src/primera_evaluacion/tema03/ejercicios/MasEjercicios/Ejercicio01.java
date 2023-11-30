package primera_evaluacion.tema03.ejercicios.MasEjercicios;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*
        Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
         */

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        boolean primo = true;

        if (n == 0 || n == 1){
            System.out.println("No es primo, no entra en consideración");
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                System.out.println("No es primo, porque es divisible entre " + i);
                primo = false;
                break; // basta que encuentre un divisor para decir que no es primo y salga fuera
            }
        }
    if (primo){
        System.out.println("Es primo");
    }
    }
}
