package segunda_evaluacion.tema06colecciones.poo.ejerciciosherenciaconclasesabstractas;

public class Linea {
    final int DIMENSIONES = 1;
    Punto puntoInicio;
    Punto puntoFin;

    public Linea(Punto puntoInicio, Punto puntoFin) {
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
    }
    public double calcularLongitud(){
        return Math.sqrt(Math.pow(puntoInicio.x - puntoFin.x, 2) + Math.pow(puntoInicio.y - puntoFin.y, 2));
    }
    public void dibujarLinea (){
        int longitud = (int) this.calcularLongitud();
        for (int i = 0; i < longitud; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return puntoInicio +
                " - " + puntoFin + " Longitud: " + this.calcularLongitud();
    }
}
