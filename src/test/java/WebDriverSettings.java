

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WebDriverSettings {

    public ChromeDriver driver;

    @BeforeTest
    public void stUp(){
        System.setProperty("webdriver.chrome.driver", "c:\\Program Files\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

    }



    @AfterTest
    public void close(){
       // driver.quit();
    }

}
