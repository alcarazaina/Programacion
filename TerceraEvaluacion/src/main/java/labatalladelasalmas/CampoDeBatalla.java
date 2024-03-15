package labatalladelasalmas;

import java.util.ArrayList;

public class CampoDeBatalla {
    public static void main(String[] args) {

        Humano humano1 =  new Humano(50);
        humano1.mostrar();
        System.out.println();

        luchar(humano1);

        humano1.rezar();
        humano1.rezar();
        humano1.rezar();
        humano1.pecar();
        humano1.pecar();
        humano1.pecar();
        humano1.rezar();
        humano1.rezar();

        humano1.mostrar();
    }

    public static void luchar(Humano h){
        ArrayList<Ángel> angeles = h.angeles;
        ArrayList<Demonio> demonios = h.demonios;
        //sumar la bondad de los ángeles
        int sumaBondad = 0;
        int sumaMaldad = 0;

        for (int i = 0; i < angeles.size(); i++) {
            sumaBondad = sumaBondad + angeles.get(i).bondad;
        }
        for (Demonio demonio: demonios) {
            sumaMaldad += demonio.getMaldad();
        }
        System.out.println("Combate entre los ángeles y demonios");
        System.out.println("_______________________________________");
        System.out.println("Bondad de los ángeles: " + sumaBondad);
        System.out.println("Maldad de los demonios: " + sumaMaldad);

        if (sumaMaldad < sumaBondad){
            h.rezar();
            System.out.println(sumaMaldad + " < " + sumaBondad + "---> El humano reza, por lo que tiene un ángel más y la fe del humano aumenta.");
        }else if(sumaBondad < sumaMaldad){
            h.pecar();
            System.out.println(sumaMaldad + " > " + sumaBondad + "---> El humano peca, por lo que tiene un demonio más y la fe del humano disminuye.");
        }
        }
    }
