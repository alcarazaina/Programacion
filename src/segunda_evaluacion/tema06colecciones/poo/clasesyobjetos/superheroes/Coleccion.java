package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.superheroes;

import java.util.ArrayList;

/**
 * La empresa vende a veces colecciones de figuras, que básicamente son
 * conjuntos de figuras con una temática relacionada. Por ejemplo una
 * colección “El Hombre Murciélago” que consta de una serie de figuras
 * relacionadas con Batman, o una colección “Marvel”, con figuras de
 * superhéroes de Marvel, etc…
 */
public class Coleccion {

    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void añadirFigura(Figura fig){
        listaFiguras.add(fig);
    }



}
