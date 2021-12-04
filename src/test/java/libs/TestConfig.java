package libs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestConfig {

    /**
     * 1. Web driver
     */

    public static WebDriver browser;

    @BeforeSuite
    public void testSuitSetup() throws InterruptedException {
        browser = new ChromeDriver();
        browser.get("https://demo.seleniumeasy.com/");
        browser.manage().window().maximize();
        Thread.sleep(2000);
// TODO
//  Add Dynamic wait time
//  Add more choice from browsers
        browser.findElement(By.linkText("No, thanks!")).click();
    }

    public WebElement findBy(String elementType, String element){
        WebElement locator = null;
        if (elementType.equals("XPATH")){
            return   locator =  browser.findElement(By.xpath(element));
        }
        else  if(elementType.equals("ID")){
            return   locator  = browser.findElement(By.id(element));
        }

        return null;

    }

    @AfterSuite
    public  void testCleanUp(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        browser.quit();
    }


}