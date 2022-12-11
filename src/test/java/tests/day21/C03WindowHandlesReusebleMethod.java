package tests.day21;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class C03WindowHandlesReusebleMethod {
    @Test
    public void test01() {

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //● Click Here butonuna basın.
        ReusableMethods.waitFor(3);
        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']"));
        // acilan yeni tab'in title'inin "New Window" oldugunu test edin
        ArrayList<String>pencereler=new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(pencereler.get(1));
        String expectedtitle="New Window";
        String actualtitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedtitle, actualtitle);
        Driver.closeDriver();

    }

    @Test
    public void test02() {

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //● Click Here butonuna basın.
        ReusableMethods.waitFor(3);
        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();
        // acilan yeni tab'in title'inin "New Window" oldugunu test edin
        ReusableMethods.switchToWindow("New Window");
        String expectedTitle = "New Window";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        Driver.quitDriver();
    }
}
