package com.company.factoryMethod;

public class Pdf extends Document{
    public Pdf(String name) {
        super(name+".pdf");
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
