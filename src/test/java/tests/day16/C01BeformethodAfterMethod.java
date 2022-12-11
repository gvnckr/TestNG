package tests.day16;

import org.testng.annotations.Test;
import utilities.C01TestbeforeAfter;

public class C01BeformethodAfterMethod extends C01TestbeforeAfter {
    @Test
    public void amazonTest() {

        driver.get("https://www.amazon.com");

    }

    @Test(groups = "grup1")
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");

    }

    @Test
    public void techproeducationTest() {
        driver.get("https://www.techproeducation.com");
    }
}
