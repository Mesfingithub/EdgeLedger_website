package SeleniumEasy.InputForms;

import libs.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestSimpleFormDemo extends TestConfig {
    /**
     * Two Test Cases
     * 1. Single Input field
     * 2.Two Input field
     *
     */
 @BeforeTest
 public void testSetUpPage(){
     WebElement inputFormPage =
             browser.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]"));
     inputFormPage.click();

     WebElement simpleFormPage =
             browser.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a"));
     simpleFormPage.click();
 }

    @Test
    public void testSingleInputField() throws InterruptedException {
      browser.findElement(By.xpath("//input[@id=\"user-message\"]")).sendKeys("TestCaseOne");
      browser.findElement(By.xpath("//form[@id=\"get-input\"]/button")).click();
      String message=
              browser.findElement(By.xpath("//span[@id=\"display\"]")).getText();
        assertEquals("TestCaseOne", message);



      //  browser.quit();

    }
    @Test
    public void testTwoInputField(){
     browser.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");
     browser.findElement(By.xpath("//input[@id='sum2']")).sendKeys("20");
     browser.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();

     String GetTotal = browser.findElement(By.xpath("//span[@id='displayvalue']")).getText();
     assertEquals("30",GetTotal);

    }
    @Test
    public void testTwoInputFieldWithNegativeTestCase(){
        browser.findElement(By.xpath("//input[@id='sum1']")).clear();
        browser.findElement(By.xpath("//input[@id='sum2']")).clear();
        browser.findElement(By.xpath("//input[@id='sum1']")).sendKeys("A");
        browser.findElement(By.xpath("//input[@id='sum2']")).sendKeys("B");
        browser.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
        String GetTotalNegativeTestValue = browser.findElement(By.xpath("//span[@id='displayvalue']")).getText();
        assertEquals(GetTotalNegativeTestValue,"NaN");


    }
}
