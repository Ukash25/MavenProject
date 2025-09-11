package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void additionTest() {
        assertEquals(5, 2 + 3, "2 + 3 should equal 5");
    }

    @Test
    public void multiplicationTest() {
        assertEquals(20, 4 * 5, "4 * 5 should equal 20");
    }
}
