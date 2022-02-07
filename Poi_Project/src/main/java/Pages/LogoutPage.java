package Pages;

import Testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LogoutPage extends TestBase {

    @FindBy(id = "react-burger-menu-btn")
    WebElement HomeButton;
    @FindBy(id = "logout_sidebar_link")
    WebElement lout;

    public LogoutPage(){
        PageFactory.initElements(driver, this);
    }

    public void logout(){
        HomeButton.click();
        lout.click();
    }
}
