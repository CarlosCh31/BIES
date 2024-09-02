package una.ac.animales;

import una.ac.caracteristicas.Caminante;
import una.ac.fenomenos.DegradacionMotora;

/**
 * Representa a una araña como un tipo específico de insecto
 * que implementa el comportamiento de caminar.
 */
public class Arania extends Insecto implements Caminante {

    /**
     * Constructor para crear una instancia de Arania con sus características
     * predeterminadas: 0 alas, 8 patas, y su alimento principal son los hongos.
     */
    public Arania() {
        super("Araña", 0, 8, "hongos");
        System.out.println(nombre + " creada.");
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
