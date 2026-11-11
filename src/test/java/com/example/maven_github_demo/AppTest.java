package com.example.maven_github_demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testAreaForRadiusOne() {
        assertEquals(Math.PI, App.calculateArea(1), 0.0001);
    }

    @Test
    void testAreaForRadiusFive() {
        assertEquals(78.5398, App.calculateArea(5), 0.0001);
    }

    @Test
    void testAreaForZeroRadius() {
        assertEquals(0, App.calculateArea(0), 0.0001);
    }

    @Test
    void testNegativeRadius() {
        assertThrows(IllegalArgumentException.class,
                () -> App.calculateArea(-2));
    }
}