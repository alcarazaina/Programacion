package primera_evaluacion.Tema02.Ejemplos.variables;

import java.util.Scanner;

public class Ejemplo05 {
    public static void main(String[] args) {
        //La variable char es para guardar un único carácter
        // y se indica con comillas SIMPLES (comillas dobles son para String)
        char letra = 'a';
        System.out.println(letra);
        char número = '7';
        System.out.println(número);
        //para introducir valores char por teclado
        Scanner teclado = new Scanner(System.in);
        char cáracter = teclado.nextLine().charAt(0); //Cuando necesitamos introducir un char por teclado, añadir siempre el método charAt(0);
    }
}
