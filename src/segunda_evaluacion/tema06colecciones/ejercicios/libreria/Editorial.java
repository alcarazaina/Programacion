package segunda_evaluacion.tema06colecciones.ejercicios.libreria;

public class Editorial {
    private int idEditorial;
    private String nombre;

    public int getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(int idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Editorial(int idEditorial, String nombre) {
        this.idEditorial = idEditorial;
        this.nombre = nombre;
    }

    public Editorial() {
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "idEditorial=" + idEditorial +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
