package segunda_evaluacion.tema06Colecciones.poo.clasesyobjetos.videospoo3.usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Aina", "contraseñadeprueba", Perfil.PRIVADO);
        System.out.println(usuario1);
        usuario1.login();
        usuario1.comprar();
        usuario1.logout();
    }
}
