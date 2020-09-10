package com.company.abstractFactory;

public class AspForm implements WebForm{
    @Override
    public void show() {
        System.out.println("Look at me, i'm an asp form");
    }

    @Override
    public void timeout() {
        System.out.println("Your time's finished lil' window");
    }
}
