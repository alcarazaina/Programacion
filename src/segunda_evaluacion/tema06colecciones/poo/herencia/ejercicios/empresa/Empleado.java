package segunda_evaluacion.tema06colecciones.poo.herencia.ejercicios.empresa;

public class Empleado extends Persona{
    protected double sueldoBruto;

    public Empleado(String nombre, int edad, double sueldoBruto) {
        super(nombre, edad);
        if (sueldoBruto > 0){
        this.sueldoBruto = sueldoBruto;
        } else {
            this.sueldoBruto = 15876;
        }
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    public void mostrar(){
        System.out.println("DATOS DE EMPLEADO: ");
        System.out.println(nombre + " " + edad + " " + sueldoBruto);
        System.out.println("Salario neto: " + calcularSalarioNeto() + "€");
    }

    public double calcularSalarioNeto(){
        return sueldoBruto - (sueldoBruto * 0.15);
    }
    //Sobreescribir metodo (generate -> override methods)

}
