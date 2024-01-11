package segunda_evaluacion.tema06Colecciones.ejercicios;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio01Colecciones {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Implementar una aplicación que pida por consola números enteros no negativos hasta que se introduce -1. Los números se irán insertando en una colección, no pudiéndose repetir. Al terminar, se mostrará la colección por pantalla. A continuación, se mostrarán todos los valores pares. Por último, se eliminarán todos los múltiplos de 3 y se mostrará por pantalla la colección resultante. Utiliza métodos para las diferentes tareas.
         */
        HashSet<Integer> coleccion = new HashSet<>();
        //int numero = pedirNumero("Introduce un número: ");
        //coleccion.add(numero);
        //comprobar(numero, coleccion);
        coleccion = pedirDatos();
        mostrarNumero(coleccion);
        mostrarPares(coleccion);
        coleccion = eliminarMultiplos3(coleccion);
        mostrarNumero(coleccion);
    }
    public static int pedirNumero (String texto){
        System.out.println(texto);
        int numero = teclado.nextInt(); teclado.nextLine();
        return numero;
    }
    public static void mostrarNumero(HashSet<Integer> coleccion){
        System.out.println(coleccion);
    }
   /* public static void comprobar(int numero, HashSet<Integer> coleccion){
        while (numero != -1){
            coleccion.add(numero);
            numero = pedirNumero("Introduce un número (-1 para terminar): ");
        }
    } */

    public static HashSet<Integer> pedirDatos(){
        HashSet<Integer> coleccion = new HashSet<>();
        int numero = 0;
        while (numero != -1) {
            numero = pedirNumero("Introduce un número natural (-1 para terminar): ");
            if (numero >= 0){
                coleccion.add(numero);
            } else if (numero == -1) {
                System.out.println("Has salido del programa, este es el resultado: ");
            }else {
                System.out.println("El número introducido no es un número natural.");
            }
        }
        return coleccion;
    }

    public static void mostrarPares(HashSet<Integer> coleccion){
        for (Integer elemento : coleccion) {
            if (elemento % 2 == 0) {
                System.out.print(elemento + " ");
        }
        }
        System.out.println();
     }
    public static HashSet<Integer> eliminarMultiplos3 (HashSet<Integer> coleccion){
        HashSet<Integer> coleccionNueva = new HashSet<>();
        for (Integer elemento : coleccion) {
            if (elemento % 3 != 0) {
                coleccionNueva.add(elemento);
            }
        }
        return coleccionNueva;
    }
}
