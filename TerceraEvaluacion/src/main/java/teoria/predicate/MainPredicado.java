package teoria.predicate;

import java.util.function.Predicate;

public class MainPredicado {
    public static void main(String[] args) {

        // Utilizamos predicados cuando pasamos un valor por parámetro y queremos que devuelva un boolean

        //Ejemplo: es milenial si ha nacido entre 1981 y 1996 ambos incluidos

        boolean predicado1 = esMilenial(1994);
        System.out.println(predicado1);

        // ahora con la sintesis de Predicate

        Predicate<Integer> esMillenial = año -> 1981 <= año && año <= 1996;


        // Guardamos el resultado o podríamos imprimirlo directamente
        System.out.println(esMillenial.test(1945));

    }

    public static boolean esMilenial(int año){
        return año >= 1981 && año <= 1996;
    }
}
