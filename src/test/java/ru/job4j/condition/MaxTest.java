package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMaxLeft() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}