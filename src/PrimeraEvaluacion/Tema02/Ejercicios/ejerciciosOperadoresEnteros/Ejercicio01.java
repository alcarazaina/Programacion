package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosOperadoresEnteros;

public class Ejercicio01 {
    public static void main(String[] args) {
/*
A partir de una variable num1 con valor inicial 12 y una variable num2 con valor inicial 4, crear nuevas variables que almacenen el resultado de realizar la suma, resta, multiplicación, división y resto de num1 y num2. Mostrar el valor de las nuevas variables por pantalla.
 */
        int num1 = 12;
        int num2 = 4;

        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        int cociente = num1 / num2;
        int resto = num1 % num2;

        System.out.println("La suma de 12 + 4 es: " + suma);
        System.out.println("La resta de 12 - 4 es: " + resta);
        System.out.println("El producto de 12 * 4 es: " + producto);
        System.out.println("El cociente de 12 / 4 es: " + cociente);
        System.out.println("El resto de 12 % 4 es: " + resto);

    }
}
