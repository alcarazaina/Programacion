package segunda_evaluacion.tema06colecciones.poo.herencia.teoria.empresateleco;

public class Cliente extends Persona{
    protected String numeroContacto;
    protected boolean oro;


    public Cliente(String nombre, int año, String direccion, String numeroContacto, boolean oro) {
        super(nombre, año, direccion);
        this.numeroContacto = numeroContacto;
        this.oro = oro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroContacto='" + numeroContacto + '\'' +
                ", oro=" + oro +
                '}';
    }
}
