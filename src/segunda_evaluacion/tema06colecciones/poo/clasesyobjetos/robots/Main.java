package segunda_evaluacion.tema06colecciones.poo.clasesyobjetos.robots;

public class Main {
    public static void main(String[] args) {

        Robot robot1 = new Robot();
        System.out.println(robot1);

        Robot robot2 = new Robot("Mazinger", "Z", 2000);
        System.out.println(robot2);

        Robot robot3 = new Robot("Afrodita", "A");
        System.out.println(robot3);
    }
}
