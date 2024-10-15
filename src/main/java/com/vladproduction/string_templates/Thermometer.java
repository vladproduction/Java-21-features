package com.vladproduction.string_templates;

import static java.util.FormatProcessor.FMT;

public class Thermometer {

    public String getTemperature(double temperature){
        return FMT."Temperature is: %.2f\{temperature}";

    }

}
