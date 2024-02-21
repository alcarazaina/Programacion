package segunda_evaluacion.tema06colecciones.poo.herencia.teoria.ejemploclaseabstracta;

public abstract class Mascota { //Con esto declaramos que la clase es abstracta

    protected String nombre;
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void dice(); // Método abstracto: no lo desarrollamos aquí, solo lo dejamos declarado. Pero todas las subclases deberán obligatoriamente desarrollarlo
}
