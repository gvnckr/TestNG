package prcatis;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.C01TestbeforeAfter;

public class C02 extends C01TestbeforeAfter {

    @Test
    public void testName() {





        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
   driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        driver.findElement(By.xpath("//span[@id='button1']")).click();

        // 3. Açılır metni alın
        String alert=driver.switchTo().alert().getText();
        System.out.println(alert);

        // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
      String expected="I am an alert box!";
      Assert.assertEquals(alert, expected);
     // Assert.assertTrue(alert.contains("I am an alert box!")); ustteki ile aynı

        // 5. Açılır pencereyi kabul edin
    driver.switchTo().alert().accept();//accept alertü kabul eder

    }
}
