package segunda_evaluacion.tema06colecciones.poo.herencia.banco;

public class CuentaCorrienteEmpresa extends CuentaCorriente{
    double interesDescubierto;
    double maximoDescubierto;


    public CuentaCorrienteEmpresa(Persona titular, double saldo, String IBAN) {
        super(titular, saldo, IBAN);
    }
}
