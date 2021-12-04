package SeleniumEasy.InputForms;

import libs.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestCheckboxDemo extends TestConfig {
    @BeforeTest
    public void testSetUpPage() {
        WebElement inputFormPage = browser.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]"));
        inputFormPage.click();
        WebElement checkboxDemoPage = browser.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[2]/a"));
        checkboxDemoPage.click();

    }
    @Test
    public void testSingleCheckboxDemo(){
        browser.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
        String SuccessMessage = browser.findElement(By.xpath("//div[@id='txtAge']")).getText();
        assertEquals(SuccessMessage,"Success - Check box is checked");

    }
    @Test
    public void testMultipleCheckboxDemo() throws InterruptedException {
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label/input")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[3]/label/input")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[4]/label/input")).click();

//        browser.findElement(By.xpath("//input[@id='check1']")).clear();
        browser.findElement(By.xpath("//input[@id='check1']")).click();
        Thread.sleep(2000);
        boolean CheckAllBoxButton = browser.findElement(By.xpath("//input[@id='check1']")).isEnabled();
        assertEquals(CheckAllBoxButton, true);
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"check1\"]")).click();
        Thread.sleep(2000);
        boolean UncheckAllButton = browser.findElement(By.xpath("//*[@id=\"check1\"]")).isEnabled();
        assertEquals(UncheckAllButton,true);



    }
}
