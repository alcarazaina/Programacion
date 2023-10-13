package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida dos números enteros, y pida la operación que quiere realizar con estos (+, -, *, /). El programa debe realizar la operación pedida y visualizar el resultado. En caso de que el símbolo introducido no sea correcto, visualizar: operación incorrecta.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num1 = teclado.nextInt();
        System.out.println("Ahora introduce un operador: ");
        String operador = teclado.next();
        System.out.println("Introduce otro número para realizar la operación: ");
        int num2 = teclado.nextInt();

        if (operador.equals("+")) {
            int resultado = num1 + num2;
            System.out.println("El resultado de la suma es " + resultado);
        } else if (operador.equals("-")) {
            int resultado = num1 - num2;
            System.out.println("El resultado de la resta es " + resultado);
        } else if (operador.equals("/")) {
            int resultado = num1 / num2;
            System.out.println("El resultado de la división es " + resultado);
        } else if (operador.equals("*")) {
            int resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es " + resultado);
        } else {
            System.out.println("Operación incorrecta");
        }
    }

    }

