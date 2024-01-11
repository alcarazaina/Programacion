package segunda_evaluacion.tema06colecciones.ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio01ColecFor {
    public static void main(String[] args) {
        HashSet<Integer> coleccion = new HashSet<>(); // hashset porque me dice que no puede tener números repetidos
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt(); teclado.nextLine();

        while (numero != -1){
            // solo meto los números no negativos
            if (numero >= 0){
                coleccion.add(numero);
            }
            // antes de terminar tengo que pedir un nuevo numero por que si no no nos sale del bucle
            numero = teclado.nextInt();teclado.nextLine();
        }
        System.out.println(coleccion);

        // A continuación se muestran solo los pares
       // for (int i = 0; i < coleccion.size(); i++) {
          //  System.out.println(coleccion.iterator()); // no se puede tendría que ser con foreach, por que con un for normal hashset no tiene el método .get() para acceder a la posición
       // }
        for (Integer elemento : coleccion) {
            if (elemento % 2 == 0) {
                System.out.print(elemento + " ");
            }
        }
        System.out.println();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(coleccion); // puedo meter en el arraylist toda la colección
        // ahora si que la puedo recorrer y eliminar los elementos
        for (int i = 0; i < coleccion.size(); i++) {
            if (arrayList.get(i) % 3 == 0){
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println(coleccion);
    }
}
