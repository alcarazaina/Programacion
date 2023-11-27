package primera_evaluacion.Tema02.Ejemplos.operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        /*
       Es un operator ternario que permite asignar un valor u otro a una variable en función de que se cumpla o no una condición. Es una forma reducida de utilizar una sentencia if .. else en casos específicos.

       La síntaxis del operador es:

resultado = condicion ? valorSiVerdadero: valorSiFalso
         */
        //Vamos a probar si un número es par o impar
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        String cadena = numero % 2 == 0 ? " Es número par" : " Es número impar"; //Si al dividir el resto es 0, guarda en la variable cadena "Es número par" y si es falso guarda en cadena "Es número impar"
        System.out.println(numero + cadena);

        //podemos hacer esto también de forma que guarde el boolean resultante
        boolean resultado = numero % 2 == 0 ? true : false ;
        System.out.println("¿Es par? " + resultado);
    }
}
