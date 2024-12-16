package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonActions.CommonFunctions;
import pageObject.Contact_Page_Page_Objects;
import pageObject.Home_Page_Page_Objects;

public class Contact_Page_Input_InvalidDetails extends CommonFunctions {

    @Test
    public void invalidInput() throws InterruptedException {
        PageFactory.initElements(driver, Contact_Page_Page_Objects.class);
        PageFactory.initElements(driver, Home_Page_Page_Objects.class);
        
        Home_Page_Page_Objects.homePageObjects.click();
        Thread.sleep(2000);
        Contact_Page_Page_Objects.contactPageObjects.click();
     
//        scrollAndClick(Contact_Page_Page_Objects.contactPageObjects);
        
        String filePath = "C:\\Users\\sudarbalajim\\Desktop\\Canvendor_Task\\Projects\\Tasks\\Automation code\\Canvendor.com\\CanTest_Website\\CanvendorWebsiteTestData.xlsx";
        File file = new File(filePath);
        FileInputStream fis = null;
        Workbook workbook = null;

        try {
            fis = new FileInputStream(file);
            workbook = new XSSFWorkbook(fis);

            // Accessing the sheet
            Sheet sheet = workbook.getSheet("Sheet1");

            // Reading the name from the seventh row, second column (index 1)
            Row row = sheet.getRow(6);
            if (row != null) {
                Cell cell = row.getCell(1);
                if (cell != null) {
                    String name = cell.getStringCellValue();
                    Thread.sleep(2000);
                    Contact_Page_Page_Objects.inputName.sendKeys(name);
                    Thread.sleep(2000);
                } else {
                    System.out.println("Cell at row 7, column 2 is null.");
                }
            } else {
                System.out.println("Row 7 is null.");
            }

            Row row1 = sheet.getRow(7);
            if (row1 != null) {
                Cell cell1 = row1.getCell(1);
                if (cell1 != null) {
                    String email = cell1.getStringCellValue();
                    Thread.sleep(2000);
                    Contact_Page_Page_Objects.inputEmail.sendKeys(email);
                    Thread.sleep(2000);
                } else {
                    System.out.println("Cell at row 7, column 2 is null.");
                }
            } else {
                System.out.println("Row 7 is null.");
            }
            Row row2 = sheet.getRow(8);
            if (row2 != null) {
                Cell cell2 = row2.getCell(1);
                if (cell2 != null) {
                    String subject = cell2.getStringCellValue();
                    Thread.sleep(2000);
                    Contact_Page_Page_Objects.inputSubject.sendKeys(subject);
                    Thread.sleep(2000);
                } else {
                    System.out.println("Cell at row 7, column 2 is null.");
                }
            } else {
                System.out.println("Row 7 is null.");
            }

            Row row3 = sheet.getRow(9);
            if (row3 != null) {
                Cell cell3 = row3.getCell(1);
                if (cell3 != null) {
                    String message = cell3.getStringCellValue();
                    Thread.sleep(2000);
                    Contact_Page_Page_Objects.inputMessage.sendKeys(message);
                    Thread.sleep(2000);
                } else {
                    System.out.println("Cell at row 7, column 2 is null.");
                }
            } else {
                System.out.println("Row 7 is null.");
            }

            scrollAndClick(Contact_Page_Page_Objects.clickSubmitBtn);
            Thread.sleep(2000);
            scrollAndClick(Contact_Page_Page_Objects.ClickOkayBtn);
            Thread.sleep(2000);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if (workbook != null) {
                    workbook.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void scrollAndClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
}
