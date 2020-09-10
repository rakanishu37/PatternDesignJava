package com.company.strategy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Axe extends Weapon{
    private static final Logger LOGGER = Logger.getLogger("com.company.strategy.Axe");
    @Override
    public void attack() {
        String message = String.format("Im attacking with my axe");
        LOGGER.log(Level.INFO, message);
    }

    @Override
    public void defend() {
        String message = String.format("I can't defend with my axe");
        LOGGER.log(Level.INFO, message);
    }
}
