package string_calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    @DisplayName("문자열 테스트")
    void stringTest() {
        String value = "2 + 3 * 4 / 2";
        String[] values = Input.splitStringValues(value);

        int result = Calculator.calculate(values);

        assertEquals(10, result);
    }
}