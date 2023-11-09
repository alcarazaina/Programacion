package PrimeraEvaluacion.Tema04.Ejemplos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemplosArray {
    public static void main(String[] args) {
        // hasta ahora hemos trabajado con variables individuales (sólo guardan un valor)
        // ¿que pasa si quiero guardar las notas de una clase de 16 alumnos?
        double alumno1 = 5; // sólo puedo guardar un número, un valor
        double alumno2 = 8.5;
        // tendría que crear 16 variables

        // o bien...

        // utilizar una estructura que permita guardar un conjunto de valores DEL MISMO TIPO (doble, String, int... el que sea)
        // y para esto sirve el array
        int[] notas = {6, 5, 4, 8, 10, 3, 7, 7, 5, 5}; //declaro el array que se llama notas, que guarda número enteros
        // quiero recuperar la primera nota, por ejemplo para imprimirla --> accedo a través de un índice
        System.out.println(notas[0]);
        // elemento guardado en la última posición:
        System.out.println(notas[9]);
        // tamaño del array:
        System.out.println(notas.length);
        // elemento guardado en la última posición si no lo sabemos:
        System.out.println(notas[notas.length -1]);
        // si quiero cambiar un dato lo puedo hacer a través de su índice (cosa que no puedo hacer con String)
        System.out.println("*** Cambio la primera nota ***");
        notas[0] = 7;
        System.out.println(notas[0]);

        // FORMAS DE DECLARAR Y RELLENAR UN ARRAY
        // Una es como hemos visto: lo declaro y enumero los datos dentro de las llaves {}
        //lo más habitual es que no sepas los datos antes de declararlo, entonces se hace
        int[] numeros = new int[10]; // 10 es el tamaño del array, INMODIFICABLE
        // después puedo utilizar un for (muy frecuentemente) para rellenarlo
        // por ejemplo vamos a rellenar el array número con el valor de sus índices: 0, 1, 2, 3...
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
            // ¿Cómo imprimo todos los números del array?
            // Opcion A: con for
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " ");

            }
        System.out.println();
            // Opción B: con el método toString() de la clase arrays
        System.out.println(Arrays.toString(numeros));

        //Para comprobar si un array está ordenado
        System.out.println("Vamos a comprobar si esta ordenado ");
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
           if (i % 2 == 0){
               array [i] = i + 2 * i;
           } else {
               array [i] = i - 2 * i;
           }
        }
        System.out.println(Arrays.toString(array));
        int [] array1 = {-1, 2, 3, 5, 7};
        int [] array2 = {9, 8, 2, 0, -3};

        // Imaginemos que no sabemos que contiene el array y queremos averiguar si está ordenado
        //Orden ascendente
        boolean ordenado = true;
        for (int i = 0; i < array.length -1; i++) {
           if (array [i] > array [i + 1]){
               ordenado = false;
               break; // nos saca fuera de for
           }
        }
        if (ordenado) {
            System.out.println("Está ordenado ascendente: " + ordenado);
        } else { // si no esta ordenado ascendente está o descendente o no está ordenado
            boolean ordenadoDescendente = true;
            for (int i = 0; i < array.length -1; i++) {
                if (array [i] < array [i + 1]){
                    ordenadoDescendente = false;
                    break; // nos saca fuera de for
                }
            }
            if (ordenadoDescendente) {
                System.out.println("Está ordenado descendente: " + ordenadoDescendente);
            } else {
                System.out.println("Está desordenado");
            }
        }
        }
    }

