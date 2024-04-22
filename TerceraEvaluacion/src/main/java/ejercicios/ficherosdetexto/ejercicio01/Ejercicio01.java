package ejercicios.ficherosdetexto.ejercicio01;

import java.io.File;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*
Escribir un programa en Java que, para una ruta indicada por el usuario (metida por teclado -> creamos la ruta como un String. Lo que se introduce es el nombre del fichero), muestre:
-Si el fichero existe o no
-Si se trata de un directorio o de un fichero
-En caso de ser un fichero, debe mostrar su nombre, su tamaño y si tiene permisos de lectura, escritura y/o ejecución.

         */
        Scanner teclado = new Scanner(System.in);
        System.out.println(File.separator);
        String ruta = "TerceraEvaluacion\\src\\main\\java\\";
        System.out.println("Introduce una ruta dentro de la carpeta java");
        File fichero = new File(ruta + teclado.nextLine());
        if (fichero.exists()){
            System.out.println("El fichero existe");
            if(fichero.isDirectory()){
                System.out.println("Es un directorio");
            }
            if(fichero.isFile()){
                System.out.println("Es un fichero");
                System.out.println("Su nombre: " + fichero.getName());
                System.out.println("Tamaño: " + fichero.length() + " bytes");
                if (fichero.canWrite()){
                    System.out.print("w");
                }
                if (fichero.canRead()){
                    System.out.print("r");
                }
                if (fichero.canExecute()){
                    System.out.print("x");
                }
            }
        } else {
            System.out.println("El fichero no existe");
        }
    }
}
