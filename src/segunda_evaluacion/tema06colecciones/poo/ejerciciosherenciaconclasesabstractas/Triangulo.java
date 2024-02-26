package segunda_evaluacion.tema06colecciones.poo.ejerciciosherenciaconclasesabstractas;

import java.util.ArrayList;

public class Triangulo extends Figura2D{
    public Triangulo(int lados) {
        super(lados);
    }

    @Override
    public ArrayList<Linea> crearLineas() {
        return null;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}
