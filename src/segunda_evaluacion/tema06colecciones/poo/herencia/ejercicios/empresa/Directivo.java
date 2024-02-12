package segunda_evaluacion.tema06colecciones.poo.herencia.ejercicios.empresa;

public class Directivo extends Empleado{
    protected Categoria categoria;

    public Directivo(String nombre, int edad, double sueldoBruto, Categoria categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public void mostrar(){
        System.out.println(nombre + " " + edad + " " + sueldoBruto + " " + categoria);
    }
}
