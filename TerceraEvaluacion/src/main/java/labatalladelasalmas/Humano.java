package labatalladelasalmas;

import java.util.ArrayList;
import java.util.Random;

public class Humano extends Ser implements Espiritual{
    static Random generador = new Random(); // lo puedo utilizar en toda la clase

    // // su atributo es la fe, solamente visible desde la misma clase,
    private double fe;
    // y
////una lista de ángeles
    ArrayList<Ángel> angeles;
    // y otra de demonios que le aconsejan.
    ArrayList<Demonio> demonios;

    //o Cada vez que se crea un humano, se le asigna una fe y se le añade un
//ángel y un demonio.


    public Humano(double fe) {
        // se le asigna una fe
        this.fe = fe;
        // creamos aquí el arraylist de ángeles y de demonios
        this.angeles = new ArrayList<>();
        this.demonios = new ArrayList<>();
        // TOODO AÑADIR ANGEL Y DEMONIO
        //y se le añade un ángel
        añadirAngel();
        // y un demonio.
        añadirDemonio();


    }

    // Método añadirÁngel(): genera aletoriamente una bondad (entre 0 y 100),
    // crea un ángel y lo añade a la lista de ángeles.
    public void añadirAngel(){
        int bondad = generador.nextInt(0, 101);
        Ángel angel = new Ángel(bondad);
        angeles.add(angel);
    }

    //o Método añadirDemonio(): genera aletoriamente una maldad (entre 0 y 100),
    // crea un demonio y lo añade a la lista de demonios.
    public void añadirDemonio() {
        int maldad = generador.nextInt(0, 101);
        Demonio demonio = new Demonio(maldad);
        demonios.add(demonio);
    }


    //o Método rezar(): cada vez que el humano reza pasan dos cosas:
    //  su fe se incrementa y se añade un ángel a su lista.
    public void rezar() {
        fe++;
        añadirAngel();
    }


    //o Método pecar(): cada vez que el humano peca pasan dos cosas: su fe
    //disminuye y se añade un demonio a su lista.
    public void pecar() {
        fe--;
        añadirDemonio();

    }

    @Override
    public String toString() {
        return "\n\nDatos del Humano:\nFe: " + fe + "\nEl humano tiene " + angeles.size() + " ángeles.\nEl humano tiene " + demonios.size() + " demonios.";
    }

    @Override
    public void mostrar() {
        System.out.println(toString());


    }
}
