package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.teoria;

public class MiClase {

    // atributos
    int atributo;
    boolean otroAtributo;
    String nombre;

    //constructor -> podríamos no ponerlo, y java utilizará el constructor por defecto, es decir un constructor "invisible", que no recibe parámetros, solo crea el objeto vacío


    // si queremos getter y setters -> podemos no ponerlo porque es publico

    // toString() podemos no ponerlo

    // métodos de usuario (no predefinidos, normalmente son métodos de instancia -> solo podrán llamarse a partir de objetos que hayamos creado de esta clase)

    // método que improme el atributo

    public void imprimirAtributo(){
        System.out.println("Valor del atributo: " + atributo);
        System.out.println("Valor del nuevo atributo: " + otroAtributo);
        System.out.println("Valor del nombre: " + nombre);
    }

}
