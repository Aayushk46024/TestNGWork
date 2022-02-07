package Pages;

import Testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage extends TestBase {

    @FindBy(id = "react-burger-menu-btn")
    WebElement HomeButton;
    @FindBy(id = "about_sidebar_link")
    WebElement About;

    public AboutPage(){
        PageFactory.initElements(driver, this);
    }

    public void about()
    {
        HomeButton.click();
        About.click();
        driver.navigate().back();
    }


}
