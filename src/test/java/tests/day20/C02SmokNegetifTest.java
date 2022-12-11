package tests.day20;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02SmokNegetifTest {

    @Test
    public void yanliskullanici() {  // yanlis kullanici dogru sifre 1. seneryo

        // 1 ) Bir Class olustur : NegativeTest
        //  2) Bir test method olustur NegativeLoginTest()
        //  https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmc"));
        HmcPage hmcPage = new HmcPage();
        //        login butonuna bas
        hmcPage.login.click();
        // test data username: manager1 ,  test data password : manager1!
        hmcPage.username.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya girilemedigini test et

        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());

        //sayfayi kapatiniz
        Driver.closeDriver();


    }

    @Test
    public void yanlissifre() {  //dogru kullanici yanlis sifre  2. seneryo
        // 1 ) Bir Class olustur : NegativeTest
        //  2) Bir test method olustur NegativeLoginTest()
        //  https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmc"));
        HmcPage hmcPage = new HmcPage();
        //        login butonuna bas
        hmcPage.login.click();
        // test data username: manager1 ,  test data password : manager1!
        hmcPage.username.sendKeys(ConfigReader.getProperty("username"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPass")).
                sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya girilemedigini test et

        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());

        //sayfayi kapatiniz
        Driver.closeDriver();

    }


    @Test
    public void yaniskullanicisifre() { // yanlis kullanici yanlis sifre
        // 1 ) Bir Class olustur : NegativeTest
        //  2) Bir test method olustur NegativeLoginTest()
        //  https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmc"));
        HmcPage hmcPage = new HmcPage();
        //        login butonuna bas
        hmcPage.login.click();
        // test data username: manager1 ,  test data password : manager1!
        hmcPage.username.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPass")).
                sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya girilemedigini test et

        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());

        //sayfayi kapatiniz
        Driver.closeDriver();

    }
}

