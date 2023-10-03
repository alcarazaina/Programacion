package Pruebas;

import java.sql.SQLOutput;
import java.util.Scanner;
//1 - Pregunta al usuario cuántos años tiene y después, imprime en que año nació
public class Prueba01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();
        System.out.println(2023-edad);
//2 - Pregunta al usuario cuanto mide y cuanto pesa y después imprime su IMC (Índice de masa corporal)

        System.out.println("Introduce tu peso en kgs:  ");
        double peso = teclado.nextDouble();
        System.out.println("Introduce tu estatura en metros: ");
        double estatura = teclado.nextDouble();
        System.out.println(peso/(estatura*estatura));
    }
}
