package PruebaExamen;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /**
         * @author Ainara
         */
        System.out.println("Elige una opción: \n1. Sumar números. \n2. Multiplicar números. \n3. Contar números.");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
        while (opcion != 1 && opcion != 2 && opcion != 3){
            System.out.println("Opción incorrecta. \nElige una opción: \n1. Sumar números. \n2. Multiplicar números. \n3. Contar números.");
            opcion = teclado.nextInt();
        }
        if (opcion == 1){
            System.out.println("¿Cuántos números vas a introducir?");
            int numIntro = teclado.nextInt();
            int suma = 0;
            int total = 0;
            int numero = 0;
            while (numIntro > suma){
                suma++;
                System.out.println("Introduce un número: ");
                numero = teclado.nextInt();
                total = total + numero;
            }
            System.out.println("Suma = " + total);
        } else if (opcion == 2) {
            System.out.println("¿Cuántos números vas a introducir?");
            int numIntro = teclado.nextInt();
            int suma = 0;
            int total = 1;
            int numero = 0;
            while (numIntro > suma) {
                suma++;
                System.out.println("Introduce un número: ");
                numero = teclado.nextInt();
                total = total * numero;
            }
            System.out.println("Producto = " + total);
        } else {
            System.out.println("Introduce cuantos números quieras, usa 0 para finalizar ");
            int n = teclado.nextInt();
            int suma = 0;
            while (n != 0){
                n = teclado.nextInt();
                suma++;
            }
            System.out.println("Has introducido " + suma + " números.");
        }
    }
}
