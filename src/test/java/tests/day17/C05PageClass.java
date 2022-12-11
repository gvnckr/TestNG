package tests.day17;

import org.junit.Test;
import org.openqa.selenium.Keys;
import tests.pages.AmazonPage;
import utilities.Driver;

public class C05PageClass {

    @Test
    public void test() {
        AmazonPage amazonPage= new AmazonPage();
        Driver.getDriver().get("https://www.amazon.com");
        amazonPage.aramaKutusu.sendKeys("nutella", Keys.ENTER);

    }

}
