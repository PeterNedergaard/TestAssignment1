import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeralConverterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void ConvertArabToRomaOneDigit() {
        NumeralConverter numeralConverter = new NumeralConverter();

        assertEquals("I", numeralConverter.ConvertArabToRoma(1));
        assertEquals("II", numeralConverter.ConvertArabToRoma(2));
        assertEquals("III", numeralConverter.ConvertArabToRoma(3));
        assertEquals("IV", numeralConverter.ConvertArabToRoma(4));
        assertEquals("V", numeralConverter.ConvertArabToRoma(5));
        assertEquals("VI", numeralConverter.ConvertArabToRoma(6));
        assertEquals("VII", numeralConverter.ConvertArabToRoma(7));
        assertEquals("VIII", numeralConverter.ConvertArabToRoma(8));
        assertEquals("IX", numeralConverter.ConvertArabToRoma(9));
    }

    void ConvertArabToRomaTwoDigits() {
        NumeralConverter numeralConverter = new NumeralConverter();

        assertEquals("X", numeralConverter.ConvertArabToRoma(10));
        assertEquals("XXXIX", numeralConverter.ConvertArabToRoma(39));
        assertEquals("XCIX", numeralConverter.ConvertArabToRoma(99));
        assertEquals("XI", numeralConverter.ConvertArabToRoma(11));
        assertEquals("XLIX", numeralConverter.ConvertArabToRoma(49));
        assertEquals("XL", numeralConverter.ConvertArabToRoma(40));
        assertEquals("L", numeralConverter.ConvertArabToRoma(50));
        assertEquals("LXXIV", numeralConverter.ConvertArabToRoma(74));
    }

    void ConvertArabToRomaThreeDigits() {
        NumeralConverter numeralConverter = new NumeralConverter();

        assertEquals("CCXLVI", numeralConverter.ConvertArabToRoma(246));
        assertEquals("DCCLXXXIX", numeralConverter.ConvertArabToRoma(789));
        assertEquals("CMXCIX", numeralConverter.ConvertArabToRoma(999));
        assertEquals("C", numeralConverter.ConvertArabToRoma(100));
        assertEquals("CCCXLIX", numeralConverter.ConvertArabToRoma(349));
        assertEquals("DCLXXXI", numeralConverter.ConvertArabToRoma(681));
        assertEquals("DLXXXI", numeralConverter.ConvertArabToRoma(581));
        assertEquals("D", numeralConverter.ConvertArabToRoma(500));
        assertEquals("CD", numeralConverter.ConvertArabToRoma(400));
    }

    void ConvertArabToRomaFourDigit() {
        NumeralConverter numeralConverter = new NumeralConverter();

        assertEquals("MMCDXXI", numeralConverter.ConvertArabToRoma(2421));
        assertEquals("MMMDCCCLXXXVIII", numeralConverter.ConvertArabToRoma(3888));
        assertEquals("MMMCMXCIX", numeralConverter.ConvertArabToRoma(3999));
        assertEquals("MCCXXXIV", numeralConverter.ConvertArabToRoma(1234));
        assertEquals("MMCMXXXVI", numeralConverter.ConvertArabToRoma(2936));
        assertEquals("MMCMIX", numeralConverter.ConvertArabToRoma(2909));
        assertEquals("MDCCCLXXII", numeralConverter.ConvertArabToRoma(1872));
    }
}