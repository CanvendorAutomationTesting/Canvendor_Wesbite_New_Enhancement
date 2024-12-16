package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonActions.CommonFunctions;
import pageObject.About_Page_Page_Objects;
import pageObject.Contact_Page_Page_Objects;
import pageObject.Home_Page_Page_Objects;
import pageObject.Insights_PageObject;

public class Contact_Page_InputDetails extends CommonFunctions {

    Logger logger = Logger.getLogger(Contact_Page_InputDetails.class);

    @Test
    public void contactInput() throws InterruptedException, IOException, InvalidFormatException {

        PageFactory.initElements(driver, Contact_Page_Page_Objects.class);
        clickElement(Contact_Page_Page_Objects.contactPageObjects);
        logger.info("Click Service Page");
        testcase = extentReport.createTest("Input the details in all fields");

        Thread.sleep(2000);
        logger.info("Enter the name");
        String filePath = "C:\\Users\\sudarbalajim\\Desktop\\Canvendor_Task\\Projects\\Tasks\\Automation code\\Canvendor.com\\CanTest_Website\\CanvendorWebsiteTestData.xlsx";
        File file = new File(filePath);
        FileInputStream fis = null;
        Workbook workbook = null;

        try {
            fis = new FileInputStream(file);
            workbook = new XSSFWorkbook(fis);

            // Accessing the sheet
            Sheet sheet = workbook.getSheet("Sheet1");

            // Reading the name from the second row, second column (index 1)
            Row row = sheet.getRow(1);
            if (row != null) {
                Cell cell = row.getCell(1);
                if (cell != null) {
                    String name = cell.getStringCellValue();
                    Thread.sleep(2000);
                    Contact_Page_Page_Objects.inputName.sendKeys(name);
                    Thread.sleep(2000);
                } else {
                    System.out.println("Cell at row 1, column 1 is null.");
                }
                Row row1 = sheet.getRow(2);
                // Reading the email from the second row, third column (index 2)
                Cell cell2 = row1.getCell(1);
                if (cell2 != null) {
                    String email = cell2.getStringCellValue();
                    Thread.sleep(2000);
                    Contact_Page_Page_Objects.inputEmail.sendKeys(email);
                    Thread.sleep(2000);
                } else {
                    System.out.println("Cell at row 2, column 1 is null.");
                }
            } else {
                System.out.println("Row 2 is null.");
            }

            Row row2 = sheet.getRow(3);
            if (row2 != null) {
                Cell cell3 = row2.getCell(1);
                if (cell3 != null) {
                    String subject = cell3.getStringCellValue();
                    Thread.sleep(2000);
                    Contact_Page_Page_Objects.inputSubject.sendKeys(subject);
                    Thread.sleep(2000);
                } else {
                    System.out.println("Cell at row 3, column 1 is null.");
                }
            } else {
                System.out.println("Row 3 is null.");
            }

            Row row3 = sheet.getRow(4);
            if (row3 != null) {
                Cell cell4 = row3.getCell(1);
                if (cell4 != null) {
                    String message = cell4.getStringCellValue();
                    Thread.sleep(2000);
                    Contact_Page_Page_Objects.inputMessage.sendKeys(message);
                    Thread.sleep(2000);
                } else {
                    System.out.println("Cell at row 4, column 1 is null.");
                }
            } else {
                System.out.println("Row 4 is null.");
            }

            scrollAndClick(Contact_Page_Page_Objects.clickSubmitBtn);
            Thread.sleep(2000);
            scrollAndClick(Contact_Page_Page_Objects.ClickOkayBtn);
            Thread.sleep(2000);
//            PageFactory.initElements(driver, Home_Page_Page_Objects.class);
//            clickElement(Home_Page_Page_Objects.homePageObjects);
//            scrollAndClick(Insights_PageObject.ClickInsights);
//            Thread.sleep(2000);
//            scrollAndClick(Insights_PageObject.clickTopBtn);

//            clickElement(About_Page_Page_Objects.aboutPageObjects);
//            Thread.sleep(1000);
//            clickElement(Home_Page_Page_Objects.homePageObjects);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
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

    private void clickElement(WebElement element) {
        if (element != null) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        } else {
            logger.error("Element is null, cannot click.");
        }
    }

    private void scrollAndClick(WebElement element) {
        if (element != null) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        } else {
            logger.error("Element is null, cannot scroll and click.");
        }
   
    }
}
