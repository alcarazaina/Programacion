package teoria.ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploScannerNextInt {
    public static void main(String[] args) {
        // LECTURA DE FICHEROS CON Scanner
        //1) Objeto File
        String ruta = "TerceraEvaluacion\\src\\main\\java\\teoria\\ficheros\\";
        File fichero = new File(ruta + "fichero1.txt");
        //2) Creamos un Scanner y en vez de System.in le metemos el nombre del fichero
        Scanner lector = null; // la creamos fuera para poder cerrarla en el finally
        try {

            lector = new Scanner(fichero); // aquí pilla el fichero para leerlo
            int suma = 0;
            // leemos el fichero con un bucle while
            while (lector.hasNext()){
                // como el fichero está lleno de números queremos sumarlos.
                // leo el siguiente número
                int numero = lector.nextInt();
                // la imprimo
                suma = suma + numero;
            }
            System.out.println("Todos los números el fichero suman: " + suma);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero " + e.getMessage());
        } catch (InputMismatchException e2){
            System.out.println("El fichero contiene algo que no es un entero");
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
