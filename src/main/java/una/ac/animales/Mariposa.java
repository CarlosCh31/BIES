package una.ac.animales;

import una.ac.caracteristicas.Volador;
import una.ac.fenomenos.DegradacionMotora;

/**
 * Representa a una mariposa como un tipo específico de insecto
 * que implementa el comportamiento de volar.
 */
public class Mariposa extends Insecto implements Volador {

    /**
     * Constructor para crear una instancia de mariposa con sus características
     * predeterminadas: 2 alas, 0 patas, y su alimento principal es la miel.
     */
    public Mariposa() {
        super("Mariposa", 2, 0, "miel");
        System.out.println(nombre + " creada.");
    }

    /**
     * Implementación del método volar definido en la interfaz Volador.
     * Al volar, existe la posibilidad de que pierda una pata debido a la
     * degradación motora.
     */
    @Override
    public void volar() {
        if (alas >= 2) {
            System.out.println(nombre +" volo.");
            DegradacionMotora.degradar(this, "ala");
        } else {
            System.out.println(nombre + " no pudo volar.");
        }
    }
}
