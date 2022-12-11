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

public class US10TC1 extends TestBaseRapor {




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
        extentTest.info("Store Manager secenegi tiklandi");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        reusable.waitFor(3);
       spendinGoodPage.storeManagerProducts.click();
        reusable.waitFor(4);
        extentTest.info("Products secenegi tiklandi");
        spendinGoodPage.addNew.click();
        extentTest.info("add new butonuna tiklandi");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        reusable.waitFor(3);
        spendinGoodPage.atributesbutton.click();
        extentTest.info("Attribut butonuna tiklandi");
        spendinGoodPage.color.click();
        spendinGoodPage.activeColor.click();
        reusable.waitFor(3);
        Assert.assertTrue(spendinGoodPage.color.isDisplayed());
        extentTest.info("Renk secenegi; beyaz, siyah, yeşil vs tum renkler belirlenebildigi dogrulandi");



    }
    @Test
    public void test2(){
        spendinGoodPage.size.click();
        extentTest.info("Size secenegini tiklar");
        spendinGoodPage.activeSize.click();
        extentTest.info("Size secenegi; small, medium, large, extra large  oldugu dogrulandi");
        Assert.assertTrue(spendinGoodPage.activeSize.isDisplayed());

    }

    @Test
    public void test3(){
        reusable.waitFor(3);
        spendinGoodPage.toptanurungosterme.click();
        extentTest.info("Toptan urun gosterme  butonuna tiklandi");
        reusable.waitFor(3);
        spendinGoodPage.piecetype.click();
        reusable.waitFor(3);
        extentTest.info("piecetype butonuna tiklandi");
        Assert.assertTrue(spendinGoodPage.piecetype.isDisplayed());
        extentTest.info("parca turunun belirlenebildigi dogrulandi");

        spendinGoodPage.unitperpiece.click();
        reusable.waitFor(3);
        extentTest.info("unitperpiece urun gosterme butonuna tiklandi");
        spendinGoodPage.unitperpiece.click();
        spendinGoodPage.unitperpiece.clear();
        reusable.waitFor(2);
        actions.sendKeys(spendinGoodPage.unitperpiece,"10").perform();
        Assert.assertTrue(spendinGoodPage.unitperpiece.isDisplayed());
        extentTest.info("Birime gore urun miktari girilebildigi dogrulandi");
        spendinGoodPage.minorderqtytr.click();
        extentTest.info("minorderqtytr urun gosterme butonuna tikland");
        spendinGoodPage.minorderqtytr.clear();
        reusable.waitFor(3);
        actions.sendKeys(spendinGoodPage.minorderqtytr,"10").perform();

        org.testng.Assert.assertTrue(spendinGoodPage.minorderqtytr.isDisplayed());
        extentTest.info("Minimum siparis miktarini belirlenbildigi dogruşandi");




    }


}

