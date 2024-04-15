package com.feedback2code.unittestapp;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * This class represents a MelonMan.
 * A MelonMan can either wear a Melon or not wear a Melon.
 * Depends on if he finds his melon or not...
 */
public class MelonMan 
{
    private boolean hasMelonHat = false;

    public void findHat(String directory) {
        try {
            hasMelonHat = Files.exists(Paths.get(directory, "melon.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean hasHat()
    {
        return hasMelonHat;
    }
}