package una.ac.fenomenos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import una.ac.animales.Insecto;

import static org.junit.jupiter.api.Assertions.*;

class DegradacionMotoraTest {

    private Insecto insecto;

    class InsectoConcreto extends Insecto {
        InsectoConcreto(String nombre, int alas, int patas, String comida) {
            super(nombre, alas, patas, comida);
        }
    }

    @BeforeEach
    void setUp() {
        insecto = new InsectoConcreto("Mosca", 4, 6, "Carroña");
    }

    @Test
    void testDegradacionAlas() {
        // Inicialmente tiene 4 alas
        int numAlasOriginal = insecto.getAlas();
        DegradacionMotora.degradar(insecto, "ala");

        // Verificar que las alas hayan disminuido en 1 si la condición se cumplió
        assertTrue(insecto.getAlas() <= numAlasOriginal);
    }

    @Test
    void testDegradacionPatas() {
        // Inicialmente tiene 6 patas
        int numPatasOriginal = insecto.getPatas();
        DegradacionMotora.degradar(insecto, "pata");

        // Verificar que las patas hayan disminuido en 1 si la condición se cumplió
        assertTrue(insecto.getPatas() <= numPatasOriginal);
    }

    @Test
    void testNoPerdidaAlasSiNoCorresponde() {
        // Forzar el insecto a tener 1 alas
        while (insecto.getAlas() >= 2) {
            insecto.perderAla();
        }

        int numAlasOriginal = insecto.getAlas();
        DegradacionMotora.degradar(insecto, "ala");

        // Verificar que las alas no se redujeron más
        assertEquals(numAlasOriginal, insecto.getAlas());
    }

    @Test
    void testNoPerdidaPatasSiNoCorresponde() {
        // Forzar el insecto a tener 1 patas
        while (insecto.getPatas() >= 2) {
            insecto.perderPata();
        }

        int numPatasOriginal = insecto.getPatas();
        DegradacionMotora.degradar(insecto, "pata");

        // Verificar que las patas no se redujeron más
        assertEquals(numPatasOriginal, insecto.getPatas());
    }
}
