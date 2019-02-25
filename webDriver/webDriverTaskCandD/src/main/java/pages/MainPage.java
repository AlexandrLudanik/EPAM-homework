package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@track-name='exploreProducts']")
    private WebElement exploreAllProductsButton;
    public ProductsPage clickExploreAllProductsButton(){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(exploreAllProductsButton));
        exploreAllProductsButton.click();
        return new ProductsPage(driver);
    }
}
