package segunda_evaluacion.tema06colecciones.poo.herencia.teoria.empresateleco;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Programador p = new Programador();

        p.setNombre("A. Arenal");
        p.setAño(1985);
        p.setDireccion("Pobladura del Valle, 15");
        p.setFechaInicio(LocalDate.now());
        p.setSalario(50_000L);
        p.setLenguajes(new String[] { "Java", "JavaScript", "PHP" });

        System.out.println(p.getNombre()); // A. Arenal
        System.out.println(p.getSalario()); // 50000
        System.out.println(Arrays.toString(p.getLenguajes())); // [Java, JavaScript, PHP]


    }
}
