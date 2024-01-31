package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.teoria.Hospital;

//Estoy importando las clases del paquete acceso
import segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.teoria.acceso.*;
public class PruebaAcceso {
    public static void main(String[] args) {

        // estamos probando si podemos acceder a las clases desde otro paquete
        Publica objetoPublica = new Publica();
        System.out.println(objetoPublica.atributoPublico);
        ProteccionDePaquete objetoPP = new ProteccionDePaquete();
        // System.out.println(objetoPP.atributoConProteccionDePaquete); -> no deja porque estamos en otro paquete
        Protegida objetoProtegido = new Protegida();
        // System.out.println(objetoProtegido.);
    }
}
