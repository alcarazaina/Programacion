package ejercicios.stream.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class MainEjercicio02 {
    public static void main(String[] args) {


        List<Personaje> personajes = new ArrayList<>();

        Personaje personaje1 = new Personaje("Gandalf", Integer.MAX_VALUE, false, Arma.BASTÓN);
        Personaje personaje2 = new Personaje("Aragorn", 88, true, Arma.ESPADA);
        Personaje personaje3 = new Personaje("Gimli", 140, false, Arma.HACHA);
        Personaje personaje4 = new Personaje("Legolas", 2931, false, Arma.ARCO);
        Personaje personaje5 = new Personaje("Boromir", 41, true, Arma.ESPADA);
        Personaje personaje6 = new Personaje("Frodo", 51, false, Arma.ANILLO);
        Personaje personaje7 = new Personaje("Sam", 33, false, Arma.ESPADA);


    }
}
