package tests.day16;

import org.testng.annotations.Test;
import utilities.C02TestBeforAFTERclass;

public class C02BeforclassAfterClass extends C02TestBeforAFTERclass {
    //=============================================================================================================
    // @BeforeClass ve @AfterClass notasyonlarını TestNG de kullanırken JUnit'teki gibi static yapmaya gerek yoktur
    // ============================================================================================================
    @Test
    public void amazonTest() {

        driver.get("https://www.amazon.com");

    }

    @Test
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");

    }

    @Test
    public void techproeducationTest() {
        driver.get("https://www.techproeducation.com");
    }
}
