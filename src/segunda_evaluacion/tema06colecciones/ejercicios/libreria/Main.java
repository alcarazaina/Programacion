package segunda_evaluacion.tema06colecciones.ejercicios.libreria;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(Colleciones.obtenerEditoriales());
        ArrayList<Editorial> editorial = new ArrayList<>(Colleciones.obtenerEditoriales());
        System.out.println(Colleciones.buscarEditorial(editorial, 1));
        Colleciones.imprimirMapa();

    }
}
