package una.ac;

import una.ac.animales.Arania;
import una.ac.animales.Mariposa;
import una.ac.animales.Mosca;

public class Main {
    public static void main(String[] args) {
        Mariposa M1 = new Mariposa();
        Mosca Mo1 = new Mosca();
        Arania A1 = new Arania();

        M1.volar();
        M1.volar();
        Mo1.volar();
        Mo1.volar();
        Mo1.caminar();
        Mo1.caminar();
        A1.caminar();
        A1.caminar();

        M1.alimentarse();
        Mo1.alimentarse();
        A1.alimentarse();
    }
}