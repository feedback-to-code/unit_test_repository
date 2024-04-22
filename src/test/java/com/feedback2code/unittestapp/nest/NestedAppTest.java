package com.feedback2code.unittestapp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NestedAppTest 
{
    /**
     * This test is not inside test/java/com/feedback2code/unittestapp.
     * It is in test/java/com/feedback2code/unittestapp/nest.
     * Still the maven output will only say "com.feedback2code.unittestapp.NestedAppTest" instead of "com.feedback2code.unittestapp.nest.NestedAppTest".
     */
    @Test
    public void assertThatAppIsTestable()
    {
        assertTrue(App.getTestableVariable());
    }
}
