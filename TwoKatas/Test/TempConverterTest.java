import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TempConverterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertFtoC() {
        TempConverter tempConverter = new TempConverter();

        assertEquals(0, tempConverter.convertFtoC(32));
        assertEquals(100, tempConverter.convertFtoC(212));
        assertEquals(-40, tempConverter.convertFtoC(-40));
        assertEquals(37, tempConverter.convertFtoC(98.6));
    }

    @Test
    void convertCtoF() {
        TempConverter tempConverter = new TempConverter();

        assertEquals(32, tempConverter.convertCtoF(0));
        assertEquals(212, tempConverter.convertCtoF(100));
        assertEquals(-40, tempConverter.convertCtoF(-40));
        assertEquals(98.6, tempConverter.convertCtoF(37));
    }
}