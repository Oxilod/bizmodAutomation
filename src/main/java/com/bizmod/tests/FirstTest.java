package com.bizmod.tests;

import com.bizmod.models.ModelBase;
import com.bizmod.models.enums.CompanyType;
import com.bizmod.models.enums.Countries;
import com.bizmod.models.enums.Currency;
import com.bizmod.models.modals.CreateCompanyModal;
import com.sun.org.glassfish.gmbal.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest extends TestParent {

    private ModelBase model;
    private CreateCompanyModal createCompany;

    @BeforeClass
    private void setup() {
//        Initialize models
        model = new ModelBase(driver);
        createCompany = model.companies().createCompany();
//        Login and Navigate to the Companies Page
        model.mainPage().appButton().click();
        model.loginActions().login("insert_username", "insert_password");
        model.topMenu().companiesButton().click();
    }

    @Test
    @Description("Test Description")
    public void createCompanyTest() {
        model.companies().addButton().click();
//        Step one of the form
        createCompany.companyName().sendKeys("My Custom Company Name");
        createCompany.companyMotto().sendKeys("Work hard play harder");
        createCompany.setCountry(Countries.Romania);
        createCompany.description().sendKeys("Company Description");
        createCompany.nextButton();
//        Step two of the form
        createCompany.fiscalName().sendKeys("MyCompany S.R.L");
        createCompany.setcurrency(Currency.EUR);
        createCompany.registrationNum().sendKeys("54687459");
        createCompany.companyId().sendKeys("548570601");
        createCompany.companyHq().sendKeys("Provo, Utah");
        createCompany.bank().sendKeys("ING");
        createCompany.iban().sendKeys("GB33BUKB20201555555555");
        createCompany.setCompanyType(CompanyType.SRLD);
        createCompany.nextButton();
//        Step three of the form
        createCompany.addAsociate();
        createCompany.saveButton();
    }
}
