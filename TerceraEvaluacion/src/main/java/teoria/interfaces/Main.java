package teoria.interfaces;

public class Main {
    public static void main(String[] args) {
        // creamos un objeto de tipo clase y vamos a utilizar los métodos que definimos en la interfaz y desarrollamos en la clase.
        Clase clase = new Clase();
        //probamos el primer método abstracto.
        clase.metodoAbstracto1();
        // probamos el segundo método abstracto de calcular suma.
        System.out.println(clase.calcularSuma(2, 4));

        clase.metodoPorDefecto(); // este lo tengo en la interfaz y la clase lo aprovecha.
        // Recordad que podríamos haberlo sobreescrito y modificado en la clase.
        System.out.println();

        //nos falta por probar el método estático: este nunca se va a invocar a través de un objeto, si no, con el nombre / ruta de su ubicación
        // en este caso: nombreDeLaInterfaz.nombreDelMetodo()
        InterfazConTodoLoQuePuedeTener.metodoEstatico();
    }
}
