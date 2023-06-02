package ru.job4j.ex;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactTest {
    @Test
    public void whenFactException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Fact.factorial(-1);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("N could not be less than 0");
    }

    @Test
    public void whenNotFactException() {
        int n = 5;
        int rsl = Fact.factorial(n);
        int excepted = 120;
        assertThat(rsl).isEqualTo(excepted);
    }
}