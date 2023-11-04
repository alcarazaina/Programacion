package PruebaExamen;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /**
         * @author Ainara
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué nivel de presión atmosférica hay? Puede ser alta (A), media (M) o baja (B)");
        String presion = teclado.nextLine();
        System.out.println("Y que nivel de humedad tenemos? Puede ser alta (A), media (M) o baja (B)");
        String humedad = teclado.nextLine();

        if (presion.equalsIgnoreCase("B") && humedad.equalsIgnoreCase("A")){
            System.out.println("Probabilidad de lluvia: Media");
        } else if (presion.equalsIgnoreCase("B") && humedad.equalsIgnoreCase("M")) {
            System.out.println("Probabilidad de lluvia: Alta");
        } else if (presion.equalsIgnoreCase("B") && humedad.equalsIgnoreCase("B")) {
            System.out.println("Probabilidad de lluvia: Media");
        } else if (presion.equalsIgnoreCase("M") && humedad.equalsIgnoreCase("M")) {
            System.out.println("Probabilidad de lluvia: Media");
        } else {
            System.out.println("Probabilidad de lluvia: Baja");
        }
    }
}
