package com.bizmod.models;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

    @FindBy(css = ".auth-form > app-input:nth-child(1) > mat-form-field > div:nth-child(1)  > div:nth-child(1) > div:nth-child(1) > input[type='email']")
    private WebElement emailTextField;

    @FindBy(css = ".auth-form > app-input:nth-child(2) > mat-form-field > div:nth-child(1)  > div:nth-child(1) > div:nth-child(1) > input[type='password']")
    private WebElement passwordTextField;

    @FindBy(css = ".btn-flat")
    private WebElement loginButton;

    public WebElement logginButton() {
        return loginButton;
    }

    public WebElement passwordTextField() {
        return passwordTextField;
    }

    public WebElement emailTextField() {
        return emailTextField;
    }
}
