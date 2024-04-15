package com.feedback2code.unittestapp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for finding melon.
 */
public class MelonManTest 
{
    @Test
    public void herrMeloneShouldHaveHisHat()
    {
        MelonMan herrMelone = new MelonMan();
        herrMelone.findHat("./");
        assertTrue(herrMelone.hasHat());
    }
}
