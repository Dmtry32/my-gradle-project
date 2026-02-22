package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyLibraryTest {
    @Test
    public void testGreet() {
        assertEquals("Hello, World!", MyLibrary.greet("World"));
    }
}