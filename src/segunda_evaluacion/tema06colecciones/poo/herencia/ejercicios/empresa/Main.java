package segunda_evaluacion.tema06colecciones.poo.herencia.ejercicios.empresa;

public class Main {
    public static void main(String[] args) {

        //Probamos la clase Persona creando un objerto
        Persona persona1 = new Persona("Persi", 18);
        persona1.mostrar();

        Empleado empleado1 = new Empleado("María", 26, 129844);
        empleado1.mostrar();

        Cliente cliente1 = new Cliente("Pedro", 58, "698542551");
        cliente1.mostrar();
        Cliente cliente2 = new Cliente("Laura", 39, "69f842559");
        cliente2.mostrar();
        Cliente cliente3 = new Cliente("Sara", 45);
        cliente3.mostrar();

        Directivo directivo1 = new Directivo("Manuel", 48, 6984588.90, Categoria.CEO);
        System.out.println("Directivo sin plus: ");
        directivo1.mostrar();
        System.out.println("Directivo con plus: ");
        directivo1.asignarPlus();
        directivo1.mostrar();
    }
}
