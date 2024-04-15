package ejercicios.stream.ejercicio02;

public class Personaje {
    private String nombre;
    private int edad;
    private Arma arma;
    private boolean esHumano;


    public Personaje(String nombre, int edad, boolean esHumano, Arma arma) {
        this.nombre = nombre;
        this.edad = edad;
        this.esHumano = esHumano;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsHumano() {
        return esHumano;
    }

    public void setEsHumano(boolean esHumano) {
        this.esHumano = esHumano;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return nombre + " | " +
                "\n Edad: " + edad +
                "\n ¿Humano? " + esHumano +
                "\n Arma: " + arma;
    }
}
