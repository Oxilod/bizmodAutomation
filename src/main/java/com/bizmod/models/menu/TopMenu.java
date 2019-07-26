package com.bizmod.models.menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenu {

    @FindBy(css = ".nav-wrapper > ul[id='nav-mobile'] > li:nth-child(1) > a[href='/app/companies']")
    private WebElement companiesButton;

    @FindBy(css = ".nav-wrapper > ul[id='nav-mobile'] > li:nth-child(2) > a[href='/app/projects'] ")
    private WebElement projectsButton;

    @FindBy(css = ".nav-wrapper > ul[id='nav-mobile'] > li:nth-child(3) > a[href='/app/demo'] ")
    private WebElement demoButton;

    @FindBy(css = ".nav-wrapper > ul[id='nav-mobile'] > li:nth-child(4) > a[activates='user-info-dropdown'] ")
    private WebElement profileButton;

    public WebElement companiesButton() {
        return companiesButton;
    }

    public WebElement projectsButton() {
        return projectsButton;
    }

    public WebElement demoButton() {
        return demoButton;
    }

    public WebElement profileButton() {
        return profileButton;
    }

}
