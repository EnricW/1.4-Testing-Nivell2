package Level2.Exercise4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AnimalTest {

    @Test
    void animalListTest(){
        Animal hamster1 = new Hamster("Gus");
        Animal rabbit1 = new Rabbit("Fluffy");
        Animal hamster2 = new Hamster("Bob");
        Animal rabbit2 = new Rabbit("Bunny");

        List<Animal> animals = new ArrayList<>();
        animals.add(hamster1);
        animals.add(rabbit1);
        animals.add(hamster2);

        assertThat(animals).containsExactly(hamster1, rabbit1, hamster2);
        assertThat(animals).contains(hamster1, hamster2, rabbit1);
        assertThat(animals).containsOnlyOnce(rabbit1);
        assertThat(animals).doesNotContain(rabbit2);
    }
}