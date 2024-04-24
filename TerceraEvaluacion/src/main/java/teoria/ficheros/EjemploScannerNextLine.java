package teoria.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploScannerNextLine {
    public static void main(String[] args) {
        // LECTURA DE FICHEROS CON Scanner
        //1) Objeto File
        String ruta = "TerceraEvaluacion\\src\\main\\java\\teoria\\ficheros\\";
        File fichero = new File(ruta + "fichero1.txt");
        //2) Creamos un Scanner y en vez de System.in le metemos el nombre del fichero
        Scanner lector = null; // la creamos fuera para poder cerrarla en el finally
        try {

            lector = new Scanner(fichero); // aquí pilla el fichero para leerlo

            // leemos el fichero con un bucle while
            while (lector.hasNext()){
                //leo la siguiente línea
                String linea = lector.nextLine();
                // la imprimo
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero " + e.getMessage());
        } catch (Exception e){
            System.out.println("Excepción no prevista " + e.getMessage());
            e.printStackTrace();
        } finally {
            // el código de finally se ejecuta SIEMPRE, tanto si ha saltado una excepción como si
            // Aquí no interesa cerrar todos los objetos que hayamos abierto en try
            lector.close();
            System.out.println("Fin");
        }

    }
}
