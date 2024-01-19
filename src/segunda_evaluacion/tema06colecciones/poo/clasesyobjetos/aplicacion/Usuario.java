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
        return "Usuario{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
