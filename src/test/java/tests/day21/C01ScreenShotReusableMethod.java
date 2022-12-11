package tests.day21;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import tests.pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01ScreenShotReusableMethod {
    private static Logger logger = LogManager.getLogger(C01ScreenShotReusableMethod.class.getName());
    @Test
    public void test01() throws IOException {
        logger.info("Hepsiburada sitesine gidilir");

        //hepsiburada sayfasina gidiniz sayfaninin resmini aliniz
        Driver.getDriver().get("https://hepsiburada.com");
        ReusableMethods.getScreenshot("hepsiburada");
        logger.info("sayfanin goruntusu alinir");
        //sayfayi kapatiniz
        Driver.closeDriver();
    }


    @Test
    public void test02() throws IOException {
        //amazon sayfassina gidiniz nutella aratiniz
        Driver.getDriver().get(ConfigReader.getProperty("amznurl"));
        AmazonPage amznpage = new AmazonPage();
        amznpage.aramaKutusu.sendKeys("nutella", Keys.ENTER);
        //arama sonuc yazisini Webelementinin sonuc yazisini aliniz
        ReusableMethods.getScreenshotWebElement(" aramaSonucWE",amznpage.aramaSonucWE);

    }
}


