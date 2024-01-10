package segunda_evaluacion.tema06Colecciones.poo.clasesyobjetos.aviones;

public class Avion {
    private String nombre;
    private int aforo;
    private int velocidadmedia;
    private int coordenadas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public int getVelocidadmedia() {
        return velocidadmedia;
    }

    public void setVelocidadmedia(int velocidadmedia) {
        this.velocidadmedia = velocidadmedia;
    }

    public int getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(int coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Avion(String nombre, int aforo, int velocidadmedia, int coordenadas) {
        this.nombre = nombre;
        this.aforo = aforo;
        this.velocidadmedia = velocidadmedia;
        this.coordenadas = coordenadas;


    }
}
