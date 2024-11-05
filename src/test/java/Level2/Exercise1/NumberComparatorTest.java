package Level2.Exercise1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberComparatorTest {
    @Test
    void areEqual() {
        NumberComparator numberComparator = new NumberComparator();
        assertThat(numberComparator.areEqual(1, 1)).isTrue();
    }

    @Test
    void areNotEqual() {
        NumberComparator numberComparator = new NumberComparator();
        assertThat(numberComparator.areEqual(1, 2)).isFalse();
    }

}