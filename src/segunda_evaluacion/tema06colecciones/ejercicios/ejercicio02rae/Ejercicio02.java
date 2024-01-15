package segunda_evaluacion.tema06colecciones.ejercicios.ejercicio02rae;

import java.util.HashMap;

public class Ejercicio02 {
    public static void main(String[] args) {
               /*
        Los miembros de la Real Academia de la Lengua ocupan sillones con las letras del abecedario español, minúsculas y mayúsculas (en la práctica, las leras v, w, x, y, z, Ñ, W, Y nunca se ocupan, pero nosotros no lo tendremos en cuenta). Cuando un sillón queda vacante, se nombra un nuevo académico para ocuparlo.
Implementar la clase Académico, cuyos atributos son el nombre y el año de ingreso.
Implementar un programa donde se crean cinco objetos Académico, que se insertan en un mapa en el que la clave es la letra del sillón que ocupan, y el valor un objeto de la clase Académico. Para ello implementar el método estático:
static boolean nuevoAcadémico(Map<Character, Académico> academia, Académico nuevo, Character letra),
donde se lleva a cabo la inserción después de comprobar que el carácter pasado como parámetro es una letra del abecedario.
         */

        Academico academico1 = new Academico("Álvaro Pombo", 2004);
        Academico academico2 = new Academico("José Manuel Blecua", 2006);
        Academico academico3 = new Academico("Pedro R. García Barreno", 2006);
        Academico academico4 = new Academico("Antonio Fernández de Alba", 2006);
        Academico academico5 = new Academico("José María Merino", 2009);

        HashMap <Character, Academico> sillones = new HashMap<>();
        sillones.put('a', academico1);
        sillones.put('b', academico2);
        sillones.put('c', academico3);
        sillones.put('d', academico4);
        sillones.put('f', academico5);



    }
}
