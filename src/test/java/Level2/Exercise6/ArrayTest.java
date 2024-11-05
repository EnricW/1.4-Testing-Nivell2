package Level2.Exercise6;

import Level2.Exercise3.Lottery;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class ArrayTest {
    @Test
    void testArrayIndexOutOfBoundsException() {
        int[] winningNumbersArray = {4, 8, 15, 16, 23, 42};

        Lottery winningNumbers = new Lottery(winningNumbersArray);

        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class)
                .isThrownBy(() -> winningNumbers.getNumberAtPosition(8));
    }
}
