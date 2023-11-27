package primera_evaluacion.Tema02.Ejercicios.ejerciciosBasicos;

import java.util.Scanner;

/*
Imagina que eres un gerente de recursos humanos en un restaurante y necesitas contratar a un chef. Para hacer eso, necesitas recopilar algunos datos preliminares sobre los candidatos, concretamente 4 campos: nombre, edad, años de experiencia, preferencia de cocina. Escribe un programa que lea todas las palabras (o números) una a una e imprima lo siguiente: "El formulario de <NOMBRE>, de <EDAD> años y <AÑOS DE EXPERIENCIA> de experiencia, está completo. Nos comunicaremos con usted si necesitamos a alguien que cocine comida <PREFERENCIA DE COCINA>".
Entrada:
Eugenio
33
8
vegetariana
Salida:
El formulario de Eugenio, de 33 años y 8 de experiencia, está completo. Nos nos comunicaremos con usted si necesitamos alguien que cocine comida vegetariana.
*/
public class Ejercicio08 {
    public static void main(String[] args) {
        //tenemos que pedir los datos al usuario
        Scanner tecla = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = tecla.nextLine(); //Cuando lo que meto por teclado es un String, el método es nextLine();
        System.out.println("Introduce ahora tu edad: ");
        int edad = tecla.nextInt(); //Cuando lo que meto por teclado es un int, el método es nextInt();
        // OJO: El método nextInt(); a demás del dato guarda un salto de linea, así que si pedimos algo por teclado a continuación puede fallar. SIEMPRE QUE UTILICEMOS nextInt();  VAMOS A AÑADIR A CONTINUACIÓN ESTA LINEA: teclado.nextLine();
        //Con esto no tendremos problema si después de nextInt(); seguimos pidiendo datos
        tecla.nextLine();
        System.out.println("¿Cuántos años tienes de experiencia? ");
        int experiencia = tecla.nextInt();
        tecla.nextLine();
        System.out.println("¿Qué te gusta cocinar? ");
        String cocina = tecla.nextLine();

        System.out.println("El formulario de " + nombre + ", de " + edad+ " años y " + experiencia + " de experiencia, está completo. \nNos comunicaremos con usted si necesitamos alguien que cocine comida " + cocina);

    }
}
