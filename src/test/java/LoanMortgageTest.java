import org.junit.jupiter.api.Test;
import pages.*;

public class LoanMortgageTest {
    public Basefunc basefunc = new Basefunc();
    private final String Home_Page = "loan.co.uk";

    @Test
    public void mortgageFormCheck() {

        basefunc.goToPage(Home_Page);
        HomePage homePage = new HomePage(basefunc);
        homePage.acceptCookies();

        ProductPage productPage = homePage.goToProduct(1);
        ApplicationPage applicationPage = productPage.goToSubCategory(0);

        applicationPage.enterLoanAmount("250000");
        applicationPage.enterFirstName("John");
        applicationPage.enterLastName("Smith");
        applicationPage.enterEmail("john.smith@yahoo.com");
        applicationPage.enterPhone("07741930545");
        applicationPage.chooseStatus(1);
        applicationPage.enterPropertyValue("300000");
        applicationPage.tickCheckbox(0);

        applicationPage.clickApply();

        basefunc.closeBrowser();
    }
}
