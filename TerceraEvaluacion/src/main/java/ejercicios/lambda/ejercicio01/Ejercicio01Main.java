package ejercicios.lambda.ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio01Main {
    public static void main(String[] args) {
        // 1. Crea una lista de Strings y utiliza una expresión lambda para imprimir cada elemento de la lista.

        List<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        lista.add("cinco");
        lista.add("veinticuatro");

        List<Integer> lista02 = new ArrayList<>();
        lista02.add(1);
        lista02.add(2);
        lista02.add(24);
        lista02.add(4);
        lista02.add(5);
        lista02.add(3);

        System.out.println("Ejercicio 01");
        Ejercicio01 e1 = lista1 ->  {
                for (String elemento : lista1) {
                    System.out.println(elemento);
                }
        };
        e1.imprimeLista(lista);

        // 2.  Crea una lista de Strings y utiliza una expresión lambda para contar cuántas palabras tienen más de 5 caracteres.
        System.out.println("Ejercicio 02");
        Ejercicio02 e2 = lista2 -> {
            int contador = 0;
            for (String elemento : lista2) {

                if (elemento.length() > 5){
                    contador++;
            }
        }
            return contador;
        };
        System.out.println(e2.contarPalabras5Char(lista));
        // 3.  Crea una lista de números enteros y utiliza una expresión lambda para encontrar el número mayor.
        System.out.println("Ejercicio 03");
        Ejercicio03 e3 = lista3 -> {
            int mayor = lista3.get(0);
            for (Integer numero : lista3) {
                if (numero > mayor){
                    mayor = numero;
                }
            }
            return mayor;
        };
        System.out.println(e3.encontrarNumeroMayor(lista02));

        // 4. Crea una lista de números enteros y utiliza una expresión lambda para encontrar la suma de los números pares.
        System.out.println("Ejercicio 04");
        Ejercicio04 e4 = lista4 -> {
            int suma = 0;
            for (Integer numero : lista4) {
                if (numero % 2 == 0){
                    suma += numero;
                }
            }
            return suma;
        };
        System.out.println(e4.sumaPares(lista02));

        // 5. Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para encontrar a la persona más joven.
        System.out.println("Ejercicio 05");
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Pedro", 51));
        personas.add(new Persona("Carlos", 35));
        personas.add(new Persona("Robert", 24));
        personas.add(new Persona("Aina", 29));
        personas.add(new Persona("Kamilly", 19));
        personas.add(new Persona("Sergio", 13));
        personas.add(new Persona("Ana", 8));
        personas.add(new Persona("Alejandro", 27));
        System.out.println("\nRecién creada la lista: ");
        System.out.println(personas);

        //Ordenamos por edades de menor a mayor
        //además, por primera vez vamos a utilizar una versión más corta.
        personas.sort((p1, p2) -> p1.getEdad() - p2.getEdad());
        System.out.println("\nOrdrenamos por edad (de menor a mayor)");
        System.out.println(personas);

        //si queremos de mayor a menor
        // personas.sort((p1,p2) -> p2.getEdad() - p1.getEdad());
        // System.out.println("\nOrdrenamos por edad (de mayor a menor)");
        // System.out.println(personas);

        // y después cogemos el primero de la lista.
        System.out.println("Persona más joven: " + personas.get(0));

        //si nos pidieran sin volver a ordenar el último elemento de la lista
        System.out.println("Persona más mayor: " + personas.get(personas.size() - 1));

        // 6. Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para ordenar la lista por edad, de menor a mayor.
            //hecho en el ejercicio anterior

        // 7. Crea una lista de objetos de tipo Persona y utiliza una expresión lambda para filtrar las personas que tienen una edad mayor a 30.


        // 8. Crea una lista de objetos de tipo Producto (con atributos nombre y precio) y utiliza una expresión lambda para calcular el precio total de la lista.


        // 9. Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para ordenar la lista por precio, de mayor a menor.


        // 10. Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para filtrar los productos que tienen un precio menor a 10.



    }
}
