package pages;

import org.openqa.selenium.By;

public class ApplicationPage {
    Basefunc basefunc;
    private final By LOAN_AMOUNT = By.xpath(".//input[contains(@class, 'loan-amount')]");
    private final By FIRST_NAME = By.xpath(".//input[@name = 'fname']");
    private final By LAST_NAME = By.xpath(".//input[@name = 'lname']");
    private final By EMAIL = By.xpath(".//input[@name = 'email']");
    private final By PHONE = By.xpath(".//input[@name = 'phone']");
    private final By STATUS = By.xpath(".//label[contains(@id, 'nf-label-class')]");
    private final By PROPERTY_VALUE = By.xpath(".//input[contains(@class, 'loan-currency-field')]");
    private final By CHECKBOX = By.xpath(".//input[@type = 'checkbox']");
    private final By APPLY = By.xpath(".//input[@value = 'Apply Now']");

    public ApplicationPage(Basefunc basefunc) {
        this.basefunc = basefunc;
    }

    public void enterLoanAmount(String amount) {
        basefunc.getElement(LOAN_AMOUNT).sendKeys(amount);
    }

    public void enterFirstName(String fname) {
        basefunc.getElement(FIRST_NAME).sendKeys(fname);
    }

    public void enterLastName(String lname) {
        basefunc.getElement(LAST_NAME).sendKeys(lname);
    }

    public void enterEmail(String email) {
        basefunc.getElement(EMAIL).sendKeys(email);
    }

    public void enterPhone(String phone) {
        basefunc.getElement(PHONE).sendKeys(phone);
    }

    public void chooseStatus(int id) {
        basefunc.getElements(STATUS).get(id).click();
    }

    public void enterPropertyValue(String value) {
        basefunc.getElement(PROPERTY_VALUE).sendKeys(value);
    }

    public void tickCheckbox(int id) {
        basefunc.getElements(CHECKBOX).get(id).click();
    }

    public void clickApply() {
        basefunc.getElement(APPLY).click();
    }
}
