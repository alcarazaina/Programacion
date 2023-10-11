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

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 20 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i > 0 ; i--) {
            System.out.print(i + " "); //imprime del 10 al 1
        }
        System.out.println();
        //Los números de la inicialización, etc. Pueden ser variables o constantes
        int inicio = 0;
        int fin = 10;

        for (int i = inicio; i < fin; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        // Una de las aplicaciones de los bucles for es el ir acumulando, sumando, valores que se van generando en cada interacción
        //Ejemplo: queremos sumar todos los números que van del 1 al 10 (ambos inclusive) O sea, que tengo qye sumar 1 + 1, 1 + 2, 1 + 3, 1 + 4...1 + 10
        //El 1, el 2, el 3... son los valores de i en cada interacción
        //sólo necesito añadir una variable que los vaya acumulando
        int suma = 0;
        for (int i = 1; i <11; i++) {
      suma = suma + i; //suma lo que tengo en suma hasta este momento y le añade lo que vale i en esa interación
            System.out.println("Sumamos " + i + ": " + suma);
        }
        System.out.println();
        int suma1 = 0;
        for (int i = 1; i <11; i +=2) {
            suma1 = suma1 + i; //suma lo que tengo en suma hasta este momento y le añade lo que vale i en esa interación
            System.out.println("Sumamos " + i + ": " + suma1);
        }
    }
}
