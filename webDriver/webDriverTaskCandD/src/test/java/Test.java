import org.testng.Assert;
import pages.CalculatorPage;
import pages.MainPage;
import pages.PricingPage;
import pages.ProductsPage;

public class Test extends WebDriverSettings {

    @org.testng.annotations.Test
    public void checkVMClassText() {
        mainPage = new MainPage(driver);
        pricingPage = new PricingPage(driver);
        productsPage = new ProductsPage(driver);
        calculatorPage = new CalculatorPage(driver);
        driver.get("https://cloud.google.com/");
        mainPage.clickExploreAllProductsButton();
        productsPage.clickSeeePriceButton();
        pricingPage.clickCalculatorButton();
        calculatorPage.enterIntoFrame();
        calculatorPage.chooseComputerEngine();
        calculatorPage.inputNumberOfInstances("4");
        calculatorPage.inputWhatAreTheseInstancesFor("");
        calculatorPage.clickOnDropdownListOperatingSystem();
        calculatorPage.chooseFreeDebianCentOSCoreOSUbuntuorotherUserProvidedOS();
        calculatorPage.clickOnDropdownListVMClass();
        calculatorPage.chooseRegular();
        calculatorPage.clickOnDropdownListInstancetype();
        calculatorPage.chooseN1Standard8vCPUs8RAM30GB();
        calculatorPage.clickOnCheckboxAddGPUs();
        calculatorPage.clickOnDropdownListNumberofGPUs();
        calculatorPage.choose1GPU();
        calculatorPage.clickOnDropdownListGPUtype();
        calculatorPage.chooseNVIDIATeslaV100();
        calculatorPage.clickOnDropdownListLocalSSD();
        calculatorPage.choose2x375Gb();
        calculatorPage.clickOnDropdownListDatacenterLocation();
        calculatorPage.chooseFrankfurtEuropeWest3();
        calculatorPage.clickOnDropdownListCommitedUsage();
        calculatorPage.choose1year();
        calculatorPage.clickButtonAddToEstimate();
        Assert.assertEquals("VM class: regular", calculatorPage.getVmClass());
    }

    @org.testng.annotations.Test
    public void checkInstanceType() {
        mainPage = new MainPage(driver);
        pricingPage = new PricingPage(driver);
        productsPage = new ProductsPage(driver);
        calculatorPage = new CalculatorPage(driver);
        driver.get("https://cloud.google.com/");
        mainPage.clickExploreAllProductsButton();
        productsPage.clickSeeePriceButton();
        pricingPage.clickCalculatorButton();
        calculatorPage.enterIntoFrame();
        calculatorPage.chooseComputerEngine();
        calculatorPage.inputNumberOfInstances("4");
        calculatorPage.inputWhatAreTheseInstancesFor("");
        calculatorPage.clickOnDropdownListOperatingSystem();
        calculatorPage.chooseFreeDebianCentOSCoreOSUbuntuorotherUserProvidedOS();
        calculatorPage.clickOnDropdownListVMClass();
        calculatorPage.chooseRegular();
        calculatorPage.clickOnDropdownListInstancetype();
        calculatorPage.chooseN1Standard8vCPUs8RAM30GB();
        calculatorPage.clickOnCheckboxAddGPUs();
        calculatorPage.clickOnDropdownListNumberofGPUs();
        calculatorPage.choose1GPU();
        calculatorPage.clickOnDropdownListGPUtype();
        calculatorPage.chooseNVIDIATeslaV100();
        calculatorPage.clickOnDropdownListLocalSSD();
        calculatorPage.choose2x375Gb();
        calculatorPage.clickOnDropdownListDatacenterLocation();
        calculatorPage.chooseFrankfurtEuropeWest3();
        calculatorPage.clickOnDropdownListCommitedUsage();
        calculatorPage.choose1year();
        calculatorPage.clickButtonAddToEstimate();
        Assert.assertEquals("Instance type: n1-standard-8", calculatorPage.getInstanceType());
    }

    @org.testng.annotations.Test
    public void checkRegion() {
        mainPage = new MainPage(driver);
        pricingPage = new PricingPage(driver);
        productsPage = new ProductsPage(driver);
        calculatorPage = new CalculatorPage(driver);
        driver.get("https://cloud.google.com/");
        mainPage.clickExploreAllProductsButton();
        productsPage.clickSeeePriceButton();
        pricingPage.clickCalculatorButton();
        calculatorPage.enterIntoFrame();
        calculatorPage.chooseComputerEngine();
        calculatorPage.inputNumberOfInstances("4");
        calculatorPage.inputWhatAreTheseInstancesFor("");
        calculatorPage.clickOnDropdownListOperatingSystem();
        calculatorPage.chooseFreeDebianCentOSCoreOSUbuntuorotherUserProvidedOS();
        calculatorPage.clickOnDropdownListVMClass();
        calculatorPage.chooseRegular();
        calculatorPage.clickOnDropdownListInstancetype();
        calculatorPage.chooseN1Standard8vCPUs8RAM30GB();
        calculatorPage.clickOnCheckboxAddGPUs();
        calculatorPage.clickOnDropdownListNumberofGPUs();
        calculatorPage.choose1GPU();
        calculatorPage.clickOnDropdownListGPUtype();
        calculatorPage.chooseNVIDIATeslaV100();
        calculatorPage.clickOnDropdownListLocalSSD();
        calculatorPage.choose2x375Gb();
        calculatorPage.clickOnDropdownListDatacenterLocation();
        calculatorPage.chooseFrankfurtEuropeWest3();
        calculatorPage.clickOnDropdownListCommitedUsage();
        calculatorPage.choose1year();
        calculatorPage.clickButtonAddToEstimate();
        Assert.assertEquals("Region: Frankfurt", calculatorPage.getRegion());
    }

    @org.testng.annotations.Test
    public void checkTotalAvailableSpaseSSD() {
        mainPage = new MainPage(driver);
        pricingPage = new PricingPage(driver);
        productsPage = new ProductsPage(driver);
        calculatorPage = new CalculatorPage(driver);
        driver.get("https://cloud.google.com/");
        mainPage.clickExploreAllProductsButton();
        productsPage.clickSeeePriceButton();
        pricingPage.clickCalculatorButton();
        calculatorPage.enterIntoFrame();
        calculatorPage.chooseComputerEngine();
        calculatorPage.inputNumberOfInstances("4");
        calculatorPage.inputWhatAreTheseInstancesFor("");
        calculatorPage.clickOnDropdownListOperatingSystem();
        calculatorPage.chooseFreeDebianCentOSCoreOSUbuntuorotherUserProvidedOS();
        calculatorPage.clickOnDropdownListVMClass();
        calculatorPage.chooseRegular();
        calculatorPage.clickOnDropdownListInstancetype();
        calculatorPage.chooseN1Standard8vCPUs8RAM30GB();
        calculatorPage.clickOnCheckboxAddGPUs();
        calculatorPage.clickOnDropdownListNumberofGPUs();
        calculatorPage.choose1GPU();
        calculatorPage.clickOnDropdownListGPUtype();
        calculatorPage.chooseNVIDIATeslaV100();
        calculatorPage.clickOnDropdownListLocalSSD();
        calculatorPage.choose2x375Gb();
        calculatorPage.clickOnDropdownListDatacenterLocation();
        calculatorPage.chooseFrankfurtEuropeWest3();
        calculatorPage.clickOnDropdownListCommitedUsage();
        calculatorPage.choose1year();
        calculatorPage.clickButtonAddToEstimate();
        Assert.assertEquals("Total available local SSD space 2x375 GB", calculatorPage.getTotalAvailaleLocalSSDspace());
    }

    @org.testng.annotations.Test
    public void checkTotalEstimatedCost() {
        mainPage = new MainPage(driver);
        pricingPage = new PricingPage(driver);
        productsPage = new ProductsPage(driver);
        calculatorPage = new CalculatorPage(driver);
        driver.get("https://cloud.google.com/");
        mainPage.clickExploreAllProductsButton();
        productsPage.clickSeeePriceButton();
        pricingPage.clickCalculatorButton();
        calculatorPage.enterIntoFrame();
        calculatorPage.chooseComputerEngine();
        calculatorPage.inputNumberOfInstances("4");
        calculatorPage.inputWhatAreTheseInstancesFor("");
        calculatorPage.clickOnDropdownListOperatingSystem();
        calculatorPage.chooseFreeDebianCentOSCoreOSUbuntuorotherUserProvidedOS();
        calculatorPage.clickOnDropdownListVMClass();
        calculatorPage.chooseRegular();
        calculatorPage.clickOnDropdownListInstancetype();
        calculatorPage.chooseN1Standard8vCPUs8RAM30GB();
        calculatorPage.clickOnCheckboxAddGPUs();
        calculatorPage.clickOnDropdownListNumberofGPUs();
        calculatorPage.choose1GPU();
        calculatorPage.clickOnDropdownListGPUtype();
        calculatorPage.chooseNVIDIATeslaV100();
        calculatorPage.clickOnDropdownListLocalSSD();
        calculatorPage.choose2x375Gb();
        calculatorPage.clickOnDropdownListDatacenterLocation();
        calculatorPage.chooseFrankfurtEuropeWest3();
        calculatorPage.clickOnDropdownListCommitedUsage();
        calculatorPage.choose1year();
        calculatorPage.clickButtonAddToEstimate();
        Assert.assertEquals("Total Estimated Cost: USD 1,187.77 per 1 month", calculatorPage.getTotalEstimatedCost());
    }

    @org.testng.annotations.Test
    public void checkTotalEstimatedCostInLetter() {
        mainPage = new MainPage(driver);
        pricingPage = new PricingPage(driver);
        productsPage = new ProductsPage(driver);
        calculatorPage = new CalculatorPage(driver);
        driver.get("https://cloud.google.com/");
        mainPage.clickExploreAllProductsButton();
        productsPage.clickSeeePriceButton();
        pricingPage.clickCalculatorButton();
        calculatorPage.enterIntoFrame();
        calculatorPage.chooseComputerEngine();
        calculatorPage.inputNumberOfInstances("4");
        calculatorPage.inputWhatAreTheseInstancesFor("");
        calculatorPage.clickOnDropdownListOperatingSystem();
        calculatorPage.chooseFreeDebianCentOSCoreOSUbuntuorotherUserProvidedOS();
        calculatorPage.clickOnDropdownListVMClass();
        calculatorPage.chooseRegular();
        calculatorPage.clickOnDropdownListInstancetype();
        calculatorPage.chooseN1Standard8vCPUs8RAM30GB();
        calculatorPage.clickOnCheckboxAddGPUs();
        calculatorPage.clickOnDropdownListNumberofGPUs();
        calculatorPage.choose1GPU();
        calculatorPage.clickOnDropdownListGPUtype();
        calculatorPage.chooseNVIDIATeslaV100();
        calculatorPage.clickOnDropdownListLocalSSD();
        calculatorPage.choose2x375Gb();
        calculatorPage.clickOnDropdownListDatacenterLocation();
        calculatorPage.chooseFrankfurtEuropeWest3();
        calculatorPage.clickOnDropdownListCommitedUsage();
        calculatorPage.choose1year();
        calculatorPage.clickButtonAddToEstimate();
        String totalCost = calculatorPage.getTotalEstimatedCost().substring(22, 35);
        calculatorPage.clickEmailEstimateButton();
        calculatorPage.sendLetter("https://10minutemail.com");
        calculatorPage.clickOnIncomingLetter();
        String infoINLetter = calculatorPage.getTotalEstimatedMonthlyCostFromLetter();
        Assert.assertEquals(totalCost, infoINLetter);
    }
}
