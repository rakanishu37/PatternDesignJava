package com.company.strategy;

public class Main {
    public static void main(String[] args) {
        Character gladiator = new Character(CharacterType.GLADIATOR, new Sword());
        gladiator.salute();
        gladiator.move(Direction.SOUTH,3);
        gladiator.attack();
        gladiator.changeWeapon(new Axe());
        gladiator.attack();
        gladiator.defend();
    }
}
