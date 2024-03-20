package hoteles;

import java.util.Objects;

public class Hotel implements Comparable{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return idHotel == hotel.idHotel && zona == hotel.zona;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHotel, zona);
    }

    //Queremos ordenar una serie de hoteles por precio de mayor a menor. Adapta el código para poder realizar tal ordenación implementando la interfaz Comparable.
    @Override
    public int compareTo(Object o) {
        //casting de Object a Hotel
        Hotel h = (Hotel) o;
        if (this.precio > h.precio){
            return -1;
        } else if (this.precio < h.precio){
            return 1;
        }else {
            return 0;
        }
    }

}
//alt + 7 para ver todos los métodos