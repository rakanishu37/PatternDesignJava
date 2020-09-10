package com.company.factoryMethod;

public abstract class Document {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void open();
    abstract void close();
    abstract void save();
}