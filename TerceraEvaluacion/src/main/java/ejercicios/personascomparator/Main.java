package ejercicios.personascomparator;

import hoteles.Hotel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Persona p1 = new Persona("Mario", 22, 1.87);
        Persona p2 = new Persona("Pepe", 52, 1.73);
        Persona p3 = new Persona("Manuel", 27, 1.58);
        Persona p4 = new Persona("David", 25, 1.64);
        Persona p5 = new Persona("Alberto", 80, 1.84);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        impromirPersonas(personas);
        System.out.println();

        System.out.println("Ordenados por altura de mayor a menor");
        CompararAltura compararAltura = new CompararAltura();
        personas.sort(compararAltura);

        impromirPersonas(personas);

        System.out.println();

        System.out.println("Ordenados de menor a mayor por edad");
        CompararEdad compararEdad = new CompararEdad();
        personas.sort(compararEdad);

        impromirPersonas(personas);




    }
    public static void impromirPersonas (ArrayList<Persona> personas){
        for (Persona persona: personas) {
            System.out.println(persona);
        }
    }
}
