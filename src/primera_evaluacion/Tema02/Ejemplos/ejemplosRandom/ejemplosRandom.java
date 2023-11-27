package primera_evaluacion.Tema02.Ejemplos.ejemplosRandom;

import java.util.Random;

public class ejemplosRandom {
    public static void main(String[] args) {
        // La clase random sirve para generar números al azar.
        Random generador = new Random();
        int numeroAleatorio = generador.nextInt(10);
        // vamos a generar y mostrar 100 números aleatorios con un for
        for (int i = 0; i < 100; i++) {
            System.out.print(numeroAleatorio + " ");
            numeroAleatorio = generador.nextInt(10); // genera número entre 0 y 9
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
                System.out.print(numeroAleatorio + " ");
                numeroAleatorio = generador.nextInt(1, 11); //genera un número entre 1 y 11
                //en general, si quieres generar números entre min y max,
                // haces generador.nextInt(min, max +1)
            }
        //Otro ejemplo queremos generar 50 números entre -10 y 10, ambos inclusive
        System.out.println();
        System.out.println("100 números entre -10 y 10");
        for (int i = 0; i < 50; i++) {
            System.out.print(generador.nextInt(-10,11) + " ");

        }
    }
}
