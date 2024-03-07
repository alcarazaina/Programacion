package segunda_evaluacion.tema06colecciones.poo.herencia.banco;

public class Persona {
    String nombre;
    String apellido1;
    String apellido2;
    String nie;

    public Persona(String nombre, String apellido1, String apellido2, String nie) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nie = nie;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", nie='" + nie + '\'' +
                '}';
    }
}
