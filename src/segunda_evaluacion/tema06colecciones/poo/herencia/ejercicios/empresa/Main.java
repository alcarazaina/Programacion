package segunda_evaluacion.tema06colecciones.poo.herencia.ejercicios.empresa;

public class Main {
    public static void main(String[] args) {

        //Probamos la clase Persona creando un objerto
        Persona persona1 = new Persona("Persi", 18);
        persona1.mostrar();

        Empleado empleado1 = new Empleado("María", 26, 129844);
        empleado1.mostrar();
    }
}
