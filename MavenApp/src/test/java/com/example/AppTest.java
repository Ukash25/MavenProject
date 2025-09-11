package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void additionTest() {
        assertEquals(6, 3 + 3, "3 + 3 should equal 6");
    }

    @Test
    public void multiplicationTest() {
        assertEquals(20, 4 * 5, "4 * 5 should equal 20");
    }
}
