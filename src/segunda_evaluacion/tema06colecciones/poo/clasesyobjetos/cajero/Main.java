package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.cajero;

public class Main {
    public static void main(String[] args) {


        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Perico Palote");
        System.out.println(cuenta1);
        cuenta1.ingresarDinero();
        cuenta1.sacarDinero();
        cuenta1.actualizarLibreta();

        CuentaCorriente cuentaCorriente2 = new CuentaCorriente("22222222B", 50000);
        System.out.println(cuentaCorriente2);

        CuentaCorriente cuentaCorriente3 = new CuentaCorriente("33333333C", "Petete", 10000);
        System.out.println(cuentaCorriente3);
    }
}
