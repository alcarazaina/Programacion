package teoria.biblioteca;

import java.util.Comparator;

public class CompararFechaNacimiento implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Socio s1 = (Socio) o1;
        Socio s2 = (Socio) o2;
        if (s1.getFechaNac().isBefore(s2.getFechaNac())){
            return -1;
        } else if (s1.getFechaNac().isAfter(s2.getFechaNac())) {
            return 1;
        } else {
            return 0;
        }
    }
}
