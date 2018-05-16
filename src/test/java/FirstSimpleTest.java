import com.page.PageYoutube;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSimpleTest extends WebDriverSettings {

    @Test (priority = 1)
    public void checkYoutubeTitle() {
        driver.get("http://www.youtube.com");

        if (driver.getTitle().equals("YouTube")) {
            System.out.println("Verno");
        } else {
            Assert.fail("Ne verno");
        }
    }

    @Test (priority = 2)
    public void searchLine() {
        PageYoutube search = new PageYoutube(driver);
        search.typeSearchLine();
        search.clickSearchBtn();
    }


    @Test
    public void vvodTest() {
        int k;


    }
}
