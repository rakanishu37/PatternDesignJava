package com.company.strategy;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Character {
    private static final Logger LOGGER = Logger.getLogger("com.company.strategy.Character");
    private Weapon currentWeapon;
    private CharacterType type;

    public Character(CharacterType type, Weapon currentWeapon) {
        this.type = type;
        this.currentWeapon = currentWeapon;
    }

    public void move(Direction direction, Integer speed) {
        String message = String.format("Im walking to the %s walking at %d km per hour",direction.name(),speed);
        LOGGER.log(Level.INFO, message);
    }

    public void salute() {
        String message = String.format("Hello i'm a %s", type.name());
        //LOGGER.log(Level.INFO, message);
        System.out.println(message);
    }

    public void attack() {
        currentWeapon.attack();
    }

    public void defend() {
        currentWeapon.defend();
    }

    public void changeWeapon(Weapon weapon) {
        currentWeapon = weapon;
    }
}
