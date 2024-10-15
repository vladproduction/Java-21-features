package com.vladproduction.string_templates;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ThermometerTest {

    @Test
    public void getTemperatureTestValid() {
        var thermometer = new Thermometer();
        thermometer.getTemperature(25.5);
        assertEquals("Temperature is: 25.50", thermometer.getTemperature(25.5));
    }

    @Test
    public void getTemperatureTestNotValid() {
        var thermometer = new Thermometer();
        thermometer.getTemperature(25.5);
        assertNotEquals("Temperature is: 25", thermometer.getTemperature(25.5));
    }
}