package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class CrossDriver {
    private CrossDriver(){


    }
    static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        browser=browser==null? ConfigReader.getProperty("browser"):browser;
        //eger browser a bir deger atanmamissa properties dosyasinin calismasi icin guvenlik olmustur
        //Testlerimizi xml file dan farkli breowserlar ile calistirmak icin get driver methoduna parametre atamamız gerekir
        if (driver == null) {
            switch (browser){
                //CrossBrowser icin bizim gonderdigimiz browser uzerinden calismasi icin buraya parametre olarak girddigimiz degeri yazdik
                case"edge":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "chrome":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();


            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver!=null) { //driver'a DEGER atanmamissa
            driver.close();
            driver=null; //kapandiktan sonraki acmalari garanti altina almak icin driver'i tekrar null yaptik
        }
    }
    public static void  quitDriver(){
        if (driver!=null) {
            driver.quit();
            driver=null;
        }



    }

}
