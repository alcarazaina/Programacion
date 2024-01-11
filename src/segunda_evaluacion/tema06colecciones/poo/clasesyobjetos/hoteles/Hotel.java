package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.hoteles;

public class Hotel {
    private int idHotel;
    private double precio;
    private Zona zona;

    public Hotel(int idHotel, double precio, Zona zona) {
        this.idHotel = idHotel;
        this.precio = precio;
        this.zona = zona;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 500 || precio <= 40){
            System.out.println("El precio máximo es 500€ y el precio mínimo es 40€");
        } else {
            this.precio = precio;
        }
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Hotel -> " +
                "ID: " + idHotel +
                ", precio por noche: " + precio +
                ", Ubicado en: " + zona;
    }
}
//alt + 7 para ver todos los métodos