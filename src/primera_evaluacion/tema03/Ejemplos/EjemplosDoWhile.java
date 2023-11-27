package primera_evaluacion.tema03.Ejemplos;

import java.util.Scanner;

public class EjemplosDoWhile {
    public static void main(String[] args) {
        //El mismo ejemplo de while pero con do-while
        int i = 0;
        do {
            System.out.println(i); // en este siempre imprime 0
            i++;
        } while (i < 11);

        //Otro ejemplo
        //imprimir todos los múltiplos dr 5 hasta un número introducido por teclado
        //Ejercicio 28 pero en vez de con for con do-while
        //NOTA: un buen entrenamiento puede ser hacer los ejercicios de for con do-while
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();
        i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= numero);
        }
    }