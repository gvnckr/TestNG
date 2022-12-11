package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02ConfigurationProperties {
    @Test
    public void testName() {
      //amazona gidin
      String urlamzn=ConfigReader.getProperty("amznurl");
      String urlface=ConfigReader.getProperty("faceurl");
      Driver.getDriver().get(urlamzn);
      Driver.getDriver().get(urlface);
      Driver.closeDriver();



    }
}
