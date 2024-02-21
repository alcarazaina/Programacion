package segunda_evaluacion.tema06colecciones.poo.ejerciciosherenciaconclasesabstractas;

public class Linea {
    int dimensiones;
    Punto puntoInicio;
    Punto puntoFin;

    public Linea(Punto puntoInicio, Punto puntoFin) {
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
    }

    @Override
    public String toString() {
        return "Linea{" +
                "dimensiones=" + dimensiones +
                ", puntoInicio=" + puntoInicio +
                ", puntoFin=" + puntoFin +
                '}';
    }
}
