package com.company.factoryMethod;

public class Excel extends Document{
    public Excel(String name) {
        super(name+".exel");
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
