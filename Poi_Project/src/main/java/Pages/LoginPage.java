package Pages;

import Testbase.TestBase;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class LoginPage extends TestBase {

    @FindBy(id = "user-name")
    WebElement uname;
    @FindBy(id = "password")
    WebElement pass;
    @FindBy(id = "login-button")
    WebElement loginbutton;

    public LoginPage()  {
        PageFactory.initElements(driver, this);
    }
    public String Verifytitle(){
        return driver.getTitle();
    }
    public void login() throws IOException {
        FileInputStream fs = new FileInputStream("C:\\Users\\AayushKhandelwal\\Poi_Project\\TestData\\Login_Data.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(fs);
        HSSFSheet sheet = workbook.getSheetAt(0);
        String username = sheet.getRow(1).getCell(0).getStringCellValue();
        String password = sheet.getRow(1).getCell(1).getStringCellValue();
        uname.sendKeys(username);
        pass.sendKeys(password);
        loginbutton.click();
    }
}
