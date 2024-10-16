package com.vladproduction.unnamed_patterns_variables;

import java.util.List;

public record Manager(int id, List<DirectReport> directReports) implements Employee{
}
