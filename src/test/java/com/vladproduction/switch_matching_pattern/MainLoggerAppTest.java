package com.vladproduction.switch_matching_pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainLoggerAppTest {

    MainLoggerApp app;

    @BeforeEach
    void setUp() {
        app = new MainLoggerApp();
    }

    @Test
    void getFileLoggerTypeTest() {
        assertEquals("FileLogger", app.getLoggerType(new FileLogger()));
    }
    @Test
    void getConsoleLoggerTypeTest() {
        assertEquals("ConsoleLogger", app.getLoggerType(new ConsoleLogger()));
    }
    @Test
    void getUnknownLoggerTypeTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            // Call the method with unknownLogger
            app.getLoggerType(new UnknownLogger());
        });
    }

    // Mock Logger class for testing purpose
    static class UnknownLogger implements Logger {
        @Override
        public String getLoggerType() {
            return "UnknownLogger";
        }
    }
}