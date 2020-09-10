package com.company.abstractFactory;

public class WinForm implements DesktopForm {
    @Override
    public void show() {
        System.out.println("I'm a windows form");
    }

    @Override
    public void isModal() {
        System.out.println("I think i know what's a modal");
    }
}
