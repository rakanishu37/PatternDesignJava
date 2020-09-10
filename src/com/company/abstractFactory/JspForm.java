package com.company.abstractFactory;

public class JspForm implements WebForm{
    @Override
    public void show() {
        System.out.println("I'm a jsp form");
    }

    @Override
    public void timeout() {
        System.out.println("That's it java boy, time to get out");
    }
}
