package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosfor;

public class Ejercicio19 {
    public static void main(String[] args) {
/*
Hacer un programa que calcule la suma de los números enteros del 1 al 10 (inclusive) usando el bucle for.
 */
        int suma = 0;
        for (int i = 1; i < 11; i++) {
           suma = suma + i;
        }
        System.out.println(suma);
    }
}
