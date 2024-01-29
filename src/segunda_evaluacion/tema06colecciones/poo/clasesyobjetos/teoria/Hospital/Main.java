package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.teoria.Hospital;

public class Main {
    public static void main(String[] args) {
        // probamos el primer constructor: sin parámetros
        Paciente paciente1 = new Paciente();
        System.out.println(paciente1);
        // Como no le hemos hecho constructor a la clase, utiliza el constructor por defecto que crea Java si tú no le pones ninguno.
        // Si quiero añadir datos, los tengo que hacer a través de métodos

        paciente1.setNombre("Jota");
        paciente1.setEdad(25);
        paciente1.setSintomas(new String[]{"Tos", "Cansancio", "Fiebre"}); // observa que creamos el array sobre la marcha sin necesidad de meterlo en una variable previamente

        System.out.println(paciente1);

        // Probamos el segundo constructor: inicializamos el objeto con valores para los 3 parámetros

        Paciente paciente2 = new Paciente("Efe", 58, new String[]{"Dolor de cabeza", "Ansiedad"});
        System.out.println(paciente2);

        //Probamos el tercer constructor que solo sabemos su nombre
        Paciente paciente3 = new Paciente("Lucas");
        System.out.println(paciente3);
    }
}
