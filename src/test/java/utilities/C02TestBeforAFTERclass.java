package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;


import java.time.Duration;

public class C02TestBeforAFTERclass {
    // TestNG framework'unde before ve after notasyonlari yerine
// @BeforeMethod ve @AfterMetyhod kullanilir
// Calisma prensibi Junit'deki before-after ile aynidir

    protected static WebDriver driver;
    @BeforeClass(groups = "grup1")
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterClass(groups = "grup1")
    public static void tearDown(){
        // driver.close();
    }
}
