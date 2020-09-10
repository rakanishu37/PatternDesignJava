package com.company.factoryMethod;

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new WordFactory();
        Document document = factory.createDocument("plans");
        document.open();
        document.close();
    }
}
