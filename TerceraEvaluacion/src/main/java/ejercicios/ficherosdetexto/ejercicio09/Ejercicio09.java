package ejercicios.ficherosdetexto.ejercicio09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Escribir un programa que busque una palabra o un fragmento en un fichero de texto. El programa pedirá que se introduzca una palabra o un texto por teclado y realizará su búsqueda por el archivo. Se mostrará por pantalla el número de línea y el contenido de la línea del fichero que contiene la cadena buscada. Si la cadena buscada aparece en varias líneas se mostrarán todas ellas. Si el fichero no contiene el texto buscado se mostrará un mensaje indicándolo.
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        // preparamos toodo para la lectura. Elegimos este mismo fichero (Ejercicio09.java)
        String ruta = "TerceraEvaluacion/src/main/java/ejercicios/ficherosdetexto/ejercicio09/Ejercicio09.java";
        File fichero = new File(ruta);

        // necesitamos un Scanner para leer por teclado y otro para leer el fichero

        Scanner lector = null;
        Scanner teclado = null;
        // también necesitamos un contador para las lineas (con cada iteración se incrementa en 1)
        int numLinea = 0;
        // también necesito un boolean para identificar si el texto está o no en el fichero
        boolean encontrado = false;

        try {
            lector = new Scanner(fichero);
            teclado = new Scanner(System.in);

            // Pedimos los que queremos buscar

            System.out.println("Introduce: ");
            String texto = teclado.nextLine();

            // ahora empezamos a buscar
            while (lector.hasNextLine()){
                numLinea ++;
                String linea = lector.nextLine();
                // veo si la linea contiene el texto
                if (linea.contains(texto)){
                    System.out.println( numLinea + " " + linea);
                    // si lo encontramos encontrado es true
                    encontrado = true;
                }
            }

            // si no aparece, habrá recorrido toodo el fichero sin meterse en el if, y por tanto encontrado seguira a false
            if (!encontrado){
                System.out.println("El texto no se encuentra en el fichero");
            }


        }catch (FileNotFoundException e){
            System.out.println("No hay fichero" + e.getMessage());
        }finally {
            lector.close();
            teclado.close();
        }
    }
}
