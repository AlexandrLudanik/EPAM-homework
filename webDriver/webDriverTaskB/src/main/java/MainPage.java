import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id='paste_code']")
    private WebElement newPasteField;

    @FindBy(xpath = "//input[@id='submit']")
    private WebElement createNewPasteButton;

    @FindBy(xpath = "//*[@class='paste_box_line1']")
    private WebElement title;

    @FindBy(xpath = "//*[@id='paste_code']")
    private WebElement rawPasteArea;


    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void setTextPasteField(String text) {
        newPasteField.sendKeys(text);
    }

    public void setOptionalPasteSettings(String option, String settings) {
        String listXpath = String.format("//div[contains(text(),'%s')]/following-sibling::div", option);
        String optionXpath = String.format("//li[text()='%s']", settings);

        driver.findElement(By.xpath(listXpath)).click();
        driver.findElement(By.xpath(optionXpath)).click();
    }

    public void setNameSettings(String option, String name) {
        String listXpath = String.format("//div[contains(text(),'%s')]/following-sibling::div/input", option);
        driver.findElement(By.xpath(listXpath)).sendKeys(name);
    }

    public void clickCreateNewPasteButton() {
        createNewPasteButton.click();
    }

    public String getTitle() {
        return title.getText();
    }

    public String getRAWPasteArea(){
        return rawPasteArea.getText();
    }
}
