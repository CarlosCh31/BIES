package una.ac.animales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MariposaTest {

    private Mariposa mariposa;

    @BeforeEach
    void setUp() {
        mariposa = new Mariposa();
    }

    @Test
    void testInicializacionMariposa() {
        assertEquals("Mariposa", mariposa.getNombre());
        assertEquals(2, mariposa.getAlas());
        assertEquals(0, mariposa.getPatas());
        assertEquals("miel", mariposa.comida);
    }

    @Test
    void testVolarConAlasSuficientes() {
        // Verificar que puede volar con alas suficientes
        assertDoesNotThrow(() -> mariposa.volar());
        assertTrue(mariposa.getAlas() <= 2 && mariposa.getAlas() >= 0);
    }

    @Test
    void testNoVolarSinAlasSuficientes() {
        // Reducir el número de alas a menos de 2 para forzar la condición
        mariposa.perderAla();
        mariposa.volar();

        // Ahora debe tener 1 ala, lo que debe impedir que vuele
        assertEquals(1, mariposa.getAlas());
    }

    @Test
    void testDegradacionMotoraAlVolar() {
        // Volar y verificar que las alas puedan degradarse
        int alasOriginales = mariposa.getAlas();
        mariposa.volar();
        assertTrue(mariposa.getAlas() <= alasOriginales);
    }

}
