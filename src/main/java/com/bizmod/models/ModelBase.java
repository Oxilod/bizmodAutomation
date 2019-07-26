package com.bizmod.models;

import com.bizmod.models.actions.LoginActions;
import com.bizmod.models.menu.TopMenu;
import com.bizmod.models.pages.Companies;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ModelBase {

    private Main main;
    private Login login;
    private TopMenu topMenu;
    private Companies companies;
    private LoginActions loginActions;

    public ModelBase(WebDriver driver) {
        main = PageFactory.initElements(driver, Main.class);
        login = PageFactory.initElements(driver, Login.class);
        topMenu = PageFactory.initElements(driver, TopMenu.class);
        companies = PageFactory.initElements(driver, Companies.class);
        loginActions = PageFactory.initElements(driver, LoginActions.class);
    }

    public Main mainPage() {
        return main;
    }

    public Login loginPage() {
        return login;
    }

    public TopMenu topMenu() {
        return topMenu;
    }

    public Companies companies() {
        return companies;
    }

    public LoginActions loginActions() {
        return loginActions;
    }
}
