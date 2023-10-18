package PrimeraEvaluacion.Tema03.Ejercicios.ejerciciosfor;

public class Ejercicio26 {
    public static void main(String[] args) {
        /*
        Hacer un programa que calcule la suma y el producto de los 30 primeros números naturales. (El 0 no cuenta)
         */
        // la suma sería: 1 + 2 + 3.....+ 30 (ambos inclusive)
        int suma = 0; // la suma siempre la iniciamos a 1
        for (int i = 1; i <= 30 ; i++) { //También podríamos poner <31
            suma = suma + i; // en la 1ª vuelta i vale 1, en la 2ª i vale 2, en la 3ª vale 3...
        }
        System.out.println("Suma = " + suma);

        //ahora vamos con el producto de los 30 primeros números naturales: 1 * 2 * 3...* 30
        int producto = 1; // el producto acumulado lo tenemos que inicializar a 1 porque en 0 nos daría 0
        for (int i = 1; i <= 30 ; i++) {
            producto = producto * i;
        }
        System.out.println("Producto = " + producto);
    }
}
