package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    Basefunc basefunc;
    private final By PRODUCTS = By.xpath(".//a[contains(@href, 'https://www.loan.co.uk/select')]");
    private final By COOKIES = By.xpath(".//a[@id = 'cookie-btn']");

    public HomePage(Basefunc basefunc) {
        this.basefunc = basefunc;
    }

    public WebElement getProductById(int id) {
        return basefunc.getElements(PRODUCTS).get(id);
    }

    public ProductPage goToProduct(int id) {
        getProductById(id).click();
        return new ProductPage(basefunc);
    }

    public void acceptCookies() {
        basefunc.getElement(COOKIES).click();
    }
}
