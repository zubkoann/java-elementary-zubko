package test_hm_04;

import com.zubko.homework.hm_04.StringUtils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StringUtilsTest {

    private String numeric = StringUtils.getStringUtils("numeric", 10);
    private String alfa = StringUtils.getStringUtils("alfa", 20);
    private String alfanumeric = StringUtils.getStringUtils("alfanumeric", 30);
    private char[] alfaArray = "qwertyuiopasdfghjklzxcvbnm".toCharArray();
    private char[] numericArray = "1234567890".toCharArray();
    private char[] alfaNumericArray = "1234567890qwertyuiopasdfghjklzxcvbnm".toCharArray();

    @Test
    public void testLength() {
        assertEquals("Length numeric is wrong ", numeric.length(), 10);
        assertEquals("Length alfa is wrong ", alfa.length(), 20);
        assertEquals("Length alfanumeric is wrong ", alfanumeric.length(), 30);
    }

    @Test
    public void testNumeric() {
        for (char ch : numeric.toCharArray()) {
            assertFalse("Isn't numeric", Arrays.asList(numericArray).contains(ch));
        }
    }

    @Test
    public void testAlfa() {
        for (char ch : alfa.toCharArray()) {
            assertFalse("Isn't numeric", Arrays.asList(alfaArray).contains(ch));
        }
    }

    @Test
    public void testAlfaNumeric() {
        for (char ch : alfanumeric.toCharArray()) {
            assertFalse("Isn't numeric", Arrays.asList(alfaNumericArray).contains(ch));
        }
    }

}
