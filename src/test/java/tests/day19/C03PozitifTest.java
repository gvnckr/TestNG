package tests.day19;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03PozitifTest {

    @Test
    public void pozitifTest() {

        //  https://www.hotelmycamp.com/ adresine git  login butonuna bas
        //test data username: manager ,  test data password : Manager1!

        Driver.getDriver().get(ConfigReader.getProperty("hmc"));
        HmcPage hmcPage = new HmcPage();

        /*Page class'ındaki locate'lerimize ulaşabilmek için
        Page classımızdan bir obje oluşturarak, oluşturmuş olduğumuz obje ile
        page classımızdaki locate'lerimize ulaşabiliriz
        */

        hmcPage.login.click();
        hmcPage.username.sendKeys(ConfigReader.getProperty("username"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hmcPage.girisyapildi.isDisplayed());
        Driver.closeDriver();
        //TestNG de
        //1- Öncelikle configuration ’a tanimlamalar yapılır(username,url,password gibi)
        //2- Pages sayfasinda locate’leri yapariz
        //3- ConfigReader ile sorunun çözümünü yapilir (

    }
}
