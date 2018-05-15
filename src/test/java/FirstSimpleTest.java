import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSimpleTest extends WebDriverSettings{

    @Test
    public void checkYoutubeTitle() {
        driver.get("http://www.youtube.com");

        if (driver.getTitle().equals("YouTube")) {
            System.out.println("Verno");
        } else {
            Assert.fail("Ne verno");
        }
    }
}
