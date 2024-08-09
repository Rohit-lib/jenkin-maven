package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void shouldPrintMessage() {
        App.main(new String[]{});
        assertTrue(true); // Dummy test, just to invoke main
    }
}
