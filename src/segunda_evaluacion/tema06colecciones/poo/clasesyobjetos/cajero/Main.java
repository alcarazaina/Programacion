package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.cajero;

public class Main {
    public static void main(String[] args) {


        CuentaCorriente cuenta1 = new CuentaCorriente("12345678A", "Perico Palote");
        System.out.println(cuenta1);
        cuenta1.ingresarDinero();
        cuenta1.sacarDinero();
        cuenta1.actualizarLibreta();


    }
}
