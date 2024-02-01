package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.ejercito;

public class General {
    private String nombre;
    static int generales;

    public General(String nombre) {
        this.nombre = nombre;
        generales++;
    }
}
