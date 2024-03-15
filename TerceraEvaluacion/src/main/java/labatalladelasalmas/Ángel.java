package labatalladelasalmas;

public class Ángel extends Incorpóreo{

    int bondad;
    int maldad;

    public Ángel(int bondad) {
        this.bondad = bondad;
        this.maldad = maldad;
    }

    @Override
    public String toString() {
        return "Angel{" +
                "bondad=" + bondad +
                '}';
    }
    @Override
    public void mostrar() {
        System.out.println(this.toString());
    }
}
