package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.ejercito;

public class Medico {
    private String nombre;
    static int medicos;

    public Medico(String nombre) {
        this.nombre = nombre;
        medicos++;
    }
}
