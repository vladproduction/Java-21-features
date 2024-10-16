package com.vladproduction.unnamed_patterns_variables;

import java.util.List;

public class MainRegister {
    public static void main(String[] args) {
        var directReport1 = new DirectReport(1);
        var directReport2 = new DirectReport(2);
        var manager = new Manager(3, List.of(directReport1, directReport2));
        printDirectReportsBefore(manager);
        System.out.println("\n---after refactoring (expected the same)---");
        printDirectReportsJava21Refactored(manager);
    }

    //before refactoring:
    public static void printDirectReportsBefore(Employee employee) {
        if (employee instanceof Manager manager) {
            var directReports = manager.directReports();
            System.out.println("Direct reports: " + directReports);
        } else {
            throw new IllegalArgumentException("Employee is not a manager");
        }
    }

    //java 21 feature refactoring:
    public static void printDirectReportsJava21Refactored(Employee employee) {
        if (employee instanceof Manager(_, var directReports)) {
            System.out.println(STR."Direct reports: \{directReports}");
        } else {
            throw new IllegalArgumentException("Employee is not a manager");
        }
    }

}
