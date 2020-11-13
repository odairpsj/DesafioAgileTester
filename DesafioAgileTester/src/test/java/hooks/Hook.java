package hooks;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
    public static WebDriver driver;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("chrome.driver"));
        driver = new ChromeDriver();
    }

    @After
    public void cleanUp(){
        if (driver != null) {
            driver.quit();
        }

    }


}
