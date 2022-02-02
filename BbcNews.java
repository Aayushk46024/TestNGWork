package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BbcNews {

    public static void main(String[] args) {
        String path;
        path = System.getProperty("user.dir")+"//drivers//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://bbc.com");
        List<WebElement> list = driver.findElements(By.xpath("//a[@class='media__link']"));

        list.forEach(name->{
            System.out.println(name.getText());
        });

        driver.close();
        driver.quit();


    }


}