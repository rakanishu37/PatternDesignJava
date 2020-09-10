package com.company.factoryMethod;

public class PdfFactory implements DocumentFactory{
    @Override
    public Document createDocument(String name) {
        return new Pdf(name);
    }
}
