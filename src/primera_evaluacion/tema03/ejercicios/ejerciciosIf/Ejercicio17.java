package primera_evaluacion.tema03.ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        /*
        Escribe un programa que responda a un usuario que quiere comprar un helado en una conocida marca de comida rápida cuanto le costará en función del topping que elija.
El helado sin topping cuesta 1.90€.
El topping de oreo cuesta 1€.
El topping de KitKat cuesta 1.50€.
El topping de brownie cuesta 0.75€.
El topping de lacasitos cuesta 0.95€.
En caso de no disponer del topping solicitado por el usuario el programa escribirá por pantalla «no tenemos este topping, lo sentimos. » y a continuación informará del precio del helado sin ningún topping.
Finalmente, el programa escribe por pantalla el precio del helado resultante.
         */
        System.out.println("""
                El helado sin topping cuesta 1.90€.
                El topping de oreo cuesta 1€.
                El topping de KitKat cuesta 1.50€.
                El topping de brownie cuesta 0.75€.
                El topping de lacasitos cuesta 0.95€.""");
        System.out.println("Bienvenido a Helados DAE, ¿Qué toppings desea añadir a su helado? ");
        Scanner teclado = new Scanner(System.in);
        String topping = teclado.next();
        double helado = 1.90; //Otra forma de hacerlo sería crear una costante que para crearla se utilizaría la palabra final y el nombre lo escribimos en mayúscula EJ: final double PRECIO_BASICO = 1.9 (en las constantes si se puede utilizar la barra baja);
        double oreo = 1;
        double kitkat = 1.50;
        double brownie = 0.75;
        double lacasitos = 0.95;
        if (topping.equals("oreo")) {
          double precio = helado + oreo;
            System.out.println("El precio del helado es de " + precio);
        } else if (topping.equals("kitkat")) {
            double precio = helado + kitkat;
            System.out.println("El precio del helado es de " + precio);
        } else if (topping.equals("brownie")){
            double precio = helado + brownie;
            System.out.println("El precio del helado es de " + precio);
        } else if (topping.equals("lacasitos")) {
            double precio = helado + lacasitos;
            System.out.println("El precio del helado es de " + precio);
        } else {
            System.out.println("No tenemos ese topping, el precio del helado es: " + helado);
        }
    }
}
