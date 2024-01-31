package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.cajero;

public class Gestor {

    private String nombre;
    private String telefono;
    private double cantidadMax;


    public Gestor(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        // Si no se asigna el importe es 10000
        this.cantidadMax = 10000;
    }



    @Override
    public String toString() {
        return "Gestor{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cantidadMax=" + cantidadMax +
                '}';
    }
}
