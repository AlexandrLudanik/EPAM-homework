import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public static WebDriver driver;


    @Before
    public void setUp() {
        if (driver != null) {
            return;
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> {
                    driver.quit();
                    driver = null;
                }));

//        Runtime.getRuntime().addShutdownHook(
//                new Thread(new Runnable() {
//                    public void run() {
//                        driver.quit();
//                        driver = null;
//                    }
//                }));
    }


    @After
    public void tearDown() {
//        driver.close();
    }
}
