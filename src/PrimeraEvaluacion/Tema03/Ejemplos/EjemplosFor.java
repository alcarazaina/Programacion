package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Scanner;

public class EjemplosFor {
    public static void main(String[] args) {
        //Ejemplo: hacer un programa que imprima 5 veces hola
        for (int i = 0; //Aquí inicializamos la variable del bucle "desde..."
             i < 5; //Condición: mientras sea true el resultado de la condición seguiremos en el bucle
             i++ //modificación: aquí ponemos algo que modifique en cada interacción el valor de i, para que alguna vez sea false la condición y podamos salir del bucle
        ) {
            System.out.println("hola");
        }
        System.out.println("Cuando finaliza sigue por aquí");
    }
}
