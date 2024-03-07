package segunda_evaluacion.tema06colecciones.poo.herencia.banco;

public abstract class CuentaBancaria {
    Persona titular;
    double saldo;
    String IBAN;
    boolean remunerada;

    public CuentaBancaria(Persona titular, double saldo, String IBAN, boolean remunerada) {
        this.titular = titular;
        this.saldo = saldo;
        this.IBAN = IBAN;
        this.remunerada = remunerada;
    }
}
