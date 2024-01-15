package segunda_evaluacion.tema06colecciones.ejercicios.ejercicio02rae;

public class Academico {
    //atributos
    private String nombre;
    private int año;
    //Constructor

    public Academico(String nombre, int año) {
        this.nombre = nombre;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
//getter y setters

    @Override
    public String toString() {
        return "Academico{" +
                "nombre='" + nombre + '\'' +
                ", año=" + año +
                '}';
    }

    // toString
}
