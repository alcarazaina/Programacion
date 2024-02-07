package segunda_evaluacion.tema06colecciones.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;

public class Empleado extends Persona{
    protected LocalDate fechaInicio;
    protected double salario;

    // Constructor de la subclase: tiene que empezar llamando al constructor de la superclase con la palabra super


    public Empleado(String nombre, int año, String direccion, LocalDate fechaInicio, double salario) {
        super(nombre, año, direccion);
        this.fechaInicio = fechaInicio;
        this.salario = salario;
    }

    public Empleado() {
        super();
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "fechaInicio=" + fechaInicio +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", año=" + año +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
