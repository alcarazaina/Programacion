package PrimeraEvaluacion.Tema04.Ejemplos;

public class EjemplosString {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str); // null, con esto no tengo nada en memoria guardado
        str = ""; // esto es una cadena vacía, con esto si guardo en memoria
        System.out.println(str);
        str = "hola";
        System.out.println(str); // hola


        String cadena = "Esto es una cadena";
        System.out.println(cadena); // imprime “Esto es un string"

        String otraCadena = "Esta\n es\n otra cadena"; // cadena con caracteres de escape
        System.out.println(otraCadena); // imprime el resultado en varias líneas

        //Cómo obtener la longitud (length) y los caracteres de un String (char at)
        int longitud = cadena.length(); //devuelve un valor de tipo int
        System.out.println("Longitud: " + longitud);
        // 4º carácter
        System.out.println("4º carácter: " + cadena.charAt(3)); // devuelve un char
        // primer carácter
        System.out.println("Primer carácter: " + cadena.charAt(0));
        // Último carácter: si el primer carácter está en la posición (índice) 0 y la longitud es length()
        // el ultimo carácter será length() -1
        System.out.println("Último carácter: " + cadena.charAt(longitud - 1));
        char ultimoCaracter = cadena.charAt(longitud - 1);

        // Métodos útiles para trabajar con cadenas de texto
        String cadena1 = "Los ordenadores son buenos siguiendo instrucciones, no leyendo tu mente";
        String cadena2 = "";
        // isEmpty() devuelve true si la cadena está vacía; de lo contrario, false;
        boolean empty = cadena1.isEmpty();
        System.out.println("cadena1 esta vacía: " + empty);
        boolean empty2 = cadena2.isEmpty();
        System.out.println("cadena2 esta vacía: " + empty2);

        // toUpperCase() devuelve una nueva cadena en mayúsculas;
        String mayuscula = cadena1.toUpperCase();
        System.out.println(mayuscula);

        // toLowerCase() devuelve una nueva cadena en minúsculas;
        String minuscula = cadena1.toLowerCase();
        System.out.println(minuscula);

        // startsWith(prefijo) devuelve true si la cadena comienza con el prefijo de cadena dado; de lo contrario, false;
        boolean prefijo = cadena1.startsWith("Los ");
        System.out.println("LLeva el prefijo Los : " + prefijo);

        // endsWith(sufijo) devuelve true si la cadena termina con el sufijo dado; de lo contrario, false.
        boolean sufijo = cadena1.endsWith("mente");
        System.out.println("LLeva el sufijo mente: " + sufijo);

        // contains(...) devuelve true si la cadena contiene la cadena o el carácter dados;
        boolean contiene = cadena1.contains("no");
        System.out.println("La cadena1 contiene no: " + contiene);

        // substring(posicionInicial, posicionFinal) devuelve una subcadena de la cadena en el rango: posicionInicial, posicionFinal - 1;
        String subcadena = cadena1.substring(4,9);
        System.out.println(subcadena);

        // replace(old, new) devuelve una nueva cadena obtenida reemplazando todas las apariciones de old con new que pueden ser caracteres o cadenas.
        String nuevo = cadena1.replace("no", "si");
        System.out.println("Reemplazamos: " + nuevo);

        // trim() devuelve una copia de la cadena obtenida al omitir los espacios en blanco iniciales y finales. Ten en cuenta que el espacio en blanco incluye no solo el carácter de espacio, sino principalmente todo lo que parece vacío: tabulación, retorno de carro, carácter de nueva línea, etc.
        String trim = cadena1.trim();
        System.out.println("Quitamos espacios: " + trim);

    }
}
