package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] values = "1,2".split(",");
        assertThat(values).containsExactly("1", "2");

        values = "1".split(",");
        assertThat(values).contains("1");
    }

    @Test
    void substring() {
        String value = "(1,2)";
        String result = value.substring(1, value.length() - 1);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt test")
    void charAt() {
        String value = "abc";

        assertThatThrownBy(() -> {
            value.charAt(value.length());
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");

        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> {
                    value.charAt(value.length());
                }).withMessageMatching("String index out of range: \\d+");
    }
}
