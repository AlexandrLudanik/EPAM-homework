import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import pages.CalculatorPage;
import pages.MainPage;
import pages.PricingPage;
import pages.ProductsPage;
import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

    static WebDriver driver;
    MainPage mainPage;
    ProductsPage productsPage;
    PricingPage pricingPage;
    CalculatorPage calculatorPage;

    @BeforeSuite
    public void setUp() {
        if (driver != null) {
            return;
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Runtime.getRuntime().addShutdownHook(
                new Thread(new Runnable() {
                    public void run() {
                        driver.quit();
                        driver = null;
                    }
                }));
    }
}