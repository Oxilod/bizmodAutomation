package com.bizmod.models.actions;

import com.bizmod.models.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginActions {
    private Login login;

    public LoginActions(WebDriver driver) {
        login = PageFactory.initElements(driver, Login.class);
    }

    public void login(String email, String password) {
        login.emailTextField().sendKeys(email);
        login.passwordTextField().sendKeys(password);
        login.logginButton().click();
    }
}
