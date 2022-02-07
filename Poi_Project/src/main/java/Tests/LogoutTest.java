package Tests;

import Pages.AboutPage;
import Pages.LogoutPage;
import Testbase.TestBase;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {

    public LogoutTest()
    {
        super();
    }

    @Test
    public void logout()
    {
        LogoutPage obj = new LogoutPage();
        obj.logout();
    }
}
