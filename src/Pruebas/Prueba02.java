package Pruebas;

public class Prueba02 {
    public static void main(String[] args) {
/*
1- Escribe un programa que calcule cuánto tiempo tarda en llegar a la Júpiter un cohete
que va a una velocidad 39.420 km/h desde la Tierra que hay 590 millones de km entre
estos dos planetas. Muestra el tiempo en años, meses, días, horas, minutos y segundos.
v=d/t
*/

long metrosAJupiter = 590000000L * 1000L;
long metrosCohete = 39420L * 1000L;
long tiempoEnSegundos = (metrosAJupiter / metrosCohete) * 3600L;

long año = tiempoEnSegundos / 31536000L;
long restoAño = tiempoEnSegundos % 31536000L;
long meses = restoAño / 2622720L;
long restoMes = restoAño % 2622720L;
long dias = restoMes / 86400L;
long restoDias = restoMes % 86400L;
long horas = restoDias / 3600L;
long restoHoras = restoDias % 3600L;
long minutos = restoHoras / 60L;
long restoMinutos = restoHoras % 60L;
long segundos = restoMinutos;

        System.out.println("El cohete llegará a Júpiter en un " + año + " año, " + meses + " meses, " + dias + " días, " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");

    }

}
