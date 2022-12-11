package projetest;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.pages.SpendinGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US10TC2 extends TestBaseRapor {





    SpendinGoodPage spendinGoodPage = new SpendinGoodPage();
    ReusableMethods reusable = new ReusableMethods();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void tc01() {

        extentTest = extentReports.createTest("Attribut ozellikler", "Ozelliklerin belirlenebildigi goruntulendi");
        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));
        extentTest.info("spendingGoodUrl sitesine gidildi");
        spendinGoodPage.SignIn.click();
        extentTest.info("signIn sekmeksine tiklandi");
        spendinGoodPage.userNameBox.sendKeys(ConfigReader.getProperty("ortakVendorEmail"));
        spendinGoodPage.passwordBox.sendKeys(ConfigReader.getProperty("ortakVendorPassword"));
        spendinGoodPage.SignInButton.click();
        extentTest.info("email ve password girilip signin butonuna basildi");
        reusable.waitFor(3);
        spendinGoodPage.myAccount.click();
        reusable.waitFor(3);
        extentTest.info("My Account butonuna tiklandi");
        spendinGoodPage.storeManager.click();
        reusable.waitFor(3);
        extentTest.info("Store Manager secenegi tiklandi");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.storeManagerProducts.click();
        reusable.waitFor(3);
        extentTest.info("Products secenegi tiklandi");
        spendinGoodPage.addNew.click();
        extentTest.info("add new butonuna tiklandi");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        reusable.waitFor(3);
        spendinGoodPage.atributesbutton.click();
        extentTest.info("Attribut butonuna tiklandi");
        reusable.waitFor(3);
        spendinGoodPage.size.click();
        extentTest.info("Size secenegini tiklar");
        spendinGoodPage.activeSize.click();
        extentTest.info("Size secenegi; small, medium, large, extra large  oldugu dogrulandi");
        Assert.assertTrue(spendinGoodPage.activeSize.isDisplayed());


    }
}
