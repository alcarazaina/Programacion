package primera_evaluacion.tema03.ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio16SwitchChar {
    public static void main(String[] args) {
         /*
        Escribe un programa que pida dos números enteros, y pida la operación que quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y visualizar el resultado. En caso de que el símbolo introducido no sea correcto, visualizar: operación incorrecta.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int n1 = teclado.nextInt();
        teclado.nextLine(); // para que funcione después de nextInt
        System.out.println("Ahora introduce un operador: ");
        char operador = teclado.nextLine().charAt(0); //para meter un carácter por teclado utilizamos .charAt(0)
        System.out.println("Introduce otro número para operar: ");
        int n2 = teclado.nextInt();

        switch (operador) {
            case '+' -> { //Switch se muestra con comillas simples
                int resultado = n1 + n2;
                System.out.println("El resultado de la suma es " + resultado);
            }
            case '-' -> {
                int resultado = n1 - n2;
                System.out.println("El resultado de la resta es " + resultado);
            }
            case '/', ':' -> {
                int resultado = n1 / n2;
                System.out.println("El resultado de la división es " + resultado);
            }
            case '*' -> {
                int resultado = n1 * n2;
                System.out.println("El resultado de la multiplicación es " + resultado);
            }
            default -> System.out.println("Operación incorrecta");
        }
    }
}
