package lambda.teoriainterfacesfuncionales;

public class Main {
    public static void main(String[] args) {
        // voy a intentar instanciar la interfaz funcional HolaMundo
        // me crea una clase anónima (Lo que hay entre las llaves {}) para que implemente el método
        /* HolaMundo hm = new HolaMundo() {
            @Override
            public void HolaMundo() {
                System.out.println("Hola Mundo");
            }
        }; */

        HolaMundo hm = () -> System.out.println("Hola Mundo");
        // una vez hayas rellenado el método de la clase anónima ya tienes un objeto con el que llamarlo.

        hm.HolaMundo();
    }
}
