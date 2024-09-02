package una.ac.animales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InnombrableTest {

    private Innombrable innombrable;

    @BeforeEach
    void setUp() {
        innombrable = new Innombrable();
    }

    @Test
    void testAlimentarse() {
        // Verificar que el método alimentarse se ejecuta sin problemas
        assertDoesNotThrow(() -> innombrable.alimentarse());
    }

    @Test
    void testVolar() {
        // Verificar que el método volar se ejecuta sin problemas
        assertDoesNotThrow(() -> innombrable.volar());
    }

    @Test
    void testCaminar() {
        // Verificar que el método caminar se ejecuta sin problemas
        assertDoesNotThrow(() -> innombrable.caminar());
    }
}
