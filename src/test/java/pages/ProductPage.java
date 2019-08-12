package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage {
    Basefunc basefunc;

    private final By CATEGORY = By.xpath(".//p[@class = 'btn btn-primary']");

    public ProductPage(Basefunc basefunc) {
        this.basefunc = basefunc;
    }

    public WebElement getSubCategoryById(int id) {
        return basefunc.getElement(CATEGORY);
    }

    public ApplicationPage goToSubCategory(int id) {
        getSubCategoryById(id).click();
        return new ApplicationPage(basefunc);
    }
}
