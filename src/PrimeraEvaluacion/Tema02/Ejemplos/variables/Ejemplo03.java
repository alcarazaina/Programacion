package PrimeraEvaluacion.Tema02.Ejemplos.variables;

public class Ejemplo03 {
    // de momento, todas las clases deben llevar un método main
    public static void main(String[] args) {
        // una variable es una palabra que guarda un valor
        // tipos de variables:
        // - numéricas:
        //    -enteros
        // según el tamaño que vaya a ocupar en memoria: byte (8 bits), short (2 bytes), int (4 bytes), long (8 bytes)
        // se suele utilizar normalmente int, y si no cabe, long
        int año = 2023;
        System.out.println("Empiezo DAM en " + año);
        // si quiero cambiar el valor de la variable año:
        año = año + 2;
        System.out.println("Me titularé como Técnico superior en "+ año);

        //    -en coma flotante (con decimales)
        // tenemos float(32 bits) pero mejor no utilizarlo, vamos a utilizar double(64 bits)
        double sueldo = 20800;
        System.out.println("El sueldo de un desarrollador junior es " + sueldo + "€");
        double porcentajeSubida = 0.0452; // equivale a 4.52%
        double subidaAnual = sueldo * porcentajeSubida; // El valor que guardo en la variable es el resultado de una expresión matemática
        System.out.println("En un año me subirán " + subidaAnual + "€");

        // otro tipo de variable: String = cadena de caracteres, o texto
        String nombre = "Aina";
        String apellido = "Alcaraz";
        System.out.println("Mi nombre es " + nombre + " " + apellido);
    }
}
