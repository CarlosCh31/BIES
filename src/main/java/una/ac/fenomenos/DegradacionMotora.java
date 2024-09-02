package una.ac.fenomenos;

import una.ac.animales.Insecto;

import java.util.Random;

public class DegradacionMotora {
    public static void degradar(Insecto insecto, String parte) {
        Random random = new Random();
        if (parte.equals("alas")){
            if (random.nextInt(insecto.getAlas()) == 0){
                insecto.perderAla();
                return;
            }
        } else if (parte.equals("patas")){
            if (random.nextInt(insecto.getPatas()) == 0){
                insecto.perderPata();
                return;
            }
        }
        System.out.println(insecto.getNombre() + " no perdió ninguna " + parte + ".");
    }
}
