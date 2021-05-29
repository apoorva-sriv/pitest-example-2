package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExampleTest {

    @Test
    public void memberShouldEqual6() {
        assertTrue(Example.getInstance().isMember6());
    }
}