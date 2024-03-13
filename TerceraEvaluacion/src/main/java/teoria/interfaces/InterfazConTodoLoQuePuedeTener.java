package teoria.interfaces;

public interface InterfazConTodoLoQuePuedeTener {

    // puede tener constantes
    int CONSTANTE = 0; // Si fuera una clase normal habría que poner public static final. Las constantes van en mayúsculas.


    // puede tener métodos abstractos: Los tendrán que desarrollar las clases no abstractas que implementen esa interfaz.
    public void metodoAbstracto1(); // a pesar de no poner la palabra abstract, que aqui es opcional
    public int calcularSuma(int num1, int num2); // esto es otro método abstracto

    // puede tener métodos por defecto (default): y hay que desarrollarlos aquí.

    public default void metodoPorDefecto(){
        System.out.println("Este es un método por defecto normal y corriente que está desarrollado en la interfaz. Estará disponible en la clases que la implementen");
        System.out.println("Y aquí llamamos al método privado" + metodoPrivado());
    }

    public static void metodoEstatico(){
        System.out.println("Esto es un método estático que esta desarrollado en la interfaz y estará disponible en la clases que la implementen");
    }

    private String metodoPrivado(){
        return "Este método privado sólo se puede utilizar desde esta misma interfaz";
    }


}
