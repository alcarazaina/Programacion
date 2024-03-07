package segunda_evaluacion.tema06colecciones.poo.herencia.banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    static Scanner teclado = new Scanner(System.in);
    ArrayList<CuentaBancaria> cuentas;

    public Banco(ArrayList<CuentaBancaria> cuentas) {
        if(cuentas.size() < 100) {
            this.cuentas = cuentas;
        }
    }

}
