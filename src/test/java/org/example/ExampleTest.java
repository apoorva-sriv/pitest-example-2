package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class ExampleTest {

    @Test
    public void memberShouldEqual6() {
        assertTrue(Example.getInstance().isMember6());
    }
}