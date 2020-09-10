package com.company.factoryMethod;

public class Word extends Document{
    public Word(String name) {
        super(name+".word");
    }

    @Override
    void open() {
        System.out.println("Opening "+ getName());
    }

    @Override
    void close() {
        System.out.println("Closing "+ getName());
    }

    @Override
    void save() {
        System.out.println("Saving "+ getName());
    }
}
