package primera_evaluacion.tema03.ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio13switch {
    public static void main(String[] args) {
             /*
        Escribe un programa que lea el número de dirección (1 - arriba, 2 - abajo, 3 - izquierda, 4 - derecha, 0 – no mover) y muestre el texto « subir », o «bajar», o « mover a la izquierda », o« mover a la derecha », o« no mover », según el número introducido). Si es un número que no pertenece a ninguna de las direcciones enumeradas, el programa debería generar: « ¡error! »
         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dirección: ");
        System.out.println("1. Arriba.");
        System.out.println("2. Abajo.");
        System.out.println("3. Izquierda.");
        System.out.println("4. Derecha.");
        System.out.println("0. No mover.");

        int direccion = teclado.nextInt();

        switch (direccion){
            case 1:
                System.out.println("Subir");
                break;
            case 2:
                System.out.println("Bajar");
                break;
            case 3:
                System.out.println("Mover a la izquierda");
                break;
            case 4:
                System.out.println("Mover a la derecha");
                break;
            case 0:
                System.out.println("No mover");
                break;
            default:
                System.out.println("Error 126, dirección no válida");
        }
    }
}
