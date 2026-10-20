package com.example.customerwelcomeapi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WelcomeControllerTest {

    WelcomeController controller = new WelcomeController();

    @Test
    void testWelcomeWithName() {
        String result = controller.welcome("Devender");

        assertEquals(
            "Welcome, Devender! Thank you for visiting our application.",
            result
        );
    }

    @Test
    void testWelcomeWithoutName() {
        String result = controller.welcome(null);

        assertEquals(
            "Welcome, Guest! Thank you for visiting our application.",
            result
        );
    }

    @Test
    void testWelcomeWithBlankName() {
        String result = controller.welcome("   ");

        assertEquals(
            "Welcome, Guest! Thank you for visiting our application.",
            result
        );
    }

    @Test
    void testHealth() {
        assertEquals("UP", controller.health());
    }
}
