import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CalculatorPage;
import pages.MainPage;
import pages.PricingPage;
import pages.ProductsPage;
import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

    public static WebDriver driver;
    public MainPage mainPage;
    public ProductsPage productsPage;
    public PricingPage pricingPage;
    public CalculatorPage calculatorPage;

    @Before
    public void setUp() {
        if (driver != null) {
            return;
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> {
                    driver.quit();
                    driver = null;
                }));
    }
}