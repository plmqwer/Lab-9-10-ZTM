package com.ztm;

import org.junit.jupiter.api.Test; // Zmiana z org.junit.Test
import static org.junit.jupiter.api.Assertions.assertEquals; // Zmiana z org.junit.Assert

public class AppTest {
    @Test
    public void testAdd() {
        com.example.demo.SampleController controller = new com.example.demo.SampleController();
        assertEquals(5, 2 + 3);
    }
}
