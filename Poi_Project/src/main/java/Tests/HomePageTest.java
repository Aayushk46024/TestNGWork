package Tests;

import Pages.AboutPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTest {
    public HomePageTest()
    {
        super();
    }
    @Test
    public void homePageTest()
    {
        HomePage obj = new HomePage();
        obj.homePage();
    }
}
