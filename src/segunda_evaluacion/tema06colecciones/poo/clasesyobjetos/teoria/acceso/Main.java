package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.teoria.acceso;

public class Main {
    public static void main(String[] args) {

        // vamos a probar a qué accedemos estando en el mismo paquete que la variable que quiero utilizar

        Publica objetoPublica = new Publica();
        System.out.println(objetoPublica.atributoPublico);

        ProteccionDePaquete objetoPP = new ProteccionDePaquete();
        System.out.println(objetoPP.atributoConProteccionDePaquete);

        Protegida objetoProtegido = new Protegida();
        System.out.println(objetoProtegido.atributoProtegido);

        Privada objetoPrivado = new Privada();
        // System.out.println(objetoPrivado.);

    }
}
