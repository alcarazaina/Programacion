package segunda_evaluacion.tema06.poo.clasesyobjetos.aviones;

public class Main {
    public static void main(String[] args) {
        avion airbusa320 = new avion("Airbus A320",98,400, 873910379);
        avion boeing777 = new avion("Boeing 777", 123,390,342874029);

        System.out.println("Nombre: " + airbusa320.getNombre());
        System.out.println("Aforo: " + airbusa320.getAforo());
        System.out.println("Velocidad media: " + airbusa320.getVelocidadmedia());
        System.out.println("Coordenadas: " + airbusa320.getCoordenadas());
        System.out.println("====================================================");
        System.out.println("Nombre: " + boeing777.getNombre());
        System.out.println("Aforo: " + boeing777.getAforo());
        System.out.println("Velocidad media: " + boeing777.getVelocidadmedia());
        System.out.println("Coordenadas: " + boeing777.getCoordenadas());
    }
}
