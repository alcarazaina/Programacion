package segunda_evaluacion.tema06Colecciones.poo.metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16ArraysConArraylist {
    // quiero un Scanner que sea visible en todos los métodos de esta clase
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
       // Crear un programa que cree un array de números enteros (tamaño introducido por teclado), muestre el siguiente menú y realice // lo que en las opciones se indica:
        // otra forma: int tamaño = Integer.parseInt(teclado.nextLine());

        int tamaño = pedirNumero("Introduce tamaño"); // me da igual porque es un Arraylist
        // crear arraylist de numero enteros
        ArrayList<Integer> numeros = crearArraylist();

// Añadir número al final: pide un número y lo añade al final del array.

        numeros = añadirAlFinal(numeros);

// imprimimos el arraylist

     imprimirNumeros(numeros);
// Añadir número en una posición: pide un número y una posición, y si la posición existe en el array lo añade en esa posición (la posición se pide a partir de 1).
        int numero = pedirNumero("Introduce número: ");
        int indice = pedirNumero("¿En que índice lo ponemos? ");
        if (indice <= numeros.size() - 1){
            numeros.add(indice, numero);
        }
        imprimirNumeros(numeros);
// Longitud del array: muestra el tamaño del array.
// Eliminar el último número: muestra el último número del array y lo borra.
// Eliminar un número: pide una posición, y si la posición existe en el array borra el elemento que contiene (lo reemplaza con un 0).
// Contar números: pide un número y te dice cuántas veces aparece en el array.
// Posiciones de un número: pide un número y te dice en que posiciones está.
// Mostrar números: Muestra los números que contiene.
// Salir

    }

    public static ArrayList<Integer> añadirAlFinal(ArrayList<Integer> numeros) {
        int numeroFinal = pedirNumero("Introduce el número a añadir: ");
        numeros.add(numeroFinal);
        return numeros; // devolvemos el arraylist modificado
    }

    // método que pida el tamaño
    public static int pedirNumero(String texto){
        System.out.println(texto);
        int numero = teclado.nextInt(); teclado.nextLine();
        return numero;
    }
    public static ArrayList<Integer> crearArraylist(){
        ArrayList<Integer> numeros = new ArrayList<>();
        return numeros;
    }
    public static void imprimirNumeros(ArrayList<Integer> numeros){
        System.out.println(numeros);
    }

}
