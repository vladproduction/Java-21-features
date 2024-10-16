package com.vladproduction.switch_matching_pattern;

public class MainLoggerApp {

    public String getLoggerType(Logger logger) {
        switch (logger) {
            case FileLogger fileLogger -> {
                System.out.println("Logger type is file");
                return fileLogger.getLoggerType();
            }
            case ConsoleLogger consoleLogger -> {
                System.out.println("Logger type is console");
                return consoleLogger.getLoggerType();
            }
            default -> throw new IllegalArgumentException("Type of logger is not define.");
        }
    }

}
