package ejercicios.ficherosdetexto.ejercicio07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Escribir un programa que lea texto por teclado y lo escriba en un fichero llamado datos.txt. El proceso consiste en leer una línea de texto por teclado y escribirla en el fichero. Este proceso se repite hasta que se introduce por teclado la cadena FIN (da igual que sea en mayúsculas o minúsculas). La cadena FIN que indica el final de lectura no se debe escribir en el fichero.
 */
public class Ejercicio07 {
    public static void main(String[] args) {
       String ruta = "TerceraEvaluacion\\src\\main\\java\\ejercicios\\ficherosdetexto\\ejercicio07\\datos.txt";
       File fichero = new File(ruta);
       // ponemos lo que vamos a necesitar dentro del try catch finally

        // para escribit en el fichero un FileWriter

        FileWriter fw = null;

        // para leer por teclado un Scanner
        Scanner teclado = null;

        try {
            fw = new FileWriter(fichero, true);
            teclado = new Scanner(System.in);

            //Empezamos el ejercicio en si
            String linea = teclado.nextLine();

            while (!linea.equalsIgnoreCase("fin")){

                fw.write(linea + "\n");
                linea = teclado.nextLine();
            }

        }catch (IOException e){
            System.out.println("Excepción de E/S" + e.getMessage());
        } finally {
            // cerramos aquí el fw y el teclado
            try {
                fw.close();
                teclado.close();
            } catch (IOException e) {
                System.out.println("Excepción de E/S, no se ha podido cerrar el fw o el teclado" + e.getMessage());
            }
        }

    }
}
