package com.company.strategy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Bow extends Weapon{
    private static final Logger LOGGER = Logger.getLogger("com.company.strategy.Bow");
    @Override
    public void attack() {
        String message = String.format("Im attacking with my bow");
        LOGGER.log(Level.INFO, message);
    }

    @Override
    public void defend() {
        String message = String.format("I can't defend with my bow");
        LOGGER.log(Level.INFO, message);
    }
}
