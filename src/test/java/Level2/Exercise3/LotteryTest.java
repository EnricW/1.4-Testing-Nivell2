package Level2.Exercise3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LotteryTest {

    @Test
    void arraysAreIdentical() {
        int[] myNumbersArray = {4, 8, 15, 16, 23, 42};
        int[] winningNumbersArray = {4, 8, 15, 16, 23, 42};

        Lottery myNumbers = new Lottery(myNumbersArray);
        Lottery winningNumbers = new Lottery(winningNumbersArray);

        assertThat(myNumbers.getNumbers())
                .isEqualTo(winningNumbers.getNumbers());
    }

}