package PrimeraEvaluacion.Tema03.Ejemplos;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {

     /* La forma más simple de la instrucción condicional consiste en la palabra clave if, una
expresión booleana y un cuerpo entre llaves.
       if (expresión) {
// cuerpo: instrucciones que se ejecutan si expresión es true
        }
        */
        //Pido una edad y, si es mayor de edad, puede ver la película; en caso contrario, no decimos nada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Edad: ");
        int edad = teclado.nextInt();
        if (edad >=18 ) { //Aquí entra solo si el resultado es true
            System.out.println("Pasa, puedes ver la peli.");
        }
        // ... Si es menor de edad (si es false, no se ejecuta la línea 17 y saltaría a esta línea.
        System.out.println("Esto se imprime siempre, tanto si es true o si es false");

        //En vez de una expresión puedo poner una variable boolean directamente
        //Entonces el ejemplo anterior podría quedar así:

        boolean mayorDeEdad = edad >= 18;
        if (mayorDeEdad) { //es lo mismo que poner mayorDeEdad == true
            System.out.println("Sólo poniendo la variable mayor de edad, si es true se va a imprimir esto ");
        }

        if (!mayorDeEdad){ // es lo mismo que decir mayorDeEdad == false
            System.out.println("No eres mayor de edad.");
        }


    }
}
