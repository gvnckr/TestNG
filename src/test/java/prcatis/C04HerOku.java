package prcatis;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pagespractis.HerOkuPage;
import utilities.Driver;

import java.util.List;

public class C04HerOku {
    Actions actions = new Actions(Driver.getDriver());
    HerOkuPage herOkuPage;

    @Test
    public void testName() {
        //https://testpages.herokuapp.com/styled/events/javascript-events.html adresine gidin
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html ");

        //Tüm butonlara tıklayın ve hepsinin tıklandığını doğrulayın
          herOkuPage=new HerOkuPage();

        //kodlarimizi yazarken clean code kapsaminda daha sade kod yazmak icin  her test methodu icinde ayrı ayrı bir object creat
        // etmektense bu objecti class seviyesinde instance olarak creat edip test methodtlarinda bu deger atamak ve kullanmak
        // daha uygun bir yontemdir.

        herOkuPage.onblur.click();
        herOkuPage.onclick.click();
        herOkuPage.onclick.click();
        actions.contextClick(herOkuPage.oncontext).doubleClick(herOkuPage.doubleclick).
                click(herOkuPage.focus).click(herOkuPage.KeyDown).sendKeys(Keys.ENTER).
                click(herOkuPage.KeyUp).sendKeys(Keys.ENTER).click(herOkuPage.KeyPress).sendKeys(Keys.ENTER).
                moveToElement(herOkuPage.MouseOver).moveToElement(herOkuPage.MouseLeave).
                moveToElement(herOkuPage.MouseOver).click(herOkuPage.MouseDown).perform();

        List<WebElement> clicked=herOkuPage.Events;
        Assert.assertEquals(clicked.size(),11);

    }


}
