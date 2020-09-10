package com.company.factoryMethod;

public class WordFactory implements DocumentFactory{
    @Override
    public Document createDocument(String name) {
        return new Word(name);
    }
}
