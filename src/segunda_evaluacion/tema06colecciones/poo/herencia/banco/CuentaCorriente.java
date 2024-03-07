package segunda_evaluacion.tema06colecciones.poo.herencia.banco;

import java.util.ArrayList;

public abstract class CuentaCorriente extends CuentaBancaria {
    ArrayList<String> entidadesAutorizadas;

    public CuentaCorriente(Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN, false);
    }
}
