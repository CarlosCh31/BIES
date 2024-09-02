package una.ac.animales;

import una.ac.caracteristicas.Caminante;
import una.ac.caracteristicas.Volador;

/**
 * Representa a los seres vivos que existen en BIES pero que no
 * conocemos nada de ellos.
 */
public class Innombrable extends SerVivo implements Volador, Caminante {

    /**
     * Implementa la alimentación de SerVivo.
     */
    @Override
    public void alimentarse() {
        System.out.println("El innombrable está comiendo");
    }

    /**
     * Implementa volar de volador.
     */
    @Override
    public void volar() {
        System.out.println("El innombrable está volando");
    }

    /**
     * Implementa el metodo caminar de caminante.
     */
    @Override
    public void caminar() {
        System.out.println("El innombrable está caminando");
    }
}