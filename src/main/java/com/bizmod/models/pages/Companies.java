package com.bizmod.models.pages;

import com.bizmod.models.modals.CreateCompanyModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Companies {

    private CreateCompanyModal createCompanyModal;

    @FindBy(css = ".fab-container > div:nth-child(1) > a.btn-floating")
    private WebElement addButton;

    public Companies(WebDriver driver) {
        createCompanyModal = PageFactory.initElements(driver, CreateCompanyModal.class);
    }

    public WebElement addButton() {
        return addButton;
    }

    public CreateCompanyModal createCompany() {
        return createCompanyModal;
    }
}
