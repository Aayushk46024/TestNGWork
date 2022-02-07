package Testbase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import java.io.File;
import java.util.Date;

public class TestBase {
    public static Properties prop;
    public static WebDriver driver;


    public TestBase()  {
        try {
            FileInputStream ip = new FileInputStream("C:\\Users\\AayushKhandelwal\\Poi_Project\\src\\main\\java\\config\\config.properties");
            prop = new Properties();
            prop.load(ip);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void initialization() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));

    }

}
