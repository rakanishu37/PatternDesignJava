package com.company.abstractFactory;

public class JavaForm implements DesktopForm {
    @Override
    public void show() {
        System.out.println("I'm a java form");
    }

    @Override
    public void isModal() {
        System.out.println("What's a modal?");
    }
}
