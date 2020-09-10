package com.company.abstractFactory;

public class JavaFactory implements FormAbstractFactory {
    @Override
    public DesktopForm createDesktopForm() {
        return new JavaForm();
    }

    @Override
    public WebForm createWebForm() {
        return new JspForm();
    }
}
