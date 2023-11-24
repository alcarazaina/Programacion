package PrimeraEvaluacion.Retos;

import java.util.Scanner;

public class P663 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int casos = teclado.nextInt();
        int año = 0;
        for (int i = 0; i < casos; i++) {
            año = teclado.nextInt();
            if (año > 0){
                System.out.println(año - 1);
            } else if (año == 0) {
                System.out.println(año + 1);
            } else {
                System.out.println(año);
            }
        }
    }
}
