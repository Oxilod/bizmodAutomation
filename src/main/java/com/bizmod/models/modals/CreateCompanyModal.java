package com.bizmod.models.modals;

import com.bizmod.models.enums.CompanyType;
import com.bizmod.models.enums.Countries;
import com.bizmod.models.enums.Currency;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.pagefactory.ByChained;

public class CreateCompanyModal {

    @FindBy(className = "modalBody")
    private WebElement modalSelfLocator;

    @FindBy(css = "input[placeholder='Company name']")
    private WebElement companyNameTextBox;

    @FindBy(css = "input[placeholder='Company motto']")
    private WebElement companyMottoTextBox;

    @FindBy(css = "app-dropdown-autocomplete > div.input-field > p-autocomplete > span > input[type='text']")
    private WebElement countryTextBox;

    @FindBy(css = "app-textarea > mat-form-field.app-textarea > div:nth-child(1) > div:nth-child(1) div:nth-child(1) > textarea")
    private WebElement descriptionTextBox;

    @FindBy(css = ".modal-footer > div:nth-child(1) > button.next")
    private WebElement nextButton;

    @FindBys({
            @FindBy(css = "app-company-fiscal-data-form > .fiscal-container"),
            @FindBy(css = "mat-form-field > div input[placeholder = 'Company fiscal name']")
    })
    private WebElement fiscalNameTextBox;

    @FindBy(css = "input[placeholder = 'Founding date']")
    private WebElement foundingDateLocator;

    @FindBys({
            @FindBy(css = "app-company-fiscal-data-form > .fiscal-container"),
            @FindBy(className = "row"),
            @FindBy(css = "p-autocomplete > span > input")
    })
    private WebElement currencyTextBox;

    @FindBys({
            @FindBy(css = "app-company-fiscal-data-form > .fiscal-container"),
            @FindBy(css = "mat-form-field > div input[placeholder='Company Id']")
    })
    private WebElement companyIdTextBox;

    @FindBys({
            @FindBy(css = "app-company-fiscal-data-form > .fiscal-container"),
            @FindBy(css = "mat-form-field > div input[placeholder='Company registration number']")
    })
    private WebElement registrationNumTextBox;

    @FindBys({
            @FindBy(css = "app-company-fiscal-data-form > .fiscal-container"),
            @FindBy(css = "mat-form-field > div input[placeholder='Bank']")
    })
    private WebElement bankTextBox;

    @FindBys({
            @FindBy(css = "app-company-fiscal-data-form > .fiscal-container"),
            @FindBy(css = "mat-form-field > div input[placeholder='IBAN']")
    })
    private WebElement ibanTextBox;

    @FindBys({
            @FindBy(css = "app-company-fiscal-data-form > .fiscal-container"),
            @FindBy(css = "mat-form-field > div input[placeholder='Company HQ']")
    })
    private WebElement companyHqTextBox;

    @FindBys({
            @FindBy(css = "app-company-fiscal-data-form > .fiscal-container"),
            @FindBy(className = "right"),
            @FindBy(css = "p-autocomplete > span > input")
    })
    private WebElement companyTypeTextBox;

    @FindBy(css = ".waves-effect > i:nth-child(1)")
    private WebElement addAsociateButton;

    private WebElement nthAssociateRange;

    public WebElement companyName() {
        return companyNameTextBox;
    }

    public WebElement companyMotto() {
        return companyMottoTextBox;
    }

    public void setCountry(Countries country) {
        countryTextBox.sendKeys(country.toString());
    }

    public WebElement description() {
        return descriptionTextBox;
    }

    public WebElement fiscalName() {
        return fiscalNameTextBox;
    }


    public void nextButton() {
        nextButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void saveButton() {
        nextButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setcurrency(Currency currency) {
        currencyTextBox.sendKeys(currency.toString());
    }

    public WebElement companyId() {
        return companyIdTextBox;
    }

    public WebElement registrationNum() {
        return registrationNumTextBox;
    }

    public WebElement bank() {
        return bankTextBox;
    }

    public WebElement iban() {
        return ibanTextBox;
    }

    public WebElement companyHq() {
        return companyHqTextBox;
    }

    public void setCompanyType(CompanyType companyType) {
        companyTypeTextBox.sendKeys(companyType.toString());
    }

    public void addAsociate() {
        addAsociateButton.click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private By getNthAssociate(int associatePosition) {
        return By.cssSelector(String.format("app-company-associates-list > div:nth-child(%s)", associatePosition));
    }
//    By.cssSelector("app-company-associate > div > app-range > div > input")

    public By getNthAssociateInput(int associatePosition) {
        return new ByChained(getNthAssociate(associatePosition),
                By.cssSelector("app-company-associate > div > app-range > div > input"));
    }

    public By getNthAssociatePercentage(int associatePosition) {
        return By.cssSelector(String.format("app-company-associates-list > div:nth-child(1) > app-company-associate > div > app-range > div > span > .value", associatePosition));
    }
}
