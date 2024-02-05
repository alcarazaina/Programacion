package segunda_evaluacion.tema06colecciones.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;

public class Empleado extends Persona{
    protected LocalDate fechaInicio;
    protected double salario;

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
}
