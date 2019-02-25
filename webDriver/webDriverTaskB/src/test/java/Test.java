import org.junit.Assert;

public class Test extends WebDriverSettings {

    String text = "git config --global user.name  \"New Sheriff in Town\"\ngit reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\ngit push origin master --force";
    String name = "how to gain dominance among developers";
    public MainPage mainPage;


    @org.junit.Test
    public void checkText() {

        mainPage = new MainPage(driver);

        driver.get("https://pastebin.com/");
        mainPage.setTextPasteField(text);
        mainPage.setOptionalPasteSettings("Paste Expiration", "10 Minutes");
        mainPage.setOptionalPasteSettings("Syntax Highlighting", "Bash");
        mainPage.setNameSettings("Paste Name", name);
        mainPage.clickCreateNewPasteButton();
        Assert.assertEquals(text, mainPage.getRAWPasteArea());
    }

    @org.junit.Test
    public void checkTitle() {

        mainPage = new MainPage(driver);

        driver.get("https://pastebin.com/");
        mainPage.setTextPasteField(text);
        mainPage.setOptionalPasteSettings("Paste Expiration", "10 Minutes");
        mainPage.setOptionalPasteSettings("Syntax Highlighting", "Bash");
        mainPage.setNameSettings("Paste Name", name);
        mainPage.clickCreateNewPasteButton();
        Assert.assertEquals(name, mainPage.getTitle());
    }
}
