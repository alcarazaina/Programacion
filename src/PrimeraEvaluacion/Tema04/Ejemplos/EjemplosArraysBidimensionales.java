package PrimeraEvaluacion.Tema04.Ejemplos;

import java.util.Arrays;
import java.util.Random;

public class EjemplosArraysBidimensionales {
    public static void main(String[] args) {
        // Un array bidimensional es un array en dos dimensiones formado por cierto número de arrays que no necesitan tener el mismo tamaño
        // Se utilizan muchas veces para representar las formas bidimensionales como un tablero, un plano, matriz, etc.
        // Un array bidimensional se declara poniendo dos corchetes en lugar de uno
        // el primer corchete es el número de filas ( = nº de arrays que tiene el array bidimensional)--> i
        // el segundo se relaciona con el número de columnas (elemento del índice del array i)

        // el siguiente array bidimensional está formado por tres arrays unidimensionales, cada uno con 4 elementos (pero no tendría por qué ser iguales)
        int[][] tabla = {
                {1, 2, 3, 1}, // primer array de enteros -> índice 0
                {3, 4, 1, 2}, // segundo array de enteros -> índice 1
                {4, 4, 1, 0}  // tercer array de enteros -> índice 2
        };

        //si en un array bidimensional quiero referirme a una fila completa (es decir, a uno de los arrays que lo componen lo indico mediante un solo índice)
        System.out.println(Arrays.toString(tabla[0]));
        System.out.println(Arrays.toString(tabla[1]));
        System.out.println(Arrays.toString(tabla[2]));

        // si en vez de referirme a una fila quiero referirme a un elemento del array bidimensional, lo indicamos asi : tabla [i][j] siendo i la fila (de 0 a (filas -1)) y j la columna (de 0 a tabla[i].length -1)
        System.out.println(tabla[1][2]);
        System.out.println("Extremos: ");
        //si quiero sacar el elemento que está en el extremo superior izquierdo
        System.out.println(tabla[0][0]);
        // elemento inferior derecho
        System.out.println(tabla[tabla.length - 1][0]); // porque la longitud de un array bidimensional es su número de filas, el número de arrays unidimensionales que lo componen

        //el elemento que esta en el extremo superior derecho
        System.out.println(tabla[0][tabla[0].length - 1]);
        // el elemento inferior derecho (última fila última columna)
        System.out.println(tabla[tabla.length - 1][tabla[tabla.length -1].length -1]);

        // lo normal es que corramos los arrays bidimensionales tanto como leerlos como para rellenarlos o modificarlos con un for anidado donde las filas las recorro con la i y las columnas con la j

        // vamos a hacer una array de caracteres de tamaño 6x4
        char [][] caracteres = new char[6][4];
        //lo vamos a rellenar con caracteres elegidos aleatoriamente de la tabla ascii
        Random generador = new Random();
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres[i].length; j++) {
                caracteres[i][j] = (char) generador.nextInt(64,95); // (char) lo que hace es un casting explicito, convierte el número entero generado en un char
            }
        }
       //ahora lo imrpimimos
        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres[i].length; j++) {
                // este for me imprime desde 0 hasta el final de la línea i en la que estamos
                System.out.print(caracteres[i][j] + "\t ");
            } System.out.println(); // cada vez que imprimimos una línea completa hacemos un salto antes de entrar en la siguiente
        }

        // quiero el 3 elemento de la 4 fila
        System.out.println(caracteres[3][2]);
    }
}
