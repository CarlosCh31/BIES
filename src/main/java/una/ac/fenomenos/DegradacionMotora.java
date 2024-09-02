package una.ac.fenomenos;

import una.ac.animales.Insecto;

import java.util.Random;

/**
 * Simula el fenómeno de degradación motora propio de BIES
 * en insectos, donde un insecto puede perder alas o patas.
 */
public class DegradacionMotora {

    /**
     * Método estático que simula la degradación de una parte del cuerpo de un insecto.
     * Dependiendo de la parte especificada, ya sea alas o patas, este método
     * decide aleatoriamente si el insecto pierde una de esas partes.
     *
     * @param insecto El insecto que puede sufrir la degradación.
     * @param parte La parte del cuerpo del insecto que podría degradarse.
     */
    public static void degradar(Insecto insecto, String parte) {
        Random random = new Random();
        if (parte.equals("ala")){
            // Genera un número aleatorio entre 0 y el número de alas que tiene el insecto.
            // Si el número generado es 0, el insecto pierde una ala
            if (random.nextInt(insecto.getAlas()) == 0){
                insecto.perderAla();
                return;
            }
        } else if (parte.equals("pata")){
            // Genera un número aleatorio entre 0 y el número de patas que tiene el insecto.
            // Si el número generado es 0, el insecto pierde una pata.
            if (random.nextInt(insecto.getPatas()) == 0){
                insecto.perderPata();
                return;
            }
        }
        // Si no se cumplen las condiciones anteriores, se indica que no se perdió ninguna parte.
        System.out.println(insecto.getNombre() + " no perdió ninguna " + parte + ".");
    }
}
