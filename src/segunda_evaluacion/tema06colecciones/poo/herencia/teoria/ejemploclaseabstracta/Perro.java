package segunda_evaluacion.tema06colecciones.poo.herencia.teoria.ejemploclaseabstracta;

public class Perro extends Mascota{

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void dice() {
        System.out.println("¡Guau!");
    }
}
