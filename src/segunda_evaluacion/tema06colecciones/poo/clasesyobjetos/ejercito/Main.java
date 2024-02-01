package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.ejercito;

public class Main {
    public static void main(String[] args) {

        Unidad unidad1 = new Unidad("Unidad 1");
        Unidad unidad2 = new Unidad("Unidad 2");
        Unidad unidad3 = new Unidad("Unidad 3");
        Unidad unidad4 = new Unidad("Unidad 4");
        Unidad unidad5 = new Unidad("Unidad 5");



        Caballero caballero1 = new Caballero("Caballero 1");
        Caballero caballero2 = new Caballero("Caballero 2");
        Caballero caballero3 = new Caballero("Caballero 3");


        General general1 = new General("General 1");


        Medico medico1 = new Medico("Medico 1");

        imprimirEjercito();
    }

    public static void imprimirEjercito(){
        System.out.println("Mi ejército tiene: ");
        System.out.println("* " + Unidad.unidades + " unidades");
        System.out.println("* " + Caballero.caballeros + " caballeros");
        System.out.println("* " + General.generales + " generales");
        System.out.println("* " + Medico.medicos + " médicos");
    }
}
