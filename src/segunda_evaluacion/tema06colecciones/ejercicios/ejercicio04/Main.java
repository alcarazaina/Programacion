package segunda_evaluacion.tema06colecciones.ejercicios.ejercicio04;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        Diccionario miDiccionario = new Diccionario();
        miDiccionario.nuevoPar("Perro", "Dog");
        miDiccionario.nuevoPar("Gato", "Cat");
        miDiccionario.nuevoPar("Mesa", "Table");
        miDiccionario.nuevoPar("Silla", "Chair");
        miDiccionario.nuevoPar("Programación", "Programming");
        miDiccionario.nuevoPar("Pelo", "Hair");
        miDiccionario.nuevoPar("Cara", "Face");
        miDiccionario.nuevoPar("Labios", "Lips");
        miDiccionario.nuevoPar("Examen", "Exam");
        miDiccionario.nuevoPar("Base de Datos", "Database");
        miDiccionario.nuevoPar("Chaqueta", "Jacket");
        miDiccionario.nuevoPar("Pantalón", "Trouser");
        miDiccionario.nuevoPar("Bufanda", "Scarf");
        miDiccionario.nuevoPar("Coche", "Car");
        miDiccionario.nuevoPar("Camión", "Truck");
        miDiccionario.nuevoPar("Bici", "Bike");
        miDiccionario.nuevoPar("Madre", "Mother");
        miDiccionario.nuevoPar("Papá", "Dad");
        miDiccionario.nuevoPar("Padre", "Father");
        miDiccionario.nuevoPar("Hermano", "Brother");
        miDiccionario.nuevoPar("Tía", "Aunt");

        System.out.println((miDiccionario.primeraLetraTraducion(miDiccionario.palabraAleatoria())));
        System.out.println("Indique la respuesta: ");
        String respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase(miDiccionario.palabraAleatoria())){
            System.out.println("CORECTO");
        };

    }
}
