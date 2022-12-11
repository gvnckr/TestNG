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

public class US11TC1 extends TestBaseRapor {





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
        reusable.waitFor(2);
        spendinGoodPage.myAccount.click();
        extentTest.info("My Account butonuna tiklandi");
        spendinGoodPage.storeManager.click();
        extentTest.info("Store Manager secenegi tiklandi");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        spendinGoodPage.storeManagerProducts.click();
        reusable.waitFor(3);
        extentTest.info("Products secenegi tiklandi");
        spendinGoodPage.addNew.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        extentTest.info("add new butonuna tiklandi");
        reusable.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        reusable.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        reusable.waitFor(3);
        spendinGoodPage.toptanurungosterme.click();
        extentTest.info("Toptan urun gosterme  butonuna tiklandi");
        reusable.waitFor(3);
        spendinGoodPage.piecetype.click();
        extentTest.info("piecetype butonuna tiklandi");
        Assert.assertTrue(spendinGoodPage.piecetype.isDisplayed());
        extentTest.info("parca turunun belirlenebildigi dogrulandi");

}



}
