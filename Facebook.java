
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Facebook {
    WebDriver driver;
    void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Thread.sleep(5000);
    }
    void question1() {
        driver.findElement(By.xpath("//div[@class='_1lch']//child::button")).click();
    }

    void question2() {
        driver.findElement(By.xpath("//button[@class='_6j"
                        + " mvm _6wk _6wl _58mi _3ma _6o _6v']//parent::div//preceding-sibling::div[@id='fullname_field']//child::input[@name='firstname']"))
                .sendKeys("We are done");
    }
    void question3() {
        driver.findElement(By.xpath("//input[@name='reg_email__']//following::input[@name='reg_passwd__']")).click();
    }

    void question4() {
        driver.findElement(By.xpath("//div[@class='mbm _br- _a4y']//preceding::input[@name='reg_email__']")).sendKeys("sachinkumar");
    }

    public static void main(String[] args) throws InterruptedException {
        Facebook obj = new Facebook();
		obj.setup();
		obj.question1();
		obj.question2();
		obj.question3();
		obj.question4();

        obj.driver.close();

    }

}