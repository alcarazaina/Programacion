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
        int numero = pedirNumero("Introduce un número: ");
        coleccion.add(numero);
        terminar(numero, coleccion);
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
    public static void terminar(int numero, HashSet<Integer> coleccion){
        while (numero != -1){
            coleccion.add(numero);
            numero = pedirNumero("Introduce un número (-1 para terminar): ");
        }
    }
  /*  public static int mostrarPares(int numero, HashSet<Integer> coleccion){
        for (Integer elemento : coleccion)
              { if (elemento % 2 == 0) {



        }
        }
     } */
}
