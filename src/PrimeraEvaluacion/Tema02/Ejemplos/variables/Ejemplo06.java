package PrimeraEvaluacion.Tema02.Ejemplos.variables;

import java.util.Scanner;

public class Ejemplo06 {
    public static void main(String[] args) {
        //Variables de tipo boolean
        //Son variables que solo pueden tomar dos valores: true, false
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce edad: ");
        int edad = teclado.nextInt(); teclado.nextLine();
        boolean mayorDeEdad = edad >= 18; //si edad es mayor o igual a 18 guardará true, si no guardará false
        System.out.print("Eres mayor de edad: " + mayorDeEdad);
    }
}
