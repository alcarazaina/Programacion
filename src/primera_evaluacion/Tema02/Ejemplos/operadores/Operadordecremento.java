package primera_evaluacion.Tema02.Ejemplos.operadores;

public class Operadordecremento {
    public static void main(String[] args) {
        //Operador de incremento
        // Sirve para añadir una unidad a una variable de tipo entero
        int variable = 0;
        System.out.println(variable + " antes de decrementarle");
         variable--; //decrementa la variable una unidad
        System.out.println(variable + " después de decrementarle");
        variable--; //decrementa la variable una unidad
        System.out.println(variable + " después de decrementarla");
        // y así sucesivamente
        // es lo mismo que hacer variable = variable - 1
        variable = variable - 1;
        System.out.println(variable + " después de restarle 1");
        // también se puede poner así: variable -= 1
        variable -= 1;
        System.out.println(variable + " después de poner -= 1");



    }
}
