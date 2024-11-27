package Level2.Exercise2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    private Person person1;

    @BeforeEach
    public void setup() {
        person1 = new Person("Peter");
    }

    @Test
    void referenceIsTheSame() {
        Person person2 = person1;
        assertThat(person1).isSameAs(person2);
    }

    @Test
    void referenceIsNotTheSame() {
        Person person2 = new Person("Peter");
        assertThat(person1).isNotSameAs(person2);
    }
}