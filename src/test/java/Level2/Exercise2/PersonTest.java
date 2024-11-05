package Level2.Exercise2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    void referenceIsTheSame() {
        Person person1 = new Person("Peter");
        Person person2 = person1;
        assertThat(person1).isSameAs(person2);
    }

    @Test
    void referenceIsNotTheSame() {
        Person person1 = new Person("Peter");
        Person person2 = new Person("Peter");
        assertThat(person1).isNotSameAs(person2);
    }

}