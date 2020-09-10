package com.company.abstractFactory;

public class Main {
    public static void main(String[] args) {
        FormAbstractFactory factory = new JavaFactory();
        WebForm webForm = factory.createWebForm();
        webForm.show();
    }
}
