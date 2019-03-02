package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CalculatorPage {

    private WebDriver driver;

    public CalculatorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy(xpath = "//div[@class='tab-holder compute']")
    private WebElement computeEngineLink;

    @FindBy(xpath = "//input[@id='input_46']")
    private WebElement numberOfInstancesField;

    @FindBy(xpath = "//input[@id='input_47']")
    private WebElement whatAreTheseInstancesForField;

    @FindBy(xpath = "//*[@id='select_value_label_40']")
    private WebElement operationSystemDropDownList;

    @FindBy(xpath = "//*[@id='select_option_48']/div[1]")
    private WebElement freeDebianCentOSCoreOSUbuntuOrOtherUserProvidedOSOption;

    @FindBy(xpath = "//*[@id='select_value_label_41']/span[2]")
    private WebElement vmClassDropDownList;

    @FindBy(xpath = "//*[@id='select_option_60']/div[1]")
    private WebElement regularOption;

    @FindBy(xpath = "//*[@id='select_value_label_42']/span[2]")
    private WebElement instanceTypeDropDownList;

    @FindBy(xpath = "//*[@id='select_option_70']/div[1]")
    private WebElement n1Standard8vCPUs8RAM30GbOption;

    @FindBy(xpath = "//*[@aria-label='Add GPUs']")
    private WebElement addGPUsCheckbox;

    @FindBy(xpath = "//*[@placeholder=\"Number of GPUs\"]")
    private WebElement numberOfGPUsDropDownList;

    @FindBy(xpath = "//div[text()='1']")
    private WebElement gpuOption;

    @FindBy(xpath = "//*[@placeholder=\"GPU type\"]")
    private WebElement gpuTypeDropDownList;

    @FindBy(xpath = "//div[text()='NVIDIA Tesla V100']")
    private WebElement nVIDIATeslaV100Option;

    @FindBy(xpath = "//*[@id='select_value_label_43']")
    private WebElement localSSDDropDownList;

    @FindBy(xpath = "//div[text()='2x375 GB']")
    private WebElement x2x375GbOption;

    @FindBy(xpath = "//*[@id='select_value_label_44']")
    private WebElement datacenterLocationDropDownList;

    @FindBy(xpath = "//*[@id='select_option_196']")
    private WebElement frankfurtEuropeWest3Option;

    @FindBy(xpath = "//*[@id='select_value_label_45']")
    private WebElement commitedUsageDropDownList;

    @FindBy(xpath = "//*[@id='select_option_100']")
    private WebElement yearOption;

    @FindBy(xpath = "//button[@aria-label='Add to Estimate']")
    private WebElement addToEstimateButton;

    @FindBy(xpath = "(//div[@class='md-list-item-text ng-binding'])[2]")
    private WebElement vMClassInfo;

    @FindBy(xpath = "(//div[@class='md-list-item-text ng-binding'])[3]")
    private WebElement instanceTypeInfo;

    @FindBy(xpath = "(//div[@class='md-list-item-text ng-binding'])[4]")
    private WebElement regionInfo;

    @FindBy(xpath = "(//div[@class='md-list-item-text ng-binding'])[5]")
    private WebElement totalAvailableLocalSSDSpaceInfo;

    @FindBy(xpath = "(//div[@class='md-list-item-text ng-binding'])[6]")
    private WebElement commitmentTermInfo;

    @FindBy(xpath = "//*[@id='compute']/md-list/md-list-item[7]/div/b")
    private WebElement estimatedComponentCostInfo;

    @FindBy(xpath = "//*[@id='resultBlock']/md-card/md-card-content/div/div/div/h2/b")
    private WebElement totalEstimatedCostInfo;

    @FindBy(xpath = "//*[@id='email_quote']")
    private WebElement emailEstimateButton;


    @FindBy(xpath = "//*[@id='mailAddress']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath = "//button[@aria-label='Send Email']")
    private WebElement sendEmailButton;

    @FindBy(xpath = "//[@id='ui-id-1']/span[@class='inc-mail-address']")
    private WebElement infoLineAboutLetter;

    @FindBy(xpath = "//*[@id=\"messagesList\"]")
    private WebElement incomingLetter;

    @FindBy(xpath = "//*[@id=\"mobilepadding\"]/td/table/tbody/tr[1]/td[1]/img")
    private WebElement logoInTable;

    @FindBy(xpath = "//table//td[2]/h3")
    private WebElement totalEstimatedMonthlyCostIneLetter;


    public void enterIntoFrame() {
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='cp-header']//iframe")));
    }

    public void chooseComputerEngine() {
        computeEngineLink.click();
    }

    public void inputNumberOfInstances(String number) {
        numberOfInstancesField.sendKeys(number);
    }

    public void inputWhatAreTheseInstancesFor(String text) {
        whatAreTheseInstancesForField.sendKeys(text);
    }

    public void clickOnDropdownListOperatingSystem() {
        operationSystemDropDownList.click();
    }

    public void chooseFreeDebianCentOSCoreOSUbuntuorotherUserProvidedOS() {
        freeDebianCentOSCoreOSUbuntuOrOtherUserProvidedOSOption.click();
    }

    public void clickOnDropdownListVMClass() {
        vmClassDropDownList.click();
    }

    public void chooseRegular() {
        regularOption.click();
    }

    public void clickOnDropdownListInstancetype() {
        instanceTypeDropDownList.click();
    }

    public void chooseN1Standard8vCPUs8RAM30GB() {
        n1Standard8vCPUs8RAM30GbOption.click();
    }

    public void clickOnCheckboxAddGPUs() {
        addGPUsCheckbox.click();
    }

    public void clickOnDropdownListNumberofGPUs() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(numberOfGPUsDropDownList));
        numberOfGPUsDropDownList.click();
    }

    public void choose1GPU() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(gpuOption));
        gpuOption.click();
    }

    public void clickOnDropdownListGPUtype() {
        gpuTypeDropDownList.click();
    }

    public void chooseNVIDIATeslaV100() {
        nVIDIATeslaV100Option.click();
    }

    public void clickOnDropdownListLocalSSD() {
        localSSDDropDownList.click();
    }

    public void choose2x375Gb() {
        x2x375GbOption.click();
    }

    public void clickOnDropdownListDatacenterLocation() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(datacenterLocationDropDownList)).click();
    }

    public void chooseFrankfurtEuropeWest3() {

        frankfurtEuropeWest3Option.click();
    }

    public void clickOnDropdownListCommitedUsage() {
        commitedUsageDropDownList.click();
    }

    public void choose1year() {
        yearOption.click();
    }

    public void clickButtonAddToEstimate() {
        addToEstimateButton.click();
    }

    public String getVmClass() {
        return vMClassInfo.getText();
    }

    public String getInstanceType() {
        return instanceTypeInfo.getText();
    }

    public String getRegion() {
        return regionInfo.getText();
    }

    public String getTotalAvailaleLocalSSDspace() {
        return totalAvailableLocalSSDSpaceInfo.getText();
    }

    public String getCommitmentTerm() {
        return commitmentTermInfo.getText();
    }

    public String getEstimatedComponentCost() {
        return estimatedComponentCostInfo.getText();
    }

    public String getTotalEstimatedCost() {
        return totalEstimatedCostInfo.getText();
    }

    public void clickEmailEstimateButton() {
        emailEstimateButton.click();
    }

    public String nameTab() {
        return driver.getWindowHandle();
    }

    public void openNewTab() {
        ((ChromeDriver) driver).executeScript("window.open()");

    }

    public void swithTab(){
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
    }

    public void setAddress(String address){
        driver.get(address);

    }

    public void sendLetter(String address) {
        String firstTab = driver.getWindowHandle();
        openNewTab();
        swithTab();
        String secondTab = driver.getWindowHandle();
        driver.get(address);
        String email = saveEmailAddress();
        driver.switchTo().window(firstTab);
        enterIntoFrame();
        inputEmailAdderess(email);
        clickSendEmailButton();
        driver.switchTo().window(secondTab);
    }

    public String saveEmailAddress() {
        return emailAddress.getAttribute("value");
    }

    public void inputEmailAdderess(String address) {
        emailField.sendKeys(address);
    }

    public void clickSendEmailButton() {
        sendEmailButton.click();
    }


    public String getTotalEstimatedMonthlyCostFromLetter() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(logoInTable));
        return totalEstimatedMonthlyCostIneLetter.getText().substring(0,12);
    }

    public void clickOnIncomingLetter() {
        new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(infoLineAboutLetter));
        try {
            TimeUnit.SECONDS.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        infoLineAboutLetter.click();

    }
    public void switchTabString(String tab){
        driver.switchTo().window(tab);
    }
}