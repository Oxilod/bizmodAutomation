package com.bizmod.models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Main {

    @FindBy(css = "li.desktop-navigation__item:nth-child(4) > a:nth-child(1)")
    private WebElement appButton;

    public WebElement appButton() {
        return appButton;
    }
}
