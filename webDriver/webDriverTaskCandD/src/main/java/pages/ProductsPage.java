package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    private WebDriver driver;

    public ProductsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@track-name='seePricing']")
    private WebElement seePriceButton;

    public PricingPage clickSeeePriceButton() {
        seePriceButton.click();
        return new PricingPage(driver);

    }
}
