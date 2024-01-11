package segunda_evaluacion.tema06colecciones.ejemplos;

import java.util.HashSet;

public class EjemplosHashSet {
    public static void main(String[] args) {
        // Los conjuntos (set) son estructuras dinámicas en que
        // -No importa el orden en que se guarden los elementos
        // -No contienen elementos repetidos

        // Como utilizar los conjuntos:

        HashSet<Integer> conjunto = new HashSet<>();

        // los métodos que puedo utilizar son prácticamente los mismos que en arraylist
        conjunto.add(5);
        conjunto.add(5);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(9);
        conjunto.add(10);
        System.out.println(conjunto);
    }
}
