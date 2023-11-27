package primera_evaluacion.Tema04.Ejemplos;

import java.util.Arrays;

public class Foreach {
    public static void main(String[] args) {
        // for-each es una manera de recorrer arrays alternativa al for
        /*
        for (tipoArray valor : nombreArray) {
    //instrucciones sobre el array
        }
         */

        //ejemplo: vamos a crear un array y a rellenarlo
        int[] nombreArray = {1, 2, 4, 8, 16, 32, 34, 128, 256, 512, 1024};

        //lo recorremos con for-each
        //valor es el nombre que le damos en este caso (lo podemos llamar como queramos) es una variable temporal que designa a cada uno de los elementos del array
        for (int valor: nombreArray) {
            System.out.println(valor * 2); //imprimimos cada elemento multiplicado por dos
            //seria equivalente a escribir, en vez de valor, nombreArray[i] en un for
        }
        //hacemos otro ejemplo de contar el número de 'a' que hay en un array de carácteres
        String cadena = "valor es el nombre que le damos en este caso (lo podemos llamar como queramos) es una variable temporal que designa a cada uno de los elementos del array";
        //Truco: si quiero meter en un array todas las letras de una cadena de texto, me sirve el método toCharArray
        char[] letras = cadena.toCharArray();
        System.out.println("Cadena tiene "+ letras.length + " caracteres: " + Arrays.toString(letras));
        //quiero hacer un array que guarde el número de 'a', el número de 'e', y el número de 'i', el número de 'o' y el número de 'u'
        //creo un array con 5 elementos de tipo int
        int[] contadores = new int[5];
        // contadores [0] guardará el número de 'a'
        // contadores [1] guardara el número de 'e' ... etc

        //quiero recorrer el array de letras y guarde los contadores
        for (char valor: letras) {
            if (valor == 'a'){
            contadores[0]++; // lo que tenía en contadores [0] se incrementa en una unidad
            } else if (valor == 'e') {
            contadores [1]++;
            } else if (valor == 'i') {
            contadores [2]++;
            } else if (valor == 'o') {
           contadores [3]++;
            }else if (valor == 'u'){
            contadores [4]++;
            }
        }

        // imprimo el array de contadores
        System.out.println("Número de 'a': " + contadores[0]);
        System.out.println("Número de 'e': " + contadores[1]);
        System.out.println("Número de 'i': " + contadores[2]);
        System.out.println("Número de 'o': " + contadores[3]);
        System.out.println("Número de 'u': " + contadores[4]);

    }
}
