package primera_evaluacion.tema03.ejercicios.ejerciciosIf;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        /*
        Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se comparan con dos valores guardados previamente en el programa. Si coinciden, se indica “Has entrado al sistema”, en caso contrario se indica que usuario y/o contraseña son incorrectos.
        Escribe el mismo programa anterior, pero indicando exactamente qué es lo que es incorrecto: si el usuario, la contraseña o ambos.
        */

        String user = "ainara26";
        String password = "Fernando6";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = teclado.nextLine();
        System.out.println("Contraseña: ");
        String contraseña = teclado.nextLine();

        if (contraseña.equals(password) && usuario.equals(user)) {
            System.out.println("Has entrado al sistema");
        } else if (!contraseña.equals(password) && usuario.equals(user)){
            System.out.println("Contraseña incorrecta");
        } else if (contraseña.equals(password) && !usuario.equals(user)) {
            System.out.println("Usuario incorrecto");
        }else {
                System.out.println( "Usuario y contraseña incorrectos");
            }

        }
    }
