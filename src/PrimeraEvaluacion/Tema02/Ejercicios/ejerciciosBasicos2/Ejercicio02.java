package PrimeraEvaluacion.Tema02.Ejercicios.ejerciciosBasicos2;

public class Ejercicio02 {
    public static void main(String[] args) {
/*

Declara variables con el tipo de dato de menos bits posibles que puedan representar el valor. Justifica tu elección.
Si un empleado está casado o no.
Valor máximo no modificable: 999999.
Día de la semana
Día del año.
Sexo: con dos valores posibles 'H' o 'M'
Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
Almacenar el total de una factura.
Población mundial del planeta tierra.
	Mostrar el siguiente resultado:
Usando sólo la orden println:
----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
El valor de la variable casado es true
El valor de la variable MAXIMO es 999999
El valor de la variable diasem es 1
El valor de la variable diaanual es 300
El valor de la variable miliseg es 1298332800000
El valor de la variable totalfactura es 10350.678
El valor de la variable poblacion es 6775235741
El valor de la variable sexo es M

Usando sólo la orden print:

Usando sólo la orden printf:


 */
        boolean casado = true;
        int maximo = 999999;
        byte diasem = 1;
        short diaanual = 300;
        long miliseg =  1298332800000L;
        double totalfactura = 10350.678;
        long poblacion = 6775235741L;
        char sexo = 'M';

        System.out.println("El valor de la variable casado es " + casado);
        System.out.println("El valor de la variable maximo es " + maximo);
        System.out.println("El valor de la variable diasem es " + diasem);
        System.out.println("El valor de la variable diaanual es " + diaanual);
        System.out.println("El valor de la variable miliseg es " + miliseg);
        System.out.println("El valor de la variable totalfactura es " + totalfactura);
        System.out.println("El valor de la variable poblacion es " + poblacion);
        System.out.println("El valor de la variable sexo es " + sexo);

        System.out.println();

        System.out.print("El valor de la variable casado es " + casado);
        System.out.print("El valor de la variable maximo es " + maximo);
        System.out.print("El valor de la variable diasem es " + diasem);
        System.out.print("El valor de la variable diaanual es " + diaanual);
        System.out.print("El valor de la variable milise3g es " + miliseg);
        System.out.print("El valor de la variable totalfactura es " + totalfactura);
        System.out.print("El valor de la variable poblacion es " + poblacion);
        System.out.print("El valor de la variable sexo es " + sexo);
        System.out.println();

        System.out.printf("El valor de la variable casado es " + casado);
        System.out.printf("El valor de la variable maximo es " + maximo);
        System.out.printf("El valor de la variable diasem es " + diasem);
        System.out.printf("El valor de la variable diaanual es " + diaanual);
        System.out.printf("El valor de la variable miliseg es " + miliseg);
        System.out.printf("El valor de la variable totalfactura es " + totalfactura);
        System.out.printf("El valor de la variable poblacion es " + poblacion);
        System.out.printf("El valor de la variable sexo es " + sexo);
    }
}
