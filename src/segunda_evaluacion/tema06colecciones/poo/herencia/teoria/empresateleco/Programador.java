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

    public void añadirLenguaje(String lenguaje){
        // como este método tiene que ser llamado por un programador ya creado que tendrá un array con un cierto tamaño que no se puede ampliar porque es un array
        String[] lenguajesMasUno = new String[lenguajes.length + 1];
        //Añadimos los lenguajes que ya teníamos
        for (int i = 0; i < lenguajes.length; i++) {
            lenguajesMasUno[i] = lenguajes[i];
        }
        // en la última posición añadimos el nuevo lenguaje
        lenguajesMasUno[lenguajesMasUno.length - 1] = lenguaje;
        // y asignamos al atributo lenguajes
        this.lenguajes = lenguajesMasUno;
    }
}
