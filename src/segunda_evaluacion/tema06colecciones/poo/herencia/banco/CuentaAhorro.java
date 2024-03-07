package segunda_evaluacion.tema06colecciones.poo.herencia.banco;

public class CuentaAhorro extends CuentaBancaria{
    double tia; //tipo de interes anual

    public CuentaAhorro(Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN, true);
    }
}
