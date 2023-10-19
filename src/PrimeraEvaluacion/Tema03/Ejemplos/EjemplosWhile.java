package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Scanner;

public class EjemplosWhile {
    public static void main(String[] args) {
        // El bucle while empieza evaluado una condición
        // si el resultado es true, entra en el bloque {} y ejecuta el código qur contenga
        // al finalizar, vuelve arriba a comprobar de nuevo la condición
        // asi sucesivamente hasta que la condición da como resultado false
        int i = 0;
        while (i < 11) {
            System.out.println(i);
            // para que esto pare en algún momento tenemos que hacer que cambie la condición
            i++;
        }
        //Otro ejemplo
        //imprimir todos los múltiplos dr 5 hasta un número introducido por teclado
        //Ejercicio 28 pero en vez de con for con while
        //NOTA: un buen entrenamiento puede ser hacer los ejercicios de for con while
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();
        i = 1;
        while (i <= numero){
         if (i % 5 == 0){
             System.out.println(i);
         }i++;
            }
        }
    }

