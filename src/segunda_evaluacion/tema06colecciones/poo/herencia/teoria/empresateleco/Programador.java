package segunda_evaluacion.tema06colecciones.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;
import java.util.Arrays;

public class Programador extends Empleado{
    protected String[] lenguajes;

    public Programador(String nombre, int año, String direccion, LocalDate fechaInicio, double salario, String[] lenguajes) {
        super(nombre, año, direccion, fechaInicio, salario);
        this.lenguajes = lenguajes;
    }

    public Programador() {
        super();
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "lenguajes=" + Arrays.toString(lenguajes) +
                ", fechaInicio=" + fechaInicio +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", año=" + año +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
