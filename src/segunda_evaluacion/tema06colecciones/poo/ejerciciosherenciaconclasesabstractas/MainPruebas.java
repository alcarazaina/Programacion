package segunda_evaluacion.tema06colecciones.poo.ejerciciosherenciaconclasesabstractas;

public class MainPruebas {
    public static void main(String[] args) {
        Punto A = new Punto(4,4);
        System.out.println(A);
        Punto B = new Punto(10,4);
        System.out.println(B);
        Punto C = new Punto(4, 0);
        System.out.println(C);
        Punto D = new Punto(10, 0);
        System.out.println(D);

        // Creamos las cuatro líneas que forman un rectángulo con esos cuatro puntos
        Linea AB = new Linea(A,B);
        System.out.println(AB);

        AB.dibujarLinea();
    }
}
