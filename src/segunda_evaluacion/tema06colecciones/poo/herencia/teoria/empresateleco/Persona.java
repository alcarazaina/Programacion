package segunda_evaluacion.tema06colecciones.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;

public class Persona {
    protected String nombre;
    protected int año;
    protected String direccion;


    // Constructor de la superclase, como el constructor no se hereda. Hay problemas en las subclases que heredan


    public Persona(String nombre, int año, String direccion) {
        this.nombre = nombre;
        this.año = año;
        this.direccion = direccion;
    }

    public Persona() {

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", año=" + año +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
