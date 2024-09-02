package una.ac.animales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsectoTest {
    class InsectoConcreto extends Insecto {
        InsectoConcreto(String nombre, int alas, int patas, String comida) {
            super(nombre, alas, patas, comida);
        }
    }

    private InsectoConcreto insecto;

    @BeforeEach
    void setUp() {
        insecto = new InsectoConcreto("Mariposa", 4, 6, "Miel");
    }

    @Test
    void testInicializacionInsecto() {
        assertEquals("Mariposa", insecto.getNombre());
        assertEquals(4, insecto.getAlas());
        assertEquals(6, insecto.getPatas());
        assertEquals("Miel", insecto.comida);
        assertFalse(insecto.carronia);
    }

    @Test
    void testAlimentarseCuandoNoEsCarronia() {
        assertDoesNotThrow(() -> insecto.alimentarse());
    }

    @Test
    void testPerderAla() {
        insecto.perderAla();
        assertEquals(3, insecto.getAlas());
        assertFalse(insecto.carronia);
    }

    @Test
    void testPerderPata() {
        insecto.perderPata();
        assertEquals(5, insecto.getPatas());
        assertFalse(insecto.carronia);
    }

    @Test
    void testConvertirseEnCarronia() {
        insecto.perderAla(); // 3 alas
        insecto.perderAla(); // 2 alas
        insecto.perderAla(); // 1 ala
        insecto.perderPata(); // 5 patas
        insecto.perderPata(); // 4 patas
        insecto.perderPata(); // 3 patas
        insecto.perderPata(); // 2 patas
        insecto.perderPata(); // 1 pata, se convierte en carronia

        assertTrue(insecto.carronia);
    }

    @Test
    void testAlimentarseCuandoEsCarronia() {
        insecto.perderAla(); // 3 alas
        insecto.perderAla(); // 2 alas
        insecto.perderAla(); // 1 ala
        insecto.perderPata(); // 5 patas
        insecto.perderPata(); // 4 patas
        insecto.perderPata(); // 3 patas
        insecto.perderPata(); // 2 patas
        insecto.perderPata(); // 1 pata, se convierte en carronia

        assertDoesNotThrow(() -> insecto.alimentarse());
    }
}
