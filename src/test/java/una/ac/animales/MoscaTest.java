package una.ac.animales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoscaTest {

    private Mosca mosca;

    @BeforeEach
    void setUp() {
        mosca = new Mosca();
    }

    @Test
    void testInicializacionMosca() {
        assertEquals("Mosca", mosca.getNombre());
        assertEquals(2, mosca.getAlas());
        assertEquals(2, mosca.getPatas());
        assertEquals("carroña", mosca.comida);
    }

    @Test
    void testVolarConAlasSuficientes() {
        // Verificar que puede volar con alas suficientes
        assertDoesNotThrow(() -> mosca.volar());
        assertTrue(mosca.getAlas() <= 2 && mosca.getAlas() >= 0);
    }

    @Test
    void testNoVolarSinAlasSuficientes() {
        // Reducir el número de alas a menos de 2 para forzar la condición
        mosca.perderAla();
        mosca.volar();

        // Ahora debe tener 1 ala, lo que debe impedir que vuele
        assertEquals(1, mosca.getAlas());
    }

    @Test
    void testCaminarConPatasSuficientes() {
        // Verificar que puede caminar con patas suficientes
        assertDoesNotThrow(() -> mosca.caminar());
        assertTrue(mosca.getPatas() <= 2 && mosca.getPatas() >= 0);
    }

    @Test
    void testNoCaminarSinPatasSuficientes() {
        // Reducir el número de patas a menos de 2 para forzar la condición
        mosca.perderPata();
        mosca.caminar();

        // Ahora debe tener 1 pata, lo que debe impedir que camine
        assertEquals(1, mosca.getPatas());
    }

    @Test
    void testDegradacionMotoraAlVolar() {
        // Volar y verificar que las alas puedan degradarse
        int alasOriginales = mosca.getAlas();
        mosca.volar();
        assertTrue(mosca.getAlas() <= alasOriginales);
    }

    @Test
    void testDegradacionMotoraAlCaminar() {
        // Caminar y verificar que las patas puedan degradarse
        int patasOriginales = mosca.getPatas();
        mosca.caminar();
        assertTrue(mosca.getPatas() <= patasOriginales);
    }
}
