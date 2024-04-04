package teoria.lambda.teoriainterfacesfuncionales;

public class Main {
    public static void main(String[] args) {
        // voy a intentar instanciar la interfaz funcional HolaMundo
        // me crea una clase anónima (Lo que hay entre las llaves {}) para que implemente el método
        /* HolaMundo hm = new HolaMundo() {
            @Override
            public void HolaMundo() {
                System.out.println("Hola Mundo");
            }
        }; */

        HolaMundo hm = () -> System.out.println("Hola Mundo");
        // una vez hayas rellenado el método de la clase anónima ya tienes un objeto con el que llamarlo.

        hm.HolaMundo();

        // de los métodos que tenemos debajo vamos a convertirlos en interfaz funcional + lambda

        // 1. Comprueba si el parámetro recibido es un número impar.
        Impar impar = n -> n % 2 != 0;
        System.out.println(impar.esImpar(15));
        System.out.println(impar.esImpar(16));

        // 2. Comprueba si el parámetro es la letra ‘y’ (minúscula).
        ComprobarY comprobarY = c -> c == 'y';
        System.out.println(comprobarY.esy('k'));

        // 3. Devuelve la suma de dos números.
        Sumar sumar = (x, y) -> x + y;
        System.out.println(sumar.sumar(8,7));

        // 4. Devuelve la suma de los cuadrados de dos números.
        SumarCuadrados sumarCuadrados = (a, b) -> ((int)Math.pow(a, 2) + (int)Math.pow(b, 2));
        System.out.println(sumarCuadrados.sumarCuadrados(4,6));

        // 5. Devuelve el número 42.
        Devolver42 devolver42 = () -> 42;
        System.out.println(devolver42.devolver42());

        // 6. Devuelve el número pi.
        DevolverPI devolverPI = () -> Math.PI;
        System.out.println(devolverPI.devolverPI());

        // 7. Imprime una cadena de texto.
        ImprimirCadena imprimirCadena = s -> System.out.println(s);
        imprimirCadena.imprimirCadena("Hola");

    }


    //Comprueba si el parámetro recibido es un número impar.
    /* public static boolean esImpar(int n) {
        return n % 2 != 0;
    }


    // Comprueba si el parámetro es la letra ‘y’ (minúscula).
    public static boolean esy(Character c) {
        return c == 'y';
    }


    //Devuelve la suma de dos números.
    public static double sumar(double x, double y) {
        return x + y;
    }


    //Devuelve la suma de los cuadrados de dos números.
    public static int sumarCuadrados(int a, int b) {
        return a * a + b * b;
    }


    //Devuelve el número 42.
    public static int devolver42() {
        return 42;
    }


    //Devuelve el número pi.
    public static double devolverPI() {
        return Math.PI;
    }


    //Imprime una cadena de texto.
    public static void imprimirCadena(String s) {
        System.out.println(s);
    }


    //Imprime “Hola, mundo”.
    public static void imprimirHolaMundo() {
        System.out.println("Hola, mundo.");
    } */
}
