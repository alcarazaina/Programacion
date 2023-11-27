package primera_evaluacion.tema03.ejercicios.ejerciciosfor;

import java.util.Scanner;

public class Ejercicio21OtraForma {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los números a y b ordenados de menos a mayor: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();

        //Otra manera es crear dos variables max y min, que guarden el mayor y el menor
       int min = 0; // Tengo que declarar las variables fuera del if porque si no no son visibles dentro del for, en general las variables que creamos dentro de un bloque, no van a poderse utilizar (no son visibles) fuera de ese bloque.
       int max = 0;
        if (a > b) {
            max = a;
            min = b; // si b es <= a
        } else { // si a no es mayor que b
            max = b;
            min = a;
        }

        int suma = 0;
        for (int i = min; i <= max ; i++) { // for qur va sumando desde el número mayor hasta el menor ambos inclusive
            suma = suma + i; // También se puede poner: suma += i;
        }
        System.out.println(suma);
    }
}
