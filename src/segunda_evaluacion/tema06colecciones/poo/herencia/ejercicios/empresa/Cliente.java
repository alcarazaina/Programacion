package segunda_evaluacion.tema06colecciones.poo.herencia.ejercicios.empresa;

public class Cliente extends Persona{
    private String telefonoDeContacto;

    public Cliente(String nombre, int edad, String telefonoDeContacto) {
        super(nombre, edad);
        int cifras = 0;
        if (telefonoDeContacto.length() == 9 ) {
            for (int i = 0; i < telefonoDeContacto.length(); i++) {
                if (Character.isDigit(telefonoDeContacto.charAt(i))) {
                   cifras++;
                }
            }
        }
        if (cifras == 9){
            this.telefonoDeContacto = telefonoDeContacto;
        } else {
            this.telefonoDeContacto = "Desconocido";
        }
    }

    public Cliente(String nombre, int edad) {
        super(nombre, edad);
        this.telefonoDeContacto = "Desconocido";
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }

    @Override
    public void mostrar(){
        System.out.println("DATOS DE CLIENTE: ");
        System.out.println(nombre + " " + edad + " " + telefonoDeContacto);
    }
}
