package tests.day16;

import org.testng.annotations.Test;
import utilities.C01TestbeforeAfter;

public class C03Priority extends C01TestbeforeAfter {

  //========================================================================
  /*
  Testelirimizi calistirirken istedigimiz siraya gore calismasini istersek
  @Test objesinin bulundugu yere prority() methodunu kullaniriz
  priority kullanmaz isek default olarak 0 dir.(priority atanmayan @Test ilk olarak calisir)
 */
  //========================================================================

    @Test (priority = 1)
    public void youtubeTest() {

        driver.get("https://www.youtube.com");

    }

    @Test(priority = 2)
    public void bestbuyTest() {
        driver.get("https://www.bestbuy.com");

    }

    @Test(groups = "grup1")
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }
}