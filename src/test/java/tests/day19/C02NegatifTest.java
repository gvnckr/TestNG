package tests.day19;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02NegatifTest {
    @Test
    public void negatifTest() {

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
