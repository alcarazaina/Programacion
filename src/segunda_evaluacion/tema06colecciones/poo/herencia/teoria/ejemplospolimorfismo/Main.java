package segunda_evaluacion.tema06colecciones.poo.herencia.teoria.ejemplospolimorfismo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        AnimalMitologico animalMitologico = new AnimalMitologico();
        animalMitologico.saludar();
        // superclase = new subclase
        AnimalMitologico quimera = new Quimera();
        quimera.saludar();
        // subclase = new superclase -> no se puede, no funciona
        // Quimera animal = new AnimalMitologico();
        // se puede hacer al revés si hacemos un casting
        // Quimera animal1 = (Quimera) new AnimalMitologico();
        AnimalMitologico dragon =new Dragon();
        dragon.saludar();
        ArrayList<AnimalMitologico> animalMitologicos = new ArrayList<>();
        animalMitologicos.add(animalMitologico);
        animalMitologicos.add(quimera);
        animalMitologicos.add(dragon);
        System.out.println("Saludar en el Arraylist: ");
        for (AnimalMitologico elemnto : animalMitologicos
             ) {
            elemnto.saludar();
        }
        Dragon fuji = new Dragon();
        animalMitologicos.add(fuji);
    }
}
