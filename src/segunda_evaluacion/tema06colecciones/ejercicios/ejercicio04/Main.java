package segunda_evaluacion.tema06colecciones.ejercicios.ejercicio04;

public class Main {
    public static void main(String[] args) {


        Diccionario miDiccionario = new Diccionario();
        miDiccionario.nuevoPar("Perro", "Dog");
        miDiccionario.nuevoPar("Gato", "Cat");
        miDiccionario.nuevoPar("Mesa", "Table");
        miDiccionario.nuevoPar("Silla", "Chair");
        miDiccionario.nuevoPar("Programación", "Programming");
        miDiccionario.nuevoPar("Pelo", "Hair");
        miDiccionario.nuevoPar("Cara", "Face");
        miDiccionario.nuevoPar("Labios", "Lips");

        System.out.println(miDiccionario);
        String traduccion = miDiccionario.traduce("Pelo");
        System.out.println(traduccion);

        miDiccionario.palabraAleatoria();
        String primeraLetraTraducion = miDiccionario.primeraLetraTraducion("Gato");
        System.out.println(primeraLetraTraducion);
    }
}
