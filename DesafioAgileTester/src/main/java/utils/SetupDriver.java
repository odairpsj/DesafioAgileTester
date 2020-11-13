package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver {
    WebDriver driver;

    public SetupDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Oda\\OneDrive\\Área de Trabalho\\DesafioAgileTester\\src\\main\\resources\\chromedriver.exe");
         driver = new ChromeDriver();

    }

}
