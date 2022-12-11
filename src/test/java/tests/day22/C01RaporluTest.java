package tests.day22;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.pages.BlueRentacarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01RaporluTest extends TestBaseRapor {

     Actions actions = new Actions(Driver.getDriver());



    @Test
    public void test1() {
        extentTest=extentReports.createTest("PozitifTest","Gecerli kullanici adi ve sifre ile giris yapildi");
         //-https://www.bluerentalcars.com/ adresine git
        extentTest.info("Blue RentaCar sitesine gidildi");
         Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
         //-login butonuna bas
        extentTest.info("Login Butonuna basildi");
        BlueRentacarPage brc=new BlueRentacarPage();
        brc.brclogin.click();

         // -test data user email: customer@bluerentalcars.com , test data password : 12345 dataları girip login e basın
        // -login butonuna tiklayin
            extentTest.info("Dogru kullanici ve sifre ile giris yapildi");
        brc.brcMail.sendKeys(ConfigReader.getProperty("userEmail"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("pass")).sendKeys(Keys.ENTER).perform();


         // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        extentTest.info("Basarili giris yapildiği test edildi");

         String actuelUsername=brc.basariligiris.getText();
         String expectedusername="John Walker";
         Assert.assertEquals(expectedusername, actuelUsername);


    }
}
