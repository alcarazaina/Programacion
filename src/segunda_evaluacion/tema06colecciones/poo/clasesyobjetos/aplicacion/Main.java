package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.aplicacion;


import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
        public static void main(String[] args) {

        Usuario usuario1 = crearUsuario();
        System.out.println(usuario1);

        System.out.println(usuario1.getEstado());

        usuario1.mensajeEstado();
        usuario1.setEstado(Estado.ACTIVO);
        usuario1.mensajeEstado();
    }
    public static Usuario crearUsuario(){
        Usuario usuario = new Usuario(teclado.nextLine(), teclado.nextLine(), teclado.nextLine());
        return usuario;
    }
}
