package segunda_evaluacion.tema06colecciones.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;

public class Manager extends Empleado{
    protected boolean sonrisa;


    public Manager(String nombre, int año, String direccion, LocalDate fechaInicio, double salario, boolean sonrisa) {
        super(nombre, año, direccion, fechaInicio, salario);
        this.sonrisa = sonrisa;
    }

    public boolean isSonrisa() {
        return sonrisa;
    }

    public void setSonrisa(boolean sonrisa) {
        this.sonrisa = sonrisa;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "sonrisa=" + sonrisa +
                ", fechaInicio=" + fechaInicio +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", año=" + año +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
