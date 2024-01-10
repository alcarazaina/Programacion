package segunda_evaluacion.tema06Colecciones.poo.clasesyobjetos.edificio;

public class Main {
    public static void main(String[] args) {
        // aquí creamos los objetos de tipo Edificio
        Edificio miCasa = new Edificio(3,70,1960);
        Edificio tuCasa = new Edificio(4,135,1970);
        //  quiero ver el valor de los atributos
        System.out.println("Mi edificio tiene " + miCasa.getPlantas() + " plantas, " + miCasa.getMetros2() + " metros cuadrados y fue construida en el año " + miCasa.getAño());
        System.out.println("Tu edificio tiene " + tuCasa.getPlantas() + " plantas, " + tuCasa.getMetros2() + " metros cuadrados y fue construida en el año " + tuCasa.getAño());
    }
}
