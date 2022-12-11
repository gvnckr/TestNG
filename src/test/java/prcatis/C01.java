package prcatis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.C01TestbeforeAfter;

public class C01 extends C01TestbeforeAfter {


    @Test
    public void test1() {
        // url'ye gidin: https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.id("cookieChoiceDismiss")).click();//COOKİS İCİN
        //adını doldur
        WebElement name=driver.findElement(By.xpath("//*[@name='firstname']"));
        name.sendKeys("guven");
        // soyadını doldur
        WebElement soyad= driver.findElement(By.xpath("//*[@name='lastname']"));
        soyad.sendKeys("cakir");
        //cinsiyeti kontrol et
        driver.findElement(By.cssSelector("#sex-0")).click();


        // deneyimi kontrol et
        driver.findElement(By.cssSelector("#exp-0")).click();
        //tarihi doldurun

        driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("11.12.2022");
        // mesleğinizi seçin -> Otomasyon Test Cihazı
        driver.findElement(By.xpath("//*[@id='profession-1']")).click();

        //aracınızı seçin -> Selenium Webdriver
        driver.findElement(By.xpath("//*[@id='tool-2']")).click();

        //kıtanızı seçin -> Antartica

        WebElement dropdown= driver.findElement(By.xpath("//select[@id='continents']"));
        Select select=new Select(dropdown);
        select.selectByVisibleText("Antartica");
       // driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Antartica");
        //buda calisir

        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//select[@id='selenium_commands']/option[1]")).click();
        //click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();



    }
}
