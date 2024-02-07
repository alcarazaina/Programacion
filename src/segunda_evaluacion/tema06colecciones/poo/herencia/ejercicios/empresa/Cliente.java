package segunda_evaluacion.tema06colecciones.poo.herencia.ejercicios.empresa;

public class Cliente extends Persona{
    private String telefonoDeContacto;

    public Cliente(String nombre, int edad, String telefonoDeContacto) {
        super(nombre, edad);
        this.telefonoDeContacto = telefonoDeContacto;
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }
    public void mostrar(String nombre, int edad, String telefonoDeContacto){
        System.out.println(nombre + " " + edad + " " + telefonoDeContacto);
    }
}
