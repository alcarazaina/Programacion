package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se comparan con dos valores guardados previamente en el programa. Si coinciden, se indica “Has entrado al sistema”, en caso contrario se indica que usuario y/o contraseña son incorrectos.
         */

        //Tengo que tener previamente un usuario y contraseña para comparar luego
        String user = "ainara26";
        String password = "Fernamdo6";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = teclado.nextLine();
        System.out.println("Contraseña: ");
        String contraseña = teclado.nextLine();

        // Estos datos se comparan con dos valores guardados previamente en el programa.
        // NEW ***** OJO **** CUANDO SE TRATA DE STRING LA COMPARACIÓN NO SE HACE CON ==
        // SE UTILIZA EL MÉTODO equals() Ej: cadena1.equals(cadena2)
        // POR EJEMPLO, en este caso pondríamos  --->  user.equals(usuario)
    }
}
