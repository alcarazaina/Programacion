package Pruebas;

import java.util.Scanner;

public class Prueba04 {
    public static void main(String[] args) {
        /*
        3- Escribe un programa que reciba un número y se imprima la letra correspondiente
según el orden alfabético. Es decir, si el usuario introduce el número “2” el programa
tendrá que imprimir la letra “B”
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int numero = teclado.nextInt();
        if (numero < 15 && numero >= 1){

            int letra = 96 + numero;
            char letraImpresa = (char) letra;
            System.out.println(letraImpresa);

        } else if (numero == 15) {
            char letraImpresa = 'ñ';
            System.out.println(letraImpresa);

        } else if (numero <= 27) {

            int letra = 96 + numero - 1;
            char letraImpresa = (char) letra;
            System.out.println(letraImpresa);

        }else {
            System.out.println("El número introducido no es válido");




        }
        String abecedario = "abcdefghijklmnñopqrstuvwxyz";
        char letra = abecedario.charAt(numero - 1);
        System.out.println(letra);
    }
}
