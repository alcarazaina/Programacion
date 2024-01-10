package segunda_evaluacion.tema06Colecciones.ejercicios.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
    public static Scanner teclado = new Scanner(System.in); // asi puedo utilizar este Scanner sin tener que pedirlo siempre en los metodos
    public static void main(String[] args) {
        /*
        Escribe un programa que pida una lista de palabras (la guardas como una cadena de texto) y, a continuación dé tres opciones:
Contar: pide una palabra, y me dice cuantas veces aparece en la lista
Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones de la primera por la segunda.
Eliminar: pide una , y la elimina de la lista.
Mostrar: muestra la lista de cadenas
Salir
         */

        String cadena = pedirCadena("Introduce una lista de palabras: ");
        int opcion = 0;
       while (opcion != 5 ){
           opcion = mostrarMenu();
           cadena = elegir(opcion, cadena);
       }
    }
    public static String pedirCadena(String introduce){
        Scanner teclado = new Scanner(System.in);
        System.out.println(introduce);
        return teclado.nextLine();
    }
    public static int mostrarMenu(){
        System.out.println("¿Qué vamos a hacer? \n1. Contar\n2. Modificar\n3. Eliminar\n4. Mostrar\n5. Salir");
        int opcion = teclado.nextInt(); teclado.nextLine();
        return opcion;

    }
    public static int contar(String cadena){
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
        System.out.println("Introduce una palabra nueva: ");
        String palabra = teclado.nextLine();
        System.out.println("¿Qué palabra vamos a modificar? ");
        String palabra2 = teclado.nextLine();
        String cadenaNueva = cadena.replaceAll(palabra2, palabra);
        return cadenaNueva;
    }
    public static String eliminar (String cadena){
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
            default:
                System.out.println("Opción incorrecta.");
        }

        return cadena;
    }
}
