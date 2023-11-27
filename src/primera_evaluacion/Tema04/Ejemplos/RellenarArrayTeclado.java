package primera_evaluacion.Tema04.Ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class RellenarArrayTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Tenemos que declarar un array y asignarle un tamaño
        // vamos a meter el tamaño también por teclado
        int n = teclado.nextInt();
        teclado.nextLine(); //para que no haga un salto y no deje entrar por teclado el primer string
        // Suponemos que queremos rellenar el array con cadenas de texto
        String[] cadenas = new String[n];

        //Ahora con un for vamos rellenándolo
        for (int i = 0; i < cadenas.length; i++) {
            //en el elemento con índice i de cadenas guardamos lo que entre por teclado
            //no es necesario crear una variable aparte
            cadenas[i] = teclado.nextLine();
        }

        System.out.println(Arrays.toString(cadenas));
    }
}
