package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricingPage {

    private WebDriver driver;

    public PricingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"cloud-site\"]/nav/div/div/ul/li[3]/a")
    private WebElement calculatorButton;


    public CalculatorPage clickCalculatorButton(){
        calculatorButton.click();
        return new CalculatorPage(driver);
    }
}
