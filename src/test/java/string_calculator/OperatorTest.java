package string_calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class OperatorTest {

    @Test
    @DisplayName("PLUS 연산 테스트")
    void PLUS_연산_테스트() {
        int result = Operator.PLUS.operate(1, 5);
        assertThat(result).isEqualTo(6);
    }

    @Test
    @DisplayName("MINUS 연산 테스트")
    void MINUS_연산_테스트() {
        int result = Operator.MINUS.operate(5, 1);
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("MULTIPLY 연산 테스트")
    void MULTIPLY_연산_테스트() {
        int result = Operator.MULTIPLY.operate(1, 5);
        assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("DIVIDE 연산 테스트")
    void DIVIDE_연산_테스트() {
        int result = Operator.DIVIDE.operate(5, 1);
        assertThat(result).isEqualTo(5);
    }

    @ParameterizedTest
    @DisplayName("전체 연산 테스트")
    @CsvSource(value = {"+, 12", "-, 8", "*, 20", "/, 5"}, delimiter = ',')
    void 전체_연산_테스트(String value, String result) {
        assertThat(Operator.findOperator(value).operate(10, 2)).isEqualTo(Integer.parseInt(result));
    }

}