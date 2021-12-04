package SeleniumEasy.InputForms;

import libs.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TestSelectDropdownList extends TestConfig {
    public void testSetUpPage() {
        WebElement inputFormPage = browser.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]"));
        inputFormPage.click();
        WebElement radioButtonDemoPage = browser.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[4]/a"));
        radioButtonDemoPage.click();

    }
    @Test
    public void testSelectListDemo(){
        browser.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/select")).click();
        browser.findElement(By.xpath("//option[@value='Sunday']")).click();
        String MessageDaySelectedSunday = browser.findElement(By.xpath("//p[@class='selected-value']")).getText();
        assertEquals(MessageDaySelectedSunday,"Day selected :- Sunday");

    }

   // @Test
    public void testMultiSelectListDemo(){

    }
}
