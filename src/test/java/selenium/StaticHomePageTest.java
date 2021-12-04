package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class StaticHomePageTest {

    WebDriver driver;
    String webSiteName = "https://websitesdemos-4baf7.web.app/";

    @BeforeTest
    public void testSetUp() {

        driver = new ChromeDriver();
    }


    // 1.Open the browser and website
    // 2. MetaData from website (URL, Head)
    // 3. Navigate method
    // 4. Normal element html-event
    // 5. Close browser


    /**
     * Test scenario : 1 = Open the Website and verify the Home page contents
     * Test Case 1 = Open Browser and enter website name
     * Test Case 2 = verify the website url and title name
     * Test Three3 = Verify the html body with id as a name;
     */

    @Test
    public void openWebpage() throws InterruptedException {
        driver.get(webSiteName);
        driver.navigate().refresh();//refresh the page
        Thread.sleep(2000);

        // driver.navigate().to("http://google.com");
        // driver.close // close the current page/tab/Window
        // driver.quit(); // quit the whole program
    }

    @Test
    public void verifyUrlAndTitle(){
        String UrlName = driver.getCurrentUrl();
        assertEquals(UrlName,"https://websitesdemos-4baf7.web.app/#about");

        String titleName = driver.getTitle();
        assertEquals(titleName,"Welcome to EdgeLedger");

        String id = driver.findElement(By.xpath("//*[@id=\"home\"]")).getTagName();
        assertEquals(id, "body");


    }

    /**
     * Test scenario 2: Verify the landing page with image and button
     * Test Case 1 = locate an image and verify the image locator
     * Test Case 2 = Verify the home page welcome text
     * Test Case 3 = verify the button and upon click Read More Section
     *
     */

    @Test
    public void validateLandingPage(){
        boolean logo = driver.findElement(By.xpath("//i[@class='fas fa-book-open']")).isDisplayed();
//        System.out.println(logo);
        assertEquals(logo, true);
        String actualText = driver.findElement(By.xpath("//h1[@class='logo']")).getText();
        String expectedText="EdgeLedger";
        assertEquals(actualText, expectedText);
        boolean link = driver.findElement(By.linkText("Read More")).isDisplayed();
        assertEquals(link, true);
        String buttonActualText = driver.findElement(By.linkText("Read More")).getText();
        String expectedButtonText = "Read More";
        assertEquals(buttonActualText, expectedButtonText);

        WebElement clickFun = driver.findElement(By.linkText("Read More"));
        try{
            clickFun.click();
            String url = driver.getCurrentUrl();
            System.out.println(url);
            assertEquals(url,"https://websitesdemos-4baf7.web.app/#about");
        }catch (WebDriverException e){
            System.out.println("is not clickable");
        }
    }

    /**
     * Test scenario 3: Verify - Home, About, Cases, Blod, Contact on WebPage Nav
       * Test Case 1: Verify Home Link on its presents and its clicking
       * Test Case 2: Verify About Link on its presents and its clicking
       * Test Case 3: Verify Cases Link on its presents and its clicking
       * Test Case 4: Verify Blod Link on its presents and its clicking
       * Test Case 5: Verify Contact Link on its presents and its clicking
     */

    @Test
    public void validateHomeLink(){
        boolean homePage = driver.findElement(By.xpath("//a[@href='#home']")).isDisplayed();
        assertEquals(homePage, true);
        WebElement homeLink = driver.findElement(By.linkText("Home"));
        try{
            homeLink.click();
            String homeLinkUrl = driver.getCurrentUrl();
            assertEquals(homeLinkUrl, "https://websitesdemos-4baf7.web.app/#home");
        }catch (WebDriverException e){
            System.out.println("no clickable!");
        }
    }


    @Test
    public void validateAboutLink(){
        boolean aboutPage = driver.findElement(By.xpath("//a[@href='#about']")).isDisplayed();
        assertEquals(aboutPage, true);
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        try{
            aboutLink.click();
            String aboutLinkUrl = driver.getCurrentUrl();
            assertEquals(aboutLinkUrl, "https://websitesdemos-4baf7.web.app/#about");
        }catch (WebDriverException e){
            System.out.println("no clickable!");
        }
    }

    @Test
    public void validateCasesLink(){
        boolean casesPage = driver.findElement(By.xpath("//a[@href='#cases']")).isDisplayed();
        assertEquals(casesPage, true);
        WebElement casesLink = driver.findElement(By.linkText("Cases"));
        try{
            casesLink.click();
            String casesLinkUrl = driver.getCurrentUrl();
            assertEquals(casesLinkUrl, "https://websitesdemos-4baf7.web.app/#cases");
        }catch (WebDriverException e){
            System.out.println("no clickable!");
        }
    }

    @Test
    public void validateBlodLink(){
        boolean blodPage = driver.findElement(By.xpath("//a[@href='#blog']")).isDisplayed();
        assertEquals(blodPage, true);
        WebElement blodLink = driver.findElement(By.linkText("Blod"));
        try{
            blodLink.click();
            String blodLinkUrl = driver.getCurrentUrl();
            assertEquals(blodLinkUrl, "https://websitesdemos-4baf7.web.app/#blog");
        }catch (WebDriverException e){
            System.out.println("no clickable!");
        }
    }


    @Test
    public void validateContactLink(){
        boolean contactPage = driver.findElement(By.xpath("//a[@href='#contact']")).isDisplayed();
        assertEquals(contactPage, true);
        WebElement contactLink = driver.findElement(By.linkText("Contact"));
        try{
            contactLink.click();
            String contactLinkUrl = driver.getCurrentUrl();
            assertEquals(contactLinkUrl, "https://websitesdemos-4baf7.web.app/#contact");
        }catch (WebDriverException e){
            System.out.println("no clickable!");
        }
    }

    /**
     Test scenario 4: Verify Home Page Main Text & sub text on its presents and spelling
       *Test Case 1: Verify the Text - 'The Sky Is The Limit'
       *Test Case 2: Verify the Text - 'We provide world class financial assistance'
     */

    @Test
    public  void testMainText() {
        String mainText = driver.findElement(By.xpath("//*[contains(text(),'The Sky Is The Limit')]")).getText();
        assertEquals(mainText, "The Sky Is The Limit");
        System.out.println(mainText);
        boolean textAvaliability = driver.findElement(By.xpath("//*[contains(text(),'The Sky Is The Limit')]")).isDisplayed();
        assertEquals(textAvaliability, true);

        String subText = driver.findElement(By.xpath("//*[contains(text(),'We provide world class financial assistance')]")).getText();
        assertEquals(subText, "We provide world class financial assistance");
        System.out.println(subText);
        boolean subTextAvaliablity = driver.findElement(By.xpath("//*[contains(text(),'We provide world class financial assistance')]")).isDisplayed();
        assertEquals(subTextAvaliablity, true);

    }

        /**
         * Test scenario 5 : verify About webpage icons, main & sub text
            *Test case 1: verify main text 'Investment Banking' & its represented icon.
            *Test case 2: verify main text 'Portfolio Manager' & its represented icon.
            *Test case 3: verify main text 'Tax & Custodial' & its represented icon.
         *
         */
        @Test
        public void validateAboutTextAndIcon(){
            boolean invBankingIcon = driver.findElement(By.cssSelector(".fas.fa-university.fa-2x")).isDisplayed();
            assertEquals(invBankingIcon,true);
            String invBankMainText = driver.findElement(By.xpath("//*[contains(text(),'Investment Banking')]")).getText();
            assertEquals(invBankMainText,"Investment Banking");
            String invBankinSubText = driver.findElement(By.xpath("//*[@id=\"about\"]/div/div[1]/div/p")).getText();
            String expecBankingSubText = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Nihil, eveniet.";
            assertEquals(invBankinSubText,expecBankingSubText);

            boolean portMgrIcon = driver.findElement(By.cssSelector(".fas.fa-book-reader.fa-2x")).isDisplayed();
            assertEquals(portMgrIcon,true);
            String proMgrMainText = driver.findElement(By.xpath("//*[contains(text(),'Portfolio Manager')]")).getText();
            assertEquals(proMgrMainText, "Portfolio Manager");
            String proMgrSubText = driver.findElement(By.xpath("//*[@id=\"about\"]/div/div[2]/div/p")).getText();
            String expectedProMrgSubText = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Nihil, eveniet.";
            assertEquals(proMgrSubText,expectedProMrgSubText);

            boolean taxAndCustoPiture = driver.findElement(By.cssSelector(".fas.fa-pencil-alt.fa-2x")).isDisplayed();
            assertEquals(taxAndCustoPiture, true);
            String taxAndCustoMainText = driver.findElement(By.xpath("//*[contains(text(),'Tax & Custodial')]")).getText();
            assertEquals(taxAndCustoMainText,"Tax & Custodial");
            String taxAndCustoSubText = driver.findElement(By.xpath("//*[@id=\"about\"]/div/div[3]/div/p")).getText();
            String expectedTaxAndCustoSubText = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Nihil, eveniet.";
            assertEquals(taxAndCustoSubText,expectedTaxAndCustoSubText);

        }

    /** Test scenario 6 : verify cases pages and its content
         *  Test case 1: verify main text
         *  Test case 2: verify sub texts
         *  Test case 3: verify all images
         *
     *
     */

    @Test
    public void verifyCasesTextAndImages(){
        String casesMainText = driver.findElement(By.xpath("//*[@id=\"cases\"]/header/h2")).getText();
        String expectedMainText = "Business Cases";
        assertEquals(casesMainText, expectedMainText);

        boolean casesImage = driver.findElement(By.xpath("//*[@id=\"cases\"]/div/div[1]/img[1]")).isDisplayed();
        assertEquals(casesImage, true);
    }


    /** Test scenario 7 : verify Blog text,date, button and pictures
        *Test case 1: verify  the main text 'Blog Post 1'
        *Test case 2: verify date  'May 21 2020'
        *Test case 3: verify button 'Read our blog'
        *Test case 4: verify all pictures
     *
     */

    /** Test scenario 8: verify and validate contact inputs & image
        *Test case 1: verify inputbox: Enter Name,Enter Email, Enter Phone & Send button
        *Test case 2: verify picture
        *Test case 3:
     *
     */

    @Test
    public void verifyAndValidateContactInputBox(){
        boolean inputNamedisplayed = driver.findElement(By.xpath("//input[@id='name']")).isDisplayed();
        assertEquals(inputNamedisplayed, true);
        WebElement enterName = driver.findElement(By.xpath("//input[@id='name']"));
        enterName.sendKeys("Alemaz");

        boolean inputEmailDisplayed = driver.findElement(By.xpath("//input[@id='email']")).isDisplayed();
        assertEquals(inputEmailDisplayed, true);
        WebElement enterEmail = driver.findElement(By.xpath("//input[@id='email']"));
        enterEmail.sendKeys("Almaz@gmail.com");

        boolean inputPhoneDisplayed =driver.findElement(By.xpath("//input[@id='phone']")).isDisplayed();
        assertEquals(inputPhoneDisplayed, true);
        WebElement enterPhone = driver.findElement(By.xpath("//input[@id='phone']"));
        enterPhone.sendKeys("202-000-00-00");

        boolean buttonSendDisplayed = driver.findElement(By.xpath("//input[@id='submit']")).isDisplayed();
        assertEquals(buttonSendDisplayed, true);
        WebElement sendButton = driver.findElement(By.xpath("//input[@id='submit']"));
        sendButton.click();


    }

    /**Test scenario 9: verify footer picture and text
        *Test case 1: verify text 'Copyright © 2020 - EdgeLedger'
        *Test case 2: verify footer picture facebook 'fab fa-facebook fa-2x'
        *Test case 3: verify footer picture twitter 'fab fa-twitter fa-2x'
        *Test case 4: verify footer picture youtube 'fab fa-youtube fa-2x'
        *Test case 5: verify footer picture linkedIn 'fab fa-linkedin fa-2x'
     *
     */

    @Test
    public void verifyFooters(){
        boolean copyRightTextPresence = driver.findElement(By.xpath("//*[@id=\"home\"]/footer/p")).isDisplayed();
        assertEquals(copyRightTextPresence, true);
        String copyRightText = driver.findElement(By.xpath("//*[@id=\"home\"]/footer/p")).getText();
        assertEquals(copyRightText,"Copyright © 2020 - EdgeLedger");

        boolean faceBookbIcon = driver.findElement(By.xpath("//i[@class='fab fa-facebook fa-2x']")).isDisplayed();
        assertEquals(faceBookbIcon, true);

        boolean twitterIcon = driver.findElement(By.xpath("//i[@class='fab fa-twitter fa-2x']")).isDisplayed();
        assertEquals(twitterIcon, true);

        boolean youTubeIcon = driver.findElement(By.cssSelector("i[class='fab fa-youtube fa-2x']")).isDisplayed();
        assertEquals(youTubeIcon, true);

        boolean  linkedInIcon = driver.findElement(By.cssSelector(".fab.fa-linkedin.fa-2x")).isDisplayed();
        assertEquals(linkedInIcon, true);

    }




    @AfterTest
    public void testCleanUp() throws InterruptedException {
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        Thread.sleep(2000);
        driver.quit();
    }
}