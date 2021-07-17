package string_calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("정상적인 테스트")
    void 정상적인_테스트() {
        Calculator calculator = new Calculator(new Expression("2 + 3 * 4 / 2"));
        int result = calculator.calculate();
        assertThat(result).isEqualTo(10);
    }

    @Test
    @DisplayName("DIVIDE 연산 시 밑이 0일 때 예외 테스트")
    void 밑이_0일때_예외_테스트() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            Calculator calculator = new Calculator(new Expression("2 + 3 * 4 / 0"));
            int result = calculator.calculate();
            assertThat(result).isEqualTo(10);
        });
    }

    @Test
    @DisplayName("입력 값이 null이나 빈 공백일 경우 예외 테스트")
    void null_공백_예외_테스트() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            Calculator calculator = new Calculator(new Expression("2 +  * 4 / 0"));
            int result = calculator.calculate();
            assertThat(result).isEqualTo(10);
        });
    }

    @Test
    @DisplayName("사칙 연산 기호가 아닌 경우 예외 테스트")
    void 사칙_연산_기호_예외_테스트() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            Calculator calculator = new Calculator(new Expression("2  3 * 4 / 0"));
            int result = calculator.calculate();
            assertThat(result).isEqualTo(10);
        });
    }
}