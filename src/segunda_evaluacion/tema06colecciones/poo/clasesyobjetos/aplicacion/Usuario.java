package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.aplicacion;

public class Usuario {
    private String username;
    private String email;
    private String password;
    private Estado estado;

    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.estado = Estado.PENDIENTE;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "username: " + username + '\n' +
                "email: " + email + '\n' +
                "password: " + "*******";
    }

    // aquí vienen los métodos de usuario, los que creo yo

    public void mensajeEstado(){
        if (estado.equals(Estado.PENDIENTE)){
            System.out.println("Tienes que esperar un poco.");
        } else if (estado.equals(Estado.ACTIVO)){
            System.out.println("Todo ok, vía libre.");
        } else if (estado.equals(Estado.BLOQUEADO)){
            System.out.println("Usuario bloqueado. Algo habrás hecho");
        }else{
            System.out.println("Estado desconocido");
        }
    }

}
