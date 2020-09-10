package com.company.strategy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sword extends Weapon{
    private static final Logger LOGGER = Logger.getLogger("com.company.strategy.Sword");
    @Override
    public void attack() {
        String message = String.format("Im attacking with my sword");
        LOGGER.log(Level.INFO, message);
    }

    @Override
    public void defend() {
        String message = String.format("Im defending with my sword");
        LOGGER.log(Level.INFO, message);
    }

    public static class Main {

        public static void main(String[] args) {
        // write your code here
        }
    }
}
