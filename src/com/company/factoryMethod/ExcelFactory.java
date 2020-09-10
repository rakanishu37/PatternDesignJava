package com.company.factoryMethod;

public class ExcelFactory implements DocumentFactory{
    @Override
    public Document createDocument(String name) {
        return new Excel(name);
    }
}
