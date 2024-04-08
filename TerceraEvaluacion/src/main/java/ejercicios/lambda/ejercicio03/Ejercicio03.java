package ejercicios.lambda.ejercicio03;

import java.util.function.Predicate;

public class Ejercicio03 {
    public static void main(String[] args) {

        // 1. Define un predicado para comprobar si un entero es múltiplo de 5.
        Predicate<Integer> esMultiplo5 = numero -> numero % 5 == 0;
        System.out.println("Es multiplo de 5: ");
        System.out.println(esMultiplo5.test(16));

        // 2. Define un predicado para comprobar si un String no termina en “s”.
        Predicate<String> acabaEnS = cadena -> !cadena.endsWith("s");
        System.out.println("No acaba en s: ");
        System.out.println(acabaEnS.test("Hola Mundos"));

        // 3. Define un predicado para comprobar si un entero es par y múltiplo de 3.
        Predicate<Integer> esParYMul3 = numero -> numero % 2 == 0 && numero % 3 == 0;
        System.out.println("Es par y multiplo de 3: ");
        System.out.println(esParYMul3.test(18));

        // 4. Define un predicado para comprobar si un carácter es una letra y está en mayúscula.
        Predicate<Character> esMayuscula = caracter -> Character.isUpperCase(caracter);
        System.out.println("Es una letra mayúscula: ");
        System.out.println(esMayuscula.test('D'));

        // 5. Define un predicado para comprobar si un entero es impar y múltiplo de 7.
        Predicate<Integer> esImparYMul7 = numero -> numero % 2 != 0 && numero % 7 == 0;
        System.out.println("Es impar y múltiplo de 7: ");
        System.out.println(esImparYMul7.test(23));

        // 6. Define un predicado para comprobar si un entero es impar o múltiplo de 7.
        Predicate<Integer> esImparOMul7 = numero -> numero % 2 != 0 || numero % 7 == 0;
        System.out.println("Es impar o múltiplo de 7: ");
        System.out.println(esImparOMul7.test(15));

    }
}
