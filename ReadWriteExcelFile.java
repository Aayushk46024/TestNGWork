import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;

public class ReadWriteExcelFile {
    WebDriver driver;
    String setup(String user, String pass){
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys(user);
        driver.findElement(By.id("txtPassword")).sendKeys(pass);
        driver.findElement(By.id("btnLogin")).submit();
        String act = driver.getCurrentUrl();
        return act;
    }
    void close(){
        driver.quit();
    }
    void test() throws IOException, InterruptedException {
        //Reading the file path

        String path = System.getProperty("user.dir") + "/TestData/Login_Data.xls";
        //Reading the Excel file
        FileInputStream file = new FileInputStream(path);
        //Reading the workBook
        HSSFWorkbook bk = new HSSFWorkbook(file);
        //Reading the sheet
        HSSFSheet sh = bk.getSheetAt(0);
        //printing the no of coloum in the sheets
        System.out.println(sh.getLastRowNum());
        //Reading the file data using for loop
        for(int i = 1; i <= sh.getLastRowNum(); i++){
            System.out.print(sh.getRow(i).getCell(0).getStringCellValue()+"\t");
            System.out.println(sh.getRow(i).getCell(1).getStringCellValue());
            sh.getRow(i).createCell(2).setCellValue("" + "Data Fetch");
            FileOutputStream outFile = new FileOutputStream(path);
            bk.write(outFile);
            outFile.close();
        }
        for (int i = 1; i <= sh.getLastRowNum(); i++) {
            String user = sh.getRow(i).getCell(0).getStringCellValue();
            String pass = sh.getRow(i).getCell(1).getStringCellValue();
            String exp = sh.getRow(i).getCell(3).getStringCellValue();
            String act = setup(user, pass);
            FileOutputStream outFile =new FileOutputStream(path);
            if(exp.equals(act)){
                sh.getRow(i).createCell(4).setCellValue(act);
                sh.getRow(i).createCell(5).setCellValue("Test Case Pass");
                bk.write(outFile);
            }
            else{
                sh.getRow(i).createCell(4).setCellValue(act);
                sh.getRow(i).createCell(5).setCellValue("Test Case Fail");
                bk.write(outFile);
            }
            Thread.sleep(2000);
            close();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        ReadWriteExcelFile oo = new ReadWriteExcelFile();
        oo.test();
    }
}