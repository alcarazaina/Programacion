package segunda_evaluacion.tema06colecciones.ejercicios.libreria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Colleciones {

    public static ArrayList<Editorial> obtenerEditoriales() {
        Editorial editorial01 = new Editorial(1, "Pablo");
        Editorial editorial02 = new Editorial(2, "Eugenio");
        Editorial editorial03 = new Editorial(3, "Sofia");
        ArrayList<Editorial> editoriales = new ArrayList<>();
        editoriales.add(editorial01);
        editoriales.add(editorial02);
        editoriales.add(editorial03);
        return editoriales;
    }

    public static Editorial buscarEditorial(ArrayList<Editorial> editoriales, int idEditorial) {
        Editorial editorial;
        Iterator<Editorial> iterator = editoriales.iterator();
        while (iterator.hasNext()) {
          editorial = iterator.next();
           if (editorial.getIdEditorial() == idEditorial){
               return editorial;
           }
        }
        return null;
    }
    public static ArrayList<Libro> obtenerLibros(){
        Autor autor01 = new Autor();
        autor01.setNombre("Fran");
        autor01.setCodAutor("923");
        Autor autor02 = new Autor();
        autor02.setNombre("Serrano");
        autor02.setCodAutor("937");
        ArrayList<Editorial> editorials = new ArrayList<>(obtenerEditoriales());
        Libro libro1 = new Libro("Tu madre", "83469692", autor01, editorials.get(2));
        Libro libro2 = new Libro("Tu madre 2", "83469592", autor01, editorials.get(2));
        Libro libro3 = new Libro("Tu padre ", "83459592", autor01, editorials.get(2));
        Libro libro4 = new Libro("Cacas", "83465592", autor02, editorials.get(1));

        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        return libros;
    }
    public static HashMap <String, Editorial> obtenerEditorialesPremiadas() {
        ArrayList<Editorial> editoriales = obtenerEditoriales();
        HashMap<String, Editorial> premiadas = new HashMap<>();
        premiadas.put("1er premio", buscarEditorial(editoriales, 2));
        premiadas.put("2do premio", buscarEditorial(editoriales, 3));
        premiadas.put("3er premio", buscarEditorial(editoriales, 1));
        return premiadas;
    }
    public static void imprimirMapa() {
        HashMap<String, Editorial> premiadas = obtenerEditorialesPremiadas();
        //System.out.println("Feote: " + premiadas);
        premiadas.entrySet().stream().sorted();
        System.out.println("Editoriales premiadas:  ");
        for (HashMap.Entry<String, Editorial> lineaMapa: premiadas.entrySet()) {
            System.out.println(lineaMapa.getKey() + "\t\t\t" + lineaMapa.getValue().getNombre());
        }
    }
}
