package segunda_evaluacion.tema06colecciones.poo.herencia.banco;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
       Persona cliente1= crearCliente();
        System.out.println(cliente1);
        int tipo = tipoCuenta();
        double saldo = preguntarSaldo();

        switch (tipo){
            case 1:
                CuentaAhorro cuentaAhorro1 = new CuentaAhorro(cliente1, saldo, "ES0012345678910");
                break;
            case 2:
                CuentaCorrientePersonal cuentaCorrientePersonal = new CuentaCorrientePersonal(cliente1, saldo,"ES12345678910");
                break;
            case 3:
                CuentaCorrienteEmpresa cuentaCorrienteEmpresa = new CuentaCorrienteEmpresa(cliente1, saldo, "ES12345678910");
                break;
            default:
                System.out.println("Cuenta desconocida");
        }
    }
    public static Persona crearCliente(){
        System.out.println("Nombre, Apellidos y DNI, todos ellos separados por un espacio: ");
        String datosPersonales = teclado.nextLine();
        String[] datos = datosPersonales.split(" ");
        Persona persona = new Persona(datos[0], datos[1], datos[2], datos[3]);
        return persona;
    }

    public static int tipoCuenta(){
        System.out.println("Tipo de cuenta:\n1. Ahorro\n2. Cuenta corriente personal\nCuenta corriente de empresa\nElige una opción (1 - 3)");
        int tipo = teclado.nextInt(); teclado.nextLine();
        return tipo;
    }
    public static double preguntarSaldo(){
        System.out.println("Saldo inicial: ");
        double saldo = teclado.nextDouble();
        return saldo;
    }
    public int mostarMenu(){
        //mostramos las opciones
        System.out.println("1. Abrir una nueva cuenta.\n" +
                "2. Ver un listado de las cuentas disponibles (código de cuenta, titular y saldo\n" +
                "actual).\n" +
                "3. Obtener los datos de una cuenta concreta.Realizar un ingreso en una cuenta.\n" +
                "4. Retirar efectivo de una cuenta.\n" +
                "5. Consultar el saldo actual de una cuenta.\n" +
                "6. Salir de la aplicación.\n" +
                "Elija una opción (1-6)");
        //recogemos por teclado lo que el usuario elija
        int opcion = teclado.nextInt(); teclado.nextLine();
        // devuelve la opción elegida

        return opcion;
    }
}
