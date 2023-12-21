package segunda_evaluacion.tema06.ejercicios.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida una lista de palabras (la guardas como una cadena de texto) y, a continuación dé tres opciones:
Contar: pide una palabra, y me dice cuantas veces aparece en la lista
Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones de la primera por la segunda.
Eliminar: pide una , y la elimina de la lista.
Mostrar: muestra la lista de cadenas
Salir
         */

        String cadena = pedirCadena();
        int opcion = 0;
       while (opcion != 5 ){
           opcion = mostrarMenu();
           cadena = elegir(opcion, cadena);
       }
    }
    public static String pedirCadena(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto");
        String cadena = teclado.nextLine();
        return cadena;
    }
    public static int mostrarMenu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué vamos a hacer? ");
        System.out.println("1. Contar");
        System.out.println("2. Modificar");
        System.out.println("3. Eliminar");
        System.out.println("4. Mostrar");
        System.out.println("5. Salir");
        int opcion = teclado.nextInt();
        return opcion;

    }
    public static int contar(String cadena){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra para contar: ");
        String palabra = teclado.nextLine();
        int contador = 0;
        for (int i = 0; i < cadena.length() - palabra.length() + 1; i++) {
            String subcadena = cadena.substring(i, i + palabra.length());
            if (palabra.equals(subcadena)){
                contador++;
            }
        }
        return contador;
    }
    public static String modificar(String cadena){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra nueva: ");
        String palabra = teclado.nextLine();
        System.out.println("¿Qué palabra vamos a modificar? ");
        String palabra2 = teclado.nextLine();
        String cadenaNueva = cadena.replaceAll(palabra2, palabra);
        return cadenaNueva;
    }
    public static String eliminar (String cadena){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué palabra vamos a eliminar? ");
        String palabra = teclado.nextLine();
        String cadenaNueva = cadena.replaceAll(palabra, "");
        cadenaNueva = cadenaNueva.replaceAll("\s+", " ");
        cadenaNueva = cadenaNueva.trim();
        return cadenaNueva;
    }
    public static String elegir (int opcion, String cadena){
        switch (opcion){
            case 1:
                int contador = contar(cadena);
                System.out.println("La cadena tiene " + contador + " veces la palabra insertada");
                break;
            case 2:
                cadena = modificar(cadena);
                System.out.println(cadena);
                break;
            case 3:
                cadena = eliminar(cadena);
                System.out.println(cadena);
                break;
            case 4:
                System.out.println("La cadena es: " + cadena);
                break;
            case 5:
                System.out.println("Has salido del programa");
                break;
        }

        return cadena;
    }
}
