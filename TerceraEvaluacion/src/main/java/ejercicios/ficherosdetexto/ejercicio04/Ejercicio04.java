package ejercicios.ficherosdetexto.ejercicio04;

import java.io.File;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
/*
Crear un programa que borre el fichero cuya ruta ha sido introducida por el usuario.
 */
        // 1) Creo un teclado para meter la ruta
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la ruta");
        String ruta = teclado.nextLine();

        // 2) Creo un objeto File con esa ruta
        File fichero = new File(ruta);
        if (fichero.exists()){
            boolean borrado = fichero.delete();
            System.out.println("Fichero borrado");
        }else {
            System.out.println("No se ha podido borrar el fichero");
        }
        teclado.close();
    }
}
