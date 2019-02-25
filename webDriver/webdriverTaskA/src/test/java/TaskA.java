import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TaskA {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://pastebin.com/");
        WebElement newPasteField = driver.findElement(By.xpath("//*[@id='paste_code']"));
        newPasteField.sendKeys("Hello from WebDriver");
        setOptionalPasteSettings("Paste Expiration", "10 Minutes");
        setNameSettings("Paste Name", "helloweb");
        driver.quit();

    }

    private static void setOptionalPasteSettings(String option, String settings) {
        String listXpath = String.format("//div[contains(text(),'%s')]/following-sibling::div", option);
        String optionXpath = String.format("//li[text()='%s']", settings);
        driver.findElement(By.xpath(listXpath)).click();
        driver.findElement(By.xpath(optionXpath)).click();
    }

    private static void setNameSettings(String option, String name) {
        String listXpath = String.format("//div[contains(text(),'%s')]/following-sibling::div/input", option);
        driver.findElement(By.xpath(listXpath)).sendKeys(name);
    }
}
