package segunda_evaluacion.tema01;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        // son como array, pero pueden cambiar de tamaño
        // una diferencia importante: no pueden guardar tipos primitivos: int, boolean, double
        // en su lugar hay que utilizar lo que se llaman clases envoltorio (wrapper):
        // en vez de int usamos Integer, en vez de double usamos Double, en vez de boolean usamos Boolean, en vez de char usamos Character

        ArrayList<Integer> enteros = new ArrayList<>();
        // métodos a utilizar:
        System.out.println(enteros.size()); // tamaño es el equivalente en los arrays a length
        // para añadir elementos: add
        enteros.add(53);
        System.out.println(enteros.size());
        for (int i = 30; i <= 40; i++) {
            enteros.add(i);
        }
        System.out.println(enteros.size());
        // y si quiero ver que elemtos tiene: get()
        for (int i = 0; i < enteros.size(); i++) {
            System.out.print(enteros.get(i) + " ");
        }

        // ahora cogemos los ejemplos de los apuntes

        ArrayList<String> nombres = new ArrayList<>();
        //añadimos dos elementos
        nombres.add("Justino");
        nombres.add("Elena");
        System.out.println(nombres); // para imprimirlo solo tenemos que poner el nombre del arraylist en el sout
        //añadimos dos nombres mas pero al principio: es decir, en los índices 0 y 1

        nombres.add(1, "Joshua");
        System.out.println("Meto a Joshua en el indice 1" + nombres);
        nombres.add(0,"Laura");
        System.out.println("Meto a Laura en el indice 0" + nombres);
        System.out.println(nombres);

        //set sirve para reemplazar un elemento por otro diciendo el índice
        //queremos meter a Mario en el lugar de Elena, que está en el índice 3
        nombres.set(3, "Mario");
        System.out.println("He sustituido a Elena por Mario" + nombres);

        //queremos eliminar a Justino de la lista
        nombres.remove(1);
        System.out.println(nombres);
    }
}
