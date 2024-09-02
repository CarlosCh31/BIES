package una.ac.animales;

import una.ac.caracteristicas.Caminante;
import una.ac.fenomenos.DegradacionMotora;

public class Arania extends Insecto implements Caminante {
    public Arania() {
        super("Arania", 0, 8, "hongos");
        System.out.println(nombre + " creada.");
    }

    @Override
    public void caminar() {
        if (patas >= 2) {
            System.out.println(nombre + " camino.");
            DegradacionMotora.degradar(this, "patas");
        } else {
            System.out.println(nombre + " no pudo caminar.");
        }
    }
}
