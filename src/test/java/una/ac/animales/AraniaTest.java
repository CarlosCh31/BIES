package una.ac.animales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AraniaTest {

    private Arania arania;

    @BeforeEach
    void setUp() {
        arania = new Arania();
    }

    @Test
    void testInicializacionArania() {
        assertEquals("Araña", arania.getNombre());
        assertEquals(0, arania.getAlas());
        assertEquals(8, arania.getPatas());
        assertEquals("hongos", arania.comida);
    }

    @Test
    void testCaminarConPatasSuficientes() {
        // Verificar que puede caminar con patas suficientes
        assertDoesNotThrow(() -> arania.caminar());
        assertTrue(arania.getPatas() <= 8 && arania.getPatas() >= 0);
    }

    @Test
    void testNoCaminarSinPatasSuficientes() {
        // Reducir el número de patas a menos de 2 para forzar la condición
        while (arania.getPatas() > 1) {
            arania.perderPata();
        }

        // Ahora debe tener 1 pata o menos, lo que debe impedir que camine
        arania.caminar();
        assertEquals(1, arania.getPatas());  // Debe permanecer en 1 pata
    }

    @Test
    void testDegradacionMotoraAlCaminar() {
        // Caminar y verificar que las patas puedan degradarse
        int patasOriginales = arania.getPatas();
        arania.caminar();
        assertTrue(arania.getPatas() <= patasOriginales);
    }
}
