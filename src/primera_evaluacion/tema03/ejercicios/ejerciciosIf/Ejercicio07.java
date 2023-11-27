package primera_evaluacion.tema03.ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        /*
        A las marmotas les gusta organizar fiestas, y en sus fiestas les gusta comer tazas de mantequilla de cacahuete. Pero no debe haber muchas, porque si no enferman. Una fiesta de la marmota exitosa tiene entre 10 y 20 tazas de mantequilla de cacahuete, ambas inclusive, a menos que sea fin de semana, en cuyo caso necesitarán de 15 a 25 tazas.
Escribe un programa que lea dos valores:
El primero es el número de tazas de mantequilla de cacahuete que hay en la fiesta.
El segundo es un booleano que indica si es fin de semana.
El programa debe imprimir si la fiesta tiene éxito o no (true o false)
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas tazas de mantequilla hay? ");
        int tazas = teclado.nextInt();
        System.out.println("¿Es fin de semana? Contestar con true o false ");
        boolean finDeSemana = teclado.nextBoolean();
        boolean exito = false; //inicializamos a false (equivalente a 0 en int)
        if (finDeSemana){
            exito = tazas >= 15 && tazas <= 25;
        } else {
            exito = tazas >= 10 && tazas <= 20;
        }if (exito){
            System.out.println("Éxito, ¡Vaya fiestón!");
        }else {
            System.out.println("La fiesta ha fracasado");
        }
    }
}