package una.ac.animales;

import una.ac.caracteristicas.Caminante;
import una.ac.caracteristicas.Volador;
import una.ac.fenomenos.DegradacionMotora;

/**
 * Representa a una mosca como un tipo específico de insecto
 * que implementa el comportamiento de volar.
 */
public class Mosca extends Insecto implements Volador, Caminante {

    /**
     * Constructor para crear una instancia de mosca con sus características
     * predeterminadas: 2 alas, 2 patas, y su alimento principal es la carroña.
     */
    public Mosca() {
        super("Mosca", 2, 2, "carroña");
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
            System.out.println(nombre + " volo.");
            DegradacionMotora.degradar(this, "ala");
        } else {
            System.out.println(nombre + " no pudo volar.");
        }
    }

    /**
     * Implementación del método caminar definido en la interfaz Caminante.
     * Al caminar, existe la posibilidad de que pierda una pata debido a la
     * degradación motora.
     */
    @Override
    public void caminar() {
        if (patas >= 2) {
            System.out.println(nombre + " camino.");
            DegradacionMotora.degradar(this, "pata");
        } else {
            System.out.println(nombre + " no pudo caminar.");
        }
    }
}
