package segunda_evaluacion.tema06colecciones.poo.ejerciciosherenciaconclasesabstractas;

import javax.sound.sampled.Line;
import java.util.ArrayList;

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

        Linea BC = new Linea(B, C);
        System.out.println(BC);
        BC.dibujarLinea();

        Linea BD = new Linea(B, D);
        System.out.println(BD);
        BD.dibujarLinea();

        Linea CD = new Linea(C,D);
        System.out.println(CD);
        CD.dibujarLinea();

        Linea AC = new Linea(A, C);
        System.out.println(AC);
        AC.dibujarLinea();


        // creamos un rectángulo con el segundo constructor

        ArrayList<Punto> puntos = new ArrayList<>();
        puntos.add(A);
        puntos.add(B);
        puntos.add(C);
        puntos.add(D);

        Rectangulo rectangulo = new Rectangulo(puntos);
        System.out.println(rectangulo);

    }
}
