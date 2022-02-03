package Parallel_WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Parallel_Web_Driver {
    String path, path1;
    WebDriver driver, driver1;
    @Test
    public void LaunchBrowser()
    {
        path = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        driver.close();
    }
    @Test
    public void LaunchEdgeBrowser()
    {
        path1 = System.getProperty("user.dir")+"//drivers//msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", path1);

        driver1 = new EdgeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://opensource-demo.orangehrmlive.com/");

        driver1.close();
    }

}
