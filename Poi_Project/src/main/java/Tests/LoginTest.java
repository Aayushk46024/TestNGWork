package Tests;

import Pages.LoginPage;
import Testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase {
    LoginPage oo;
    String title;

    public LoginTest()
    {
        super();
    }

    @BeforeSuite
    public void Launch() {
        initialization();
        oo = new LoginPage();
    }
    @Test
    public void CheckTitle()
    {
        title = oo.Verifytitle();
        Assert.assertEquals(title, "Swag Labs");
    }
    @Test
    public void logindetails() throws IOException {
        oo.login();
    }

    @AfterSuite
    public void ShutDown(){
        driver.close();
    }

}
