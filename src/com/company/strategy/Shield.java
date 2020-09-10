package com.company.strategy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Shield extends Weapon{
    private static final Logger LOGGER = Logger.getLogger("com.company.strategy.Shield");
    @Override
    public void attack() {
        String message = String.format("I can't attack with my shield");
        LOGGER.log(Level.INFO, message);
    }

    @Override
    public void defend() {
        String message = String.format("Im defending with my shield");
        LOGGER.log(Level.INFO, message);
    }
}
