package primera_evaluacion.tema03.Ejemplos;

public class EjemplosForAnidado {
    public static void main(String[] args) {
        //Un for dentro de otro for sirve para trabajar con tablas, tableros, arrays bidimensionales, etc.
        //Es decir, cualquier estructura que se organice en filas y columnas
        for (int i = 1; i < 6; i++) { //en el bucle de fuera llevamos las filas -> i
            // esto empezaría: para i = 1, 1 < 6 es true, entonces entra en el for interno y comienza poniendo j = 1
            // la idea que para cada valor de i hace una pasada completa de j (el bucle interno)
            for (int j = 1; j < 6; j++) { //en el bucle de dentro llevamos las columnas -> j
                System.out.print("f" + i + "c" + j + " ");
            }
            //cada vez que finaliza una pasada completa del bucle interno hace un salto de linea antes de seguir incrementando i en el bucle externo
            System.out.println(); //para que haga la tabla si no te lo imprime en la misma línea
        }
        System.out.println("\n\n");
        //Otro ejemplo: bucle for anidado que imprima la tabla de multiplicar
        //1 2 3 ... 10
        //2 4 6 ... 20
        //3 6 9 ... 30
        //...
        //10 20 30 ... 100

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(i * j + "\t"); // \t para tabular y que quede bien organizado
            }
            System.out.println();
        }
    }
}
