package segunda_evaluacion.tema06.poo.metodos;

import java.util.Scanner;

public class EjemplosMetodos {
    public static void main(String[] args) {
    // aquí es donde hacemos llamadas a los métodos
        // pedimos el primer número
        double num1 = pedirNumero();
        // pedimos el segundo número
        double num2 = pedirNumero();

        double resultadoSuma = suma(num1,num2); // en la llamada doy valores concretos
        double resultadoResta = resta(num1,num2);
        double resultadoMulti = multiplicacion(num1,num2);
        double resultadoDivision = division(num1,num2);
    }

    // Alt + 7 para abrir la estructura para ver los metodos
    // creamos una calculadora de números decimales --> creamos o declaramos cuatro métodos
    // suma
    public static double pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        return teclado.nextDouble();
    }
    public static double suma (double a, double b){
        return a + b;
    }
    // resta
    public static double resta (double a, double b){
        return a - b;
    }
    // multiplica
    public static double multiplicacion (double a, double b){
        return a * b;
    }
    // divide
    public static double division (double a, double b){
        return a / b;
    }
    // metodo que muestre un menú con las 4 opciones y devuelva la opción elegida
    public static int mostrarMenu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige opción: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplica");
        System.out.println("4. Divide");
        int opcion = teclado.nextInt();
        return opcion;
    }
}
