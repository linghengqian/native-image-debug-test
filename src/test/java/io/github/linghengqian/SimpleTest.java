package io.github.linghengqian;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    void test() {
        Integer first = 1;
        Integer second = 2;
        Integer third = first + second;
        assertEquals(3, third);
    }
}
