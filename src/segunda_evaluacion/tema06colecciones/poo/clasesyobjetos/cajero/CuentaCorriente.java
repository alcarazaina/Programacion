package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.cajero;

import java.math.BigDecimal;
import java.util.Scanner;

public class CuentaCorriente {

    private String dni;
    private String nombre;
    private double saldo;


    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0;
    }

    public CuentaCorriente(String dni, double saldo){
        this.dni = dni;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void sacarDinero(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cantidad a retirar: ");
        int retirada = teclado.nextInt();
        if (saldo >= retirada){
            saldo = saldo - retirada; teclado.nextLine();
            System.out.println("Te quedan " + saldo + " euros en la cuenta.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void ingresarDinero(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cantidad a ingresar: ");
        double ingreso = teclado.nextDouble();
        saldo = saldo + ingreso;
        System.out.println("Nuevo saldo: " + saldo);

    }

    public void actualizarLibreta(){
        System.out.println("Titular: " + nombre + "\nsaldo: " + saldo + "\n *** Libreta actualizada ***");
    }

}
