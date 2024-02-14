package segunda_evaluacion.tema06colecciones.poo.herencia.ejercicios.empresa;

import java.util.Scanner;

public class Directivo extends Empleado{
    private Categoria categoria;

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
        System.out.println("DATOS DE DIRECTIVO: ");
        System.out.println(nombre + " " + edad + " " + sueldoBruto + " " + categoria);
        System.out.println("Salario neto: " + calcularSalarioNeto() + "€");
    }
    public void asignarPlus(){
        sueldoBruto = sueldoBruto + pedirPlus();
    }
    private double pedirPlus(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce plus de directivo");
        return teclado.nextDouble();
    }

    @Override
    public double calcularSalarioNeto() {
        return sueldoBruto - (sueldoBruto * 0.05);
    }
}
