package primera_evaluacion.Tema02.Ejemplos.metodosPrint;

public class Ejemplos {
    public static void main(String[] args) {
       //println--> imprime el contenido dentro de los paréntesis y añade un salto de línea
        System.out.println("Hola, mundo");
        System.out.println("Otra línea");
        System.out.println();
        //print --> imprime el contenido pero no añade un salto, por lo que si tenemos un print a continuación de otro saldrán ambos en la misma línea
        System.out.print("Hola, ");
        System.out.print("mundo");
        System.out.println();
        System.out.println();
        //printf --> Imprime con formato
        /*
        Este método permite formatear y mostrar datos utilizando especificadores de formato, como
        %s para cadenas,
        %d para enteros,
        %f para números de punto flotante, etc.
         */
        String nombre = "Juan";
        System.out.printf("Nombre: %s", nombre); // En lugar de poner + ponemos %s dentro de las comillas y, después de la coma la variable
        System.out.println();

        int edad = 25;
        System.out.printf("Edad: %d", edad);
        System.out.println();

        double altura = 1.75646872746871234686;
        System.out.printf("Altura: %.2f \n", altura); //quiero mostrar solo dos decimales %.2f

        System.out.printf("\n\n Las tres variables en el mismo texto sería: %s, %d, %.2f metros", nombre, edad, altura);
    }
}
