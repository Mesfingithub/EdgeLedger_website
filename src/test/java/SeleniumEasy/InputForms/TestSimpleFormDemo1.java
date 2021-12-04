package SeleniumEasy.InputForms;

import libs.Locators;
import libs.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static  org.testng.Assert.*;

public class TestSimpleFormDemo1 extends TestConfig {

    /**
     * Two Test Cases
     * 1. Single Input field
     * 2. Two Input fields
     */

    //Finding the element to be tested
    @BeforeTest
    public void testSetupPage(){
        findBy("XPATH", Locators.HomePage).click();
        findBy("XPATH", Locators.SingleInputForm).click();
    }

    @DataProvider(name="testForSingleForm")
    public Object[][] testDataForSingleForm(){
        return new Object[][]{{"TestCaseOne"},{"TestCaseTwo"},{"TestCaseThree"}};
    }

    @Test(dataProvider = "testForSingleForm")
    public void testSingleInputField(String data)  {
        findBy("XPATH", Locators.SingleField)
                .sendKeys(data);
        findBy("XPATH", Locators.SingleFieldButton).click();
        String message = findBy("XPATH", Locators.SingleTextValue).getText();
        assertEquals(data,message);
        findBy("XPATH",Locators.SingleField).clear();
    }

    @DataProvider(name = "testDataForTwoForm")
    public Object[][] testDataForTwoForm(){
        return new Object[][]{{20,23,"43"},{10,15,"25"},{30,40,"70"}};
    }
    @Test(dataProvider = "testDataForTwoForm")
    public void testTwoInputFields(int sumOne, int sumTwo, String result) throws InterruptedException {
        findBy("XPATH",Locators.TwoFieldsSumOne).sendKeys(String.valueOf(sumOne));
        findBy("XPATH",Locators.TwoFieldSumTwo).sendKeys(String.valueOf(sumTwo));
        findBy("XPATH",Locators.TwoFieldsButton).click();
        String getTotal = findBy("XPATH", Locators.TwoFieldText).getText();
        assertEquals(getTotal, result);
        findBy("XPATH",Locators.TwoFieldsSumOne).clear();
        findBy("XPATH",Locators.TwoFieldSumTwo).clear();
        //Thread.sleep(2000);
    }

    @Test
    public void testTwoInputFieldsNaN() throws InterruptedException {
        //Clear the input box a and b
        findBy("XPATH", "//input[@id=\"sum1\"]").clear();
//        browser.findElement(By.xpath("//input[@id=\"sum1\"]")).clear();
        findBy("XPATH","//input[@id=\"sum2\"]").clear();
//        browser.findElement(By.xpath("//input[@id=\"sum2\"]")).clear();

        findBy("XPATH", "//input[@id=\"sum1\"]").sendKeys("A");
//        browser.findElement(By.xpath("//input[@id=\"sum1\"]")).sendKeys("A");

        findBy("XPATH","//input[@id=\"sum2\"]").sendKeys("B");
//       browser.findElement(By.xpath("//input[@id=\"sum2\"]")).sendKeys("B");

        findBy("XPATH","//form[@id=\"gettotal\"]/button").click();
//        browser.findElement((By.xpath("//form[@id=\"gettotal\"]/button"))).click();
        String getNaNTotal=findBy("XPATH","//span[@id=\"displayvalue\"]").getText();
//        String getNaNTotal = browser.findElement(By.xpath("//span[@id=\"displayvalue\"]")).getText();
        assertEquals(getNaNTotal, "NaN");
        //Thread.sleep(2000);
    }



}