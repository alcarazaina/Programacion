package ejercicios.ficherosdetexto.ejercicio03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Partiendo del fichero nombres.csv, crear un programa que permita al usuario añadir nombres nuevos a ese fichero.
 * @author Aina
 */
public class Ejercicio03 {
    public static void main(String[] args) {

        String ruta = "TerceraEvaluacion\\src\\main\\java\\ejercicios\\ficherosdetexto\\ejercicio03\\nombres.csv";
        File fichero = new File(ruta);
        boolean existe = fichero.exists();
        if (existe){
            //aquí metemos lo que haya que hacer
            FileWriter fw = null;

            try {
                fw = new FileWriter(fichero, true);
                String linea = pedirCosas();
                fw.write("\n" + linea);
            } catch (IOException e) {
                System.out.println("Una excepción, amigo" + e.getMessage());
            } finally {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Excepción" + e.getMessage());
                }
                System.out.println("Se acabó el programa, amigo");
            }
        } else {
            System.out.println("El fichero no existe, amigo");
        }

    }

    /**
     * Método que pide nombre y apellidos
     * @return la línea a añadir al fichero
     */
    private static String pedirCosas(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cómo te llamas, amigo?");
        String nombre = teclado.nextLine();
        System.out.println("¿Tu apellido, amigo?");
        String apellido = teclado.nextLine();
        System.out.println("¿El otro?");
        String apellido2 = teclado.nextLine();
        return nombre + "|" + apellido + "|" + apellido2;
    }
}
