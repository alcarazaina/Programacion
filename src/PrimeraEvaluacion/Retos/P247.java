package PrimeraEvaluacion.Retos;

import java.util.Arrays;
import java.util.Scanner;

public class P247 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        teclado.nextLine();

        while (n != 0) {
            String linea = teclado.nextLine();
            String[] elementosDeLaLinea = linea.split(" ");
            //System.out.println(Arrays.toString(elementosDeLaLinea));

            int[] numeros = new int[elementosDeLaLinea.length];
            for (int i = 0; i < n; i++) {
                numeros[i] = Integer.parseInt(elementosDeLaLinea[i]);
            }
            boolean salimosDeLaCrisis = true;
            for (int i = 0; i < n - 1; i++) { // el - 1 es para no salirme del array cuando llegue a la penúltima posición
                if (numeros[i] >= numeros[i + 1]) {
                    salimosDeLaCrisis = false;
                    break;
                }
            }
            if (salimosDeLaCrisis) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
        }
        n = teclado.nextInt();
        teclado.nextLine();

    }
        teclado.close();
    }
}
