package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.teoria.ejemplosestaticos;

public class Clase {

    private String nombre;
    // esto no es una variable estática, con lo cual, solamente la podemos modificar en cada objeto concreto
    int otraVariable;

    // añadimos una variable estática; no la hacemos private porque queremos que se pueda modificar desde fuera
    static int contarObjetos;

    public Clase(String nombre) {
        this.nombre = nombre;
        // como queremos contar los objetos que vamos creando, incrementamos la variable contarObjetos
        contarObjetos++;
        otraVariable++;
        //

    }

    @Override
    public String toString() {
        return "Clase{" +
                "nombre='" + nombre + '\'' +
                ", otraVariable=" + otraVariable +
                '}';
    }


    // método de instancia
    public void imprimirCosas(){
        System.out.println(this.toString());
    }


    public static void imprimirOtrasCosas(){
        System.out.println(contarObjetos);
    }

}
