package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosWhile;

public class Ejercicio37 {
    public static void main(String[] args) {
        /*
        Hacer un programa que imprima por pantalla los 50 primeros múltiplos de 5, añadiendo un salto de línea cada 10 números.
         */
        int n = 0;
        while (n < 50) {
            if (n % 10 == 0){
                System.out.println();
            }
            n = n + 1;
            System.out.print(5 * n + " ");
        }
    }
}
