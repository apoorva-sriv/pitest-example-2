package org.example;

public class Example {
    int num = 6;

    // Singleton pattern
    private static final Example INSTANCE = new Example();
    private Example() {};
    public static Example getInstance() {
        // return new Example();     // PIT works correctly (reports mutants as KILLED) when you use this line.
        return INSTANCE;             // PIT works incorrectly (reports mutants as SURVIVED) when you use this line.
    }

    public boolean isMember6() {
        return 6 == num;
    }
}