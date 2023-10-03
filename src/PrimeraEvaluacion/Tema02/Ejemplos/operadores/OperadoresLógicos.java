package PrimeraEvaluacion.Tema02.Ejemplos.operadores;

public class OperadoresLógicos {
    public static void main(String[] args) {
        /**
        * @see https://drive.google.com/file/d/1s_CGmUs3c-rO7o681OArhINztA_VZnze/view
         *
         */
        // LOS OPERADORES LÓGICOS TRABAJAN CON Y DAN COMO RESULTADO VARIABLES boolean
        //El operador not (!) invierte el valor de la variable a la que afecta
        System.out.println("*** not ***");
        boolean variable = true;
        System.out.println(variable); //true

        variable = !variable;
        System.out.println(variable); //false

        //los operadores binarios and (&&),or (||) y not
        System.out.println("*** and ***");

        boolean v1 = true;
        boolean v2 = true;
        boolean resultadoAnd = v1 && v2;
        System.out.println(resultadoAnd); //true
        v2 = false;
        v1 = true;
        resultadoAnd = v1 && v2;
        System.out.println(resultadoAnd); //false
        v1 = false;
        v2 = true;
        resultadoAnd = v1 && v2;
        System.out.println(resultadoAnd = v1 && v2); //false
        v1 = false;
        v2 = false;
        resultadoAnd = v1 && v2;
        System.out.println(resultadoAnd); //false

        System.out.println("*** or ***");

        v1 = true;
        v2 = true;
        boolean resultadoOr = v1 || v2;
        System.out.println(resultadoOr); //true
        v2 = false;
        v1 = true;
        resultadoOr = v1 || v2;
        System.out.println(resultadoOr); //true
        v1 = false;
        v2 = true;
        resultadoOr = v1 || v2;
        System.out.println(resultadoOr = v1 || v2); //true
        v1 = false;
        v2 = false;
        resultadoOr = v1 || v2;
        System.out.println(resultadoOr); //false

        // \t mete una tabulación o cadena de caracteres
        System.out.println("Ejemplo tabulación : true\ttrue ");




    }
}
