package SeleniumEasy.InputForms;

import libs.Locators;
import libs.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCheckboxDemo1 extends TestConfig {
    private Locators CheckboxPage;


    @BeforeTest
    public void testSetupPage(){
        findBy("XPATH", Locators.HomePage).click();
        findBy("XPATH", Locators.CheckboxDemo).click();
    }


    @Test
    public void SelectSingleCheckboxDemo(){
        findBy("XPATH", Locators.SingleCheckbox).click();
        String SuccessMessage = findBy("XPATH", Locators.FirstCheckboxMessage).getText();
        assertEquals(SuccessMessage,"Success - Check box is checked");
        findBy("XPATH", Locators.UncheckAllCheckbox).click();

    }

    @Test
    public void SelectingMultipleCheckBox() throws InterruptedException {
        browser.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        for (int i=2;i<6;i++){
            browser.findElement(By.xpath("("+CheckboxPage.multipleCheckBox+")["+i+"]")).click();
            Thread.sleep(1000);
        }
       // browser.close();
    }

}

