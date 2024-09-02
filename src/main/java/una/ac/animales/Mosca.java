package una.ac.animales;

import una.ac.caracteristicas.Caminante;
import una.ac.caracteristicas.Volador;
import una.ac.fenomenos.DegradacionMotora;

public class Mosca extends Insecto implements Volador, Caminante {
    public Mosca() {
        super("Mosca", 2, 2, "carronia");
        System.out.println(nombre + " creada.");
    }

    @Override
    public void volar() {
        if (alas >= 2) {
            System.out.println(nombre + " volo.");
            DegradacionMotora.degradar(this, "alas");
        } else {
            System.out.println(nombre + " no pudo volar.");
        }
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
