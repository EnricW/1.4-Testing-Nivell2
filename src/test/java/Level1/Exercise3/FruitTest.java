package Level1.Exercise3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FruitTest {
    @Test
    public void testArrayIndexOutOfBoundsException() {
        Fruit fruit = new Fruit();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            fruit.getFruitAtIndex(5);
        });
    }
}