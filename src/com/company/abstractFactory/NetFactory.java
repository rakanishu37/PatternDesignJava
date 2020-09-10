package com.company.abstractFactory;

public class NetFactory implements FormAbstractFactory {
    @Override
    public DesktopForm createDesktopForm() {
        return new WinForm();
    }

    @Override
    public WebForm createWebForm() {
        return new AspForm();
    }
}
