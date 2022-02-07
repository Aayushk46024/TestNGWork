package Tests;

import Pages.AboutPage;
import org.testng.annotations.Test;

public class AboutTest {
    public AboutTest()
    {
        super();
    }
    @Test
    public void about()
    {
        AboutPage obj = new AboutPage();
        obj.about();
    }
}
