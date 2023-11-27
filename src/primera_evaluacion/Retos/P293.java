package primera_evaluacion.Retos;

import java.util.Scanner;

public class P293 {
    public static void main(String[] args) {
        /*
        1. insectos--> 6 patas
        2. arácnidos--> 8 patas
        3. crustáceos --> 10 patas
        4. nº escolopendras
        5. nº de anillos de las escolopendras

        1 1 1 1 15
        nº de patas: 1 * 6 + 1 * 8 + 1 * 10 + (1 * 15 * 2)
         */

      //ENTRADA
        Scanner teclado = new Scanner(System.in);
        // nº de casos de prueba a procesar
        int casos = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < casos; i++) {
         //cada caso de prueba es una línea
         String linea = teclado.nextLine();
         //de esto tengo que sacar los números
            String[] elementosDeLaLinea = linea.split(" ");
           // System.out.println(Arrays.toString(elementosDeLaLinea));
            //Ahora tengo que convertir esos elementos en números
            int[] números = new int[5];//o bien elementosDeLaLinea.length
            //relleno el array de números con los elementos convertidos de Srting a int
            for (int j = 0; j < 5; j++) {
             números[j] = Integer.parseInt(elementosDeLaLinea[j]);
            }
            int resultado = (números[0] * 6) + (números[1] * 8) + (números [2] * 10) + (números[3] * números[4]) * 2;
            System.out.println(resultado);
        }

        teclado.close();
    }
}
