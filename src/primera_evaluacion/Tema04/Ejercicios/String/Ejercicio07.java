package primera_evaluacion.Tema04.Ejercicios.String;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        /*
        Escribe un programa que lea una cadena y dos números enteros para indicar los límites inferior y superior respectivamente de un rango dentro de las posiciones de los caracteres de la cadena. Imprime la subcadena indicada por el rango:
a) suponiendo que ambos números siempres son mayores o iguales a 0 y menores que la longitud de la cadena;
b) Validando que sucede a)
        */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto: ");
        String cadena = teclado.nextLine();

        int li = -1;
        while (li < 0 || li > cadena.length() - 1) {
            System.out.println("Introduce el límite inferior: ");
            li = teclado.nextInt();
            if (li < 0 || li > cadena.length() - 1) {
                System.out.println("El número introducido no puede ser menor que 0 ni mayor que " + (cadena.length() - 1));
            }
        }
        int ls = -1;
        while (ls < li || ls > cadena.length() - 1){
            System.out.println("Límite superior: ");
            ls = teclado.nextInt();
            if (ls < li || ls > cadena.length() - 1){
                System.out.println("El número introducido no puede ser menor que límite inferior ni mayor que " + (cadena.length() - 1));
        }
    }
        String subcadena = cadena.substring(li, ls);
        System.out.println(subcadena);
    }
}
