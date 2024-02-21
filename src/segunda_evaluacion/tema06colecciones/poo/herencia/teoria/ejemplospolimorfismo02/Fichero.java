package segunda_evaluacion.tema06colecciones.poo.herencia.teoria.ejemplospolimorfismo02;

public class Fichero {
    protected String nombreCompleto;

    // constructor con un parámetro

    public Fichero(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    // getters y setters

    public void imprimeInfoFichero() {
        String info = this.getInfoFichero(); // comportamiento polimórfico
        System.out.println(info);
    }

    protected String getInfoFichero() {
        return "Fichero: " + nombreCompleto;
    }

}
