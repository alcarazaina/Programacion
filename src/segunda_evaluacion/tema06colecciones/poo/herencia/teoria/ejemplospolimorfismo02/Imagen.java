package segunda_evaluacion.tema06colecciones.poo.herencia.teoria.ejemplospolimorfismo02;

public class Imagen extends Fichero{
    protected int width;
    protected int height;
    protected byte[] contenido;

    // constructor

    public Imagen(String nombreCompleto, int width, int height, byte[] contenido) {
        super(nombreCompleto);
        this.width = width;
        this.height = height;
        this.contenido = contenido;
    }


    @Override
    protected String getInfoFichero() {
        return String.format("Imagen: %s, width: %d, height: %d", nombreCompleto, width, height);
    }

}
