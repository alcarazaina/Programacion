package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.ejercito;

public class Caballero {
    private String nombre;
    static int caballeros;

    public Caballero(String nombre) {
        this.nombre = nombre;
        caballeros++;
    }
}
