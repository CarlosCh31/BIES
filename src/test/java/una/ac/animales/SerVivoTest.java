package una.ac.animales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class SerVivoTest {

    static class SerVivoConcreto extends SerVivo {
        @Override
        void alimentarse() {
            System.out.println("El ser vivo se está alimentando.");
        }
    }

    @Test
    void testAlimentarse() {
        SerVivo serVivo = new SerVivoConcreto();
        assertDoesNotThrow(serVivo::alimentarse);
    }
}
