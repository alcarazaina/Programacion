package teoria.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {
    public static void main(String[] args) {
        // Hay cuatro contructores pero nos fijaremos en los que contienen File
        // FileWriter(File file) -> le pasas un file y te añade texto nuevo a un fichero pero si el fichero ya existía y contenía algo lo va a borrar
        // FileWriter(File file, boolean append) (append es añadir al final)-> añade la información al final y no borra nada. si le pones (fichero, true)

        // Ejemplo:
        // 1) Objeto File

        String ruta = "TerceraEvaluacion\\src\\main\\java\\teoria\\ficheros\\";
        File fichero = new File(ruta + "escribir.txt");

        // 2) FileWriter pasandole el objeto file (con/sin append, según nos interese)
            FileWriter fw = null;
        try {
            fw = new FileWriter(fichero);
            // 3) Escribimos con el método write
            fw.write("Hola");
            fw.write("\nCaracola");
        } catch (IOException e) {
            System.out.println("Se ha producido un a excepción E/S" + e.getMessage());
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("No se puede cerrar el fichero" + e.getMessage());
            }
            System.out.println("Fin");
        }

    }
}
