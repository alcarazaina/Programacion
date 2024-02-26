package segunda_evaluacion.tema06colecciones.poo.ejerciciosherenciaconclasesabstractas;

import java.util.ArrayList;

public abstract class Figura2D {

    int lados;
    final int DIMENSIONES = 2;

    public Figura2D(int lados) {
        this.lados = lados;
    }

    // Este método devuelve rectángulo o triángulo según el número de lados de la figura

    public String nombreFigura(){
        if (lados == 3){
            return "triángulo";
        }else if (lados == 4){
            return "rectángulo";

        } else {
            return "Gracias por la sugerencia; añadiremos figuras de " + lados + " lados en el futuro";
        }
    }

    // métodos abstractos: los declaro pero no los desarrollo
    public abstract ArrayList<Linea> crearLineas();

    public abstract double calcularPerimetro();

    public abstract double calcularArea();

}


