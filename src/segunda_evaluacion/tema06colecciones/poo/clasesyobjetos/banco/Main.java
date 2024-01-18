package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.banco;

public class Main {
    public static void main(String[] args) {

        Usuario propietario = new Usuario("demo","Ale","Chim Pom");
        System.out.println(propietario);

        Cuenta cuenta = new Cuenta("123456",1000,propietario);

        mostrarCuenta(cuenta);

    }
    public static void mostrarCuenta (Cuenta cuenta){
        System.out.println(cuenta);
    }
}
