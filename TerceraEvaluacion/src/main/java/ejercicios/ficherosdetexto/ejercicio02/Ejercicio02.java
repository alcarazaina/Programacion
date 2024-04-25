package ejercicios.ficherosdetexto.ejercicio02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        Partiendo del fichero Restaurantes.csv, crear un programa de Java que muestre los datos de todos aquellos restaurantes cuyo código postal empiece por 6.
         */
        // 1) Leer el fichero Restaurantes.csv
        String ruta = "TerceraEvaluacion\\src\\main\\java\\ejercicios\\ficherosdetexto\\ejercicio02\\Restaurantes.csv";
        File fichero = new File(ruta);
        // vamos a ver si existe el fichero por si acaso
        if (fichero.exists()){
            System.out.println("Existe");
        } else {
            System.out.println("Tengo mal la ruta");
        }
        // 2) Ahora creo un lector con Scanner
        Scanner lector = null;

        try {
            lector = new Scanner(fichero);
            // Recorrer el fichero
            while (lector.hasNext()){
                String linea = lector.nextLine(); // lo que hace nextLine es avanzar una línea así que no hace falta un i++
                // para ver que funciona imprimimos línea a línea el fichero
                String [] campos = linea.split(",");
                // ahora tengo que sacara el código postal que en el array campos tiene el índice 4
                // System.out.println(campos[4]);
                // Pero solo quiero imprimir los que empiezan por 6
                // String nombre = campos[0];
                // String direccion = campos[1];
                // String ciudad = campos[2];
                // String estado = campos[3];
                // String cp = campos[4];
                if (campos[4].startsWith("6")){
                    System.out.println(linea);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se puede crear el objeto lector por lo que sea");
        } finally {
            lector.close();
            System.out.println("Fin");
        }

    }
}
