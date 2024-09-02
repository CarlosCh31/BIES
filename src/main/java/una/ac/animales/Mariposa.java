package una.ac.animales;

import una.ac.caracteristicas.Volador;
import una.ac.fenomenos.DegradacionMotora;

public class Mariposa extends Insecto implements Volador {
    public Mariposa() {
        super("Mariposa", 2, 0, "miel");
        System.out.println(nombre + " creada.");
    }

    @Override
    public void volar() {
        if (alas >= 2) {
            System.out.println(nombre +" volo.");
            DegradacionMotora.degradar(this, "alas");
        } else {
            System.out.println(nombre + " no pudo volar.");
        }
    }
}
