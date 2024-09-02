package una.ac.animales;

import una.ac.caracteristicas.Caminante;
import una.ac.caracteristicas.Volador;

public class Innombrable extends SerVivo implements Volador, Caminante {
    @Override
    public void alimentarse() {
        System.out.println("El innombramble está comiendo");
    }

    @Override
    public void volar() {
        System.out.println("El innombramble está volando");
    }

    @Override
    public void caminar() {
        System.out.println("El innombramble está caminando");
    }
}