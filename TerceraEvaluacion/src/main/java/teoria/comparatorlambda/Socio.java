package teoria.comparatorlambda;

import java.time.LocalDate;

public class Socio implements Comparable{

    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;


    public Socio(String nombre, String apellidos, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNac=" + fechaNac +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        // el objeto que entrará por parámetro será de tipo Socio, por lo que tenemos que hacer la conversión
        Socio s = (Socio) o; // de esta forma el objeto Objeto pasa a ser un objeto Socio.
        // vamos a comparar los socios según su fecha de nacimiento
        if (this.fechaNac.isBefore(s.fechaNac)){
            return 1; // es decir, si este objeto ("this") es mayor (su fecha de nacimiento va antes) que el socio pasado por parámetro al método compareTo, el método devuelve 1 (valdría cualquier número positivo, pero suele ser 1)
        } else if (this.fechaNac.isAfter(s.fechaNac)){
            // si la fecha del objeto es posterior a la del socio que paso por parámetro devuelvo un número negativo
            return -1;
            } else {
            //solo queda una posibilidad que sean iguales pues devuelves un 0
             return 0;
        }

    }
}
