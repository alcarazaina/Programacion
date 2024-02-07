package segunda_evaluacion.tema06colecciones.poo.herencia.ejercicios.empresa;

public class Empleado extends Persona{
    protected double sueldoBruto;

    public Empleado(String nombre, int edad, double sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    public void mostrar(String nombre, int edad, double sueldoBruto){
        System.out.println(nombre + " " + edad + " " + sueldoBruto);
    }

    public double calcularSalarioNeto(){
        return sueldoBruto - (sueldoBruto * 0.15);
    }
}
