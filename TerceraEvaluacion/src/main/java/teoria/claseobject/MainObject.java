package teoria.claseobject;

public class MainObject {
    public static void main(String[] args) {

        EjemploObject eo = new EjemploObject("Objeto", 1);

        // por tener el metodo toString basta meter al objeto en un sout para que lo imprima por pantalla

        System.out.println(eo);

        ///puedo saber también la ruta de la clase a la que pertenece este objeto con el método getClass
        String rutaClase = String.valueOf(eo.getClass());
        System.out.println("Esta clase está en: " + rutaClase);


    }
}
