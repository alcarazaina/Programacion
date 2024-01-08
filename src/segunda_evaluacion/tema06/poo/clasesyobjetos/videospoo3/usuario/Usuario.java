package segunda_evaluacion.tema06.poo.clasesyobjetos.videospoo3.usuario;

public class Usuario {
    private String nombreUsuario;
    private String contraseña;
    private Perfil perfil;

    public Usuario(String nombreUsuario, String contraseña, Perfil perfil) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.perfil = perfil;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", perfil='" + perfil + '\'' +
                '}';
    }
    public void login(){
        System.out.println("Log in");
    }
    public void logout(){
        System.out.println("Log out");

    }
    public void comprar(){
        System.out.println("Comprar");

    }
}
