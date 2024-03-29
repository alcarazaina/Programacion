package segunda_evaluacion.tema06colecciones.poo.metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16ArraysConArraylist {
    // quiero un Scanner que sea visible en todos los métodos de esta clase
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
       // Crear un programa que cree un array de números enteros (tamaño introducido por teclado), muestre el siguiente menú y realice // lo que en las opciones se indica:
        // otra forma: int tamaño = Integer.parseInt(teclado.nextLine());

       //  int tamaño = pedirNumero("Introduce tamaño"); // me da igual porque es un Arraylist
        menu();

    }

    public static void menu(){

        // crear arraylist de numero enteros
        ArrayList<Integer> numeros = crearArraylist();

        // **** MENÚ ****
        // variables que voy a utilizar en el switch
        int opcion = 0;
        int indice = 0;
        int numero = 0;
        while (opcion != 9) {
            System.out.println("1. Añadir al final.");
            System.out.println("2. Mostrar números.");
            System.out.println("3. Añadir número en una posición.");
            System.out.println("4. Longitud del arraylist.");
            System.out.println("5. Eliminar el último número.");
            System.out.println("6. Eliminar un número.");
            System.out.println("7. Contar números.");
            System.out.println("8. Posiciones de un número.");
            System.out.println("9. Salir.");
            System.out.println("=====================================");
            opcion = pedirNumero("Selecciona una opción");
            System.out.println(opcion);
            switch (opcion){
                case 1:
                    // Añadir número al final: pide un número y lo añade al final del array.
                    // para tener un poco más de juego metemos 5 números en el arraylist
                    for (int i = 0; i < 5; i++) {
                        numeros = añadirAlFinal(numeros);
                    }
                    break;
                case 2:
                    //Mostrar números: Muestra los números que contiene.
                    // imprimimos el arraylist
                    imprimirNumeros(numeros);
                    break;
                case 3:

                   añadirEnPosicion(numeros);

                    break;
                case 4:

                    mostrarTamaño(numeros);
                    break;
                case 5:
                    // Eliminar el último número: muestra el último número del array y lo borra.
                    eliminarUltimo(numeros);
                    break;
                case 6:
                    // Eliminar un número: pide una posición, y si la posición existe en el array borra el elemento que contiene (lo reemplaza con un 0).
                    eliminarNumero(numeros);
                    break;
                case 7:
                    contarNumeros(numeros);
                    break;
                case 8:
                   posicion(numeros);
                    break;
                case 9:
                    //Salir
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        }

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
    public static void eliminarUltimo(ArrayList<Integer> numeros){
        System.out.println("Se va a borrar el elemento: " + numeros.get(numeros.size() - 1));
        numeros.remove(numeros.size() - 1);
    }
    public static void eliminarNumero (ArrayList<Integer> numeros){
        int indice = pedirNumero("Dime el índice del elemento que quieres borrar: ");
        if (indice <= numeros.size() - 1) {
            numeros.remove(indice);
        }
    }
    public static void añadirEnPosicion (ArrayList<Integer> numeros) {
        // Añadir número en una posición: pide un número y una posición, y si la posición existe en el array lo añade en esa posición (la posición se pide a partir de 1).
        int numero = pedirNumero("Introduce número: ");
        int indice = pedirNumero("¿En que índice lo ponemos? ");
        if (indice <= numeros.size() - 1 && indice >= 0) {
            numeros.add(indice, numero);
        }
    }
        public static void mostrarTamaño (ArrayList<Integer> numeros){
            // Longitud del array: muestra el tamaño del array.
            System.out.println("Tamaño del array: " + numeros.size());
        }
        public static void contarNumeros (ArrayList<Integer> numeros){
            //Contar números: pide un número y te dice cuántas veces aparece en el array.
            int numero = pedirNumero("Dime el número que quieres contar");
            int contador = 0;
            for (Integer elemento: numeros) {
                if (elemento == numero) {
                    contador++;
                }
            }
            System.out.println("El número " + numero + " aparece " + contador + " veces.");
        }
        public static void posicion (ArrayList<Integer> numeros){
            //Posiciones de un número: pide un número y te dice en que posiciones está.
            ArrayList<Integer> posiciones = new ArrayList<>();
            int numero = pedirNumero("Dime el número que quieres buscar: ");
            for (int i = 0; i < numeros.size(); i++) {
                if (numeros.get(i) == numero) {
                    posiciones.add(i);
                }
            }
            System.out.println("El número " + numero + " aparece en las posiciones " + posiciones);
        }
}
