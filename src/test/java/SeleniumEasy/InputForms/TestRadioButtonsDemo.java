package SeleniumEasy.InputForms;

import libs.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestRadioButtonsDemo extends TestConfig {
    @BeforeTest
    public void testSetUpPage() {
        WebElement inputFormPage = browser.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]"));
        inputFormPage.click();
        WebElement radioButtonDemoPage = browser.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[3]/a"));
        radioButtonDemoPage.click();

    }
    @Test
    public void testRadioButtonDemo(){
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input")).click();
        browser.findElement(By.xpath("//button[@id='buttoncheck']")).click();
        String MessageCheckedValueMale = browser.findElement(By.xpath("//p[@class='radiobutton']")).getText();
        assertEquals(MessageCheckedValueMale,"Radio button 'Male' is checked");

        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input")).click();
        browser.findElement(By.xpath("//button[@id='buttoncheck']")).click();
        String MessageCheckedValueFemale = browser.findElement(By.xpath("//p[@class='radiobutton']")).getText();
        assertEquals(MessageCheckedValueFemale,"Radio button 'Female' is checked");

    }
    @Test
    public void testGroupRadioButtonsDemo(){
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input")).click();
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]/input")).click();
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
        String MessageGetValueForMale0To5 = browser.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
        assertEquals(MessageGetValueForMale0To5,"Sex : Male\n" + "Age group: 0 - 5");

        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input")).click();
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[2]/input")).click();
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
        String MessageGetValueForMale5To15 = browser.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
        assertEquals(MessageGetValueForMale5To15,"Sex : Male\n" + "Age group: 5 - 15");

        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input")).click();
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[3]/input")).click();
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
        String MessageGetValueForMale15To50 = browser.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
        assertEquals(MessageGetValueForMale15To50,"Sex : Male\n" + "Age group: 15 - 50");

        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input")).click();
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[1]/input")).click();
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
        String MessageGetValueForFemale0To5 = browser.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
        assertEquals(MessageGetValueForFemale0To5,"Sex : Female\n" + "Age group: 0 - 5");

        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input")).click();
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[2]/input")).click();
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
        String MessageGetValueForFemale5To15 = browser.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
        assertEquals(MessageGetValueForFemale5To15,"Sex : Female\n" + "Age group: 5 - 15");

        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input")).click();
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[3]/input")).click();
        browser.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
        String MessageGetValueForFemale15To50 = browser.findElement(By.xpath("//p[@class='groupradiobutton']")).getText();
        assertEquals(MessageGetValueForFemale15To50,"Sex : Female\n" + "Age group: 15 - 50");

    }
}
