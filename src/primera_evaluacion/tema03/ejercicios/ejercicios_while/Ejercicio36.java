package primera_evaluacion.tema03.ejercicios.ejercicios_while;

public class Ejercicio36 {
    public static void main(String[] args) {
        /*
        Hacer un programa que imprima por pantalla los veinte primeros múltiplos de 5.
         */
        int n = 0;
        while (n < 20) {
            n = n + 1;
            System.out.print(5 * n + " ");
        }
    }
}
