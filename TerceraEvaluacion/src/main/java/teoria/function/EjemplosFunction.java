package teoria.function;

import ejercicios.lambda.ejercicio01.Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class EjemplosFunction {
    public static void main(String[] args) {
        //Por ejemplo: utilizamos Function para calcular el cuadrado de un número:
        // La función recibe un Double, calcula su cuadrado y lo devuelve (otro Double)
        Function<Double, Double> cuadrado = x -> Math.pow(x, 2);
        Double resultado = cuadrado.apply(1.25);
        System.out.println(resultado);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Pedro", 51));
        personas.add(new Persona("Carlos", 35));
        personas.add(new Persona("Robert", 24));
        personas.add(new Persona("Aina", 29));
        personas.add(new Persona("Kamilly", 19));
        personas.add(new Persona("Sergio", 13));
        personas.add(new Persona("Ana", 8));
        personas.add(new Persona("Alejandro", 27));
        System.out.println("\nRecién creada la lista: ");
        System.out.println(personas);

        Map<String, Integer> mapaEdades = new HashMap<>();
        mapaEdades.put("Pedro", 51);
        mapaEdades.put("Carlos", 35);
        mapaEdades.put("Robert", 24);
        mapaEdades.put("Aina", 29);
        mapaEdades.put("Kamilly", 19);
        mapaEdades.put("Sergio", 13);
        mapaEdades.put("Ana", 8);
        mapaEdades.put("Alejandro", 27);

        Function<Integer, Integer> aumentarEdad  = edad -> edad +1;
        mapaEdades.replaceAll((nombre, edad) -> aumentarEdad.apply(edad));
        mapaEdades.forEach((nombre, edad) -> System.out.println(nombre + ": " + edad));
    }
}
