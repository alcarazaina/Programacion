package segunda_evaluacion.tema06colecciones.ejercicios.ejercicio02rae;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        Academico academico1 = crearAcademico("Álvaro Pombo", 2004);
        Academico academico2 = crearAcademico("José Manuel Blecua", 2006);
        Academico academico3 = crearAcademico("Pedro R. García Barreno", 2006);
        Academico academico4 = crearAcademico("Antonio Fernández de Alba", 2006);
        Academico academico5 = crearAcademico("José María Merino", 2009);

        HashMap <Character, Academico> sillones = new HashMap<>();
        // me piden que inserte los datos con un método
        // creo una variable de tipo boolean para ver si se ha insertado o no.
        boolean insertado = nuevoAcadémico(sillones, academico1,  'a');
        nuevoAcadémico(sillones, academico2,  'b');
        nuevoAcadémico(sillones, academico3,  'C');
        nuevoAcadémico(sillones, academico4,  'd');
        nuevoAcadémico(sillones, academico5,  'F');
        if (insertado){
            System.out.println("Académico insertado con éxito.");
        } else {
            System.out.println("No se ha podido inserta el académico.");
        }
        //sillones.put('a', academico1);
        //sillones.put('b', academico2);
        //sillones.put('C', academico3);
        //sillones.put('d', academico4);
        //sillones.put('F', academico5);

        imprimirAcademico(academico2);
        imprimirAcademia(sillones);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sillon: ");
        char sillon = teclado.next().charAt(0);
        System.out.println(sillones.get(sillon));



    }
    // Vamos a hacer un método que me imprima los académicos con sus datos: letra, nombre y año

    public static void imprimirAcademico(Academico a) {
        System.out.println("Año\t\tNombre");
        System.out.println(a.getAño() + "  " + a.getNombre());
    }
    // imprimir toda la academia, con el formato: letra - año - nombre
    public static void imprimirAcademia(HashMap<Character, Academico> mapa) {
        System.out.println("Letra\tAño\t\t\tNombre");
        System.out.println("==============================================");
        // recorremos el mapa con un foreach

        for (Map.Entry<Character, Academico> entrada: mapa.entrySet()) {
            System.out.println(entrada.getKey() + "\t\t" + entrada.getValue().getAño() + "\t\t" + entrada.getValue().getNombre());
        }
    }
    static boolean nuevoAcadémico(Map<Character, Academico> academia, Academico nuevo, Character letra){
        // tenemos que insertar el académico en el mapa comprobando antes si la letra lo es.
        if (Character.isLetter(letra)){
            // inserto el academico y devuelvo true
            academia.put(letra, nuevo);
            return true;
        } else {
            return false;
        }
    }
    // vamos a crear los académicos con un método
    public static Academico crearAcademico(String nombre, int año){
        Academico academico = new Academico(nombre, año);
        return academico;
    }
}
