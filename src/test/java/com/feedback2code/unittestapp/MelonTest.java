package com.feedback2code.unittestapp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for finding melon.
 */
public class MelonTest 
{
    @Test
    public void herrMeloneShouldHaveHisHat()
    {
        assertTrue(HerrMelone.hasHat());
    }
}
