package Level2.Exercise5;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class MapTest {

    @Test
    void hasKey() {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(1, "John");
        employees.put(2, "Jane");
        employees.put(3, "Jack");

        assertThat(employees.containsKey(2)).isTrue();
    }
}
