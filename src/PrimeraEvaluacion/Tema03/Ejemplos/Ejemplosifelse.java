package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Scanner;

public class Ejemplosifelse {
    public static void main(String[] args) {

/*
if (expresión) {
// instrucciones que se ejecutan si expresión es true
} else {
// instrucciones que hacen otra cosa si expresión es false
}
 */

        //Pido una edad y, si es mayor de edad, puede ver la película; en caso contrario, no decimos nada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Edad: ");
        int edad = teclado.nextInt();
        if (edad >=18 ) { //Aquí entra solo si el resultado es true
            System.out.println("Pasa, puedes ver la peli.");
        } else { // si el resultado de la explresión es false( puede traducirse como si no..)
            System.out.println("No puedes pasar");
        }
        // ... Si es menor de edad (si es false, no se ejecuta la línea 17 y saltaría a esta línea.
        System.out.println("Esto se imprime siempre, tanto si es true o si es false");

        if (edad < 16){
            System.out.println("Todavía no puedes trabajar ");
        } else if (edad >= 16 && edad < 65 ) {
            System.out.println("Puedes trabajar");
        }
        else {
            System.out.println("Te jubilas");
    }
    }
}
