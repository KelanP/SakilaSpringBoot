package com.tsi.kelan.SakilaSpringProject.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class seleniumTest{
    private static final String HOME_URL = "http://localhost:3000/" ;
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup(); //setup chrome driver
        driver = new ChromeDriver(); //start session in chrome
    }
    @After
    public void tearDown() {
        driver.quit(); //quits session after each test
    }


    @Test
    public void randomFilmButtonTest(){

        driver.get("http://localhost:3000/"); //navigates to the URL
        WebElement randButton = driver.findElement(By.id("random-film-button"));

        String originalWindow = driver.getWindowHandle(); //Store the ID of the original window
        assert driver.getWindowHandles().size() == 1; //Check we don't have other windows open already
        randButton.click();

        //Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //sets max wait time of 10 seconds
        wait.until(titleIs("")); //title of random film is a blank JSON page

        String URL = driver.getCurrentUrl();

        Assertions.assertEquals("https://sakilaspringproject-1655722832050.azurewebsites.net/home/film/random", URL, "Incorrect Page");

    }

    @Test
    public void NavBarButtonTest(){
        //Home
        driver.get("http://localhost:3000/");
        driver.findElement(By.xpath("//*[@id='root']/div/nav[1]/div/div/a[1]")).click(); //finding the 'home' button on Navbar using Xpath
        String URlHome = driver.getCurrentUrl();
        Assertions.assertEquals(HOME_URL,URlHome,"Incorrect Page");

        //BrandImage- Home
        driver.findElement(By.className("navbar-brand")).click(); //finding the 'moviezone logo' image on Navbar by finding its classname
        String URLImage = driver.getCurrentUrl();
        Assertions.assertEquals(HOME_URL,URLImage,"Incorrect Page");

        //OurFilms
        driver.findElement(By.cssSelector("#root > div > nav:nth-child(2) > div > div > a:nth-child(2)")).click(); //finding the 'our films' button on Navbar using css selector
        String URLFilms = driver.getCurrentUrl();
        Assertions.assertEquals(HOME_URL+"films",URLFilms,"Incorrect Page");

        //Pricing
        driver.findElement(By.linkText("Pricing")).click(); //finding the 'pricing' button on Navbar using the text in the link
        String URLPricing = driver.getCurrentUrl();
        Assertions.assertEquals(HOME_URL+"pricing",URLPricing,"Incorrect Page");

        //FindUs
        driver.findElement(By.partialLinkText("Find")).click(); //finding the 'find us' button on Navbar using part of the text in the link
        String URLLocation = driver.getCurrentUrl();
        Assertions.assertEquals(HOME_URL+"location",URLLocation,"Incorrect Page");

        //Account: See my rentals
        driver.findElement(By.linkText("Account")).click(); //finding the 'Account' button on Navbar using the text in the link
        driver.findElement(By.id("account-rentals")).click(); //finding the 'See my Rentals' button on Navbar using its ID

        String URLRentals = driver.getCurrentUrl();
        Assertions.assertEquals(HOME_URL+"rentals",URLRentals,"Incorrect Page");

        //Account: Make an account
        driver.findElement(By.linkText("Account")).click(); //finding the 'Account' button on Navbar using the text in the link
        driver.findElement(By.id("account-creation")).click(); //finding the 'See my Rentals' button on Navbar using its ID

        String URLAccount = driver.getCurrentUrl();
        Assertions.assertEquals(HOME_URL+"accountCreation",URLAccount,"Incorrect Page");


    }

    @Test
    public void allFilmsVisibleTest(){
        driver.get("http://localhost:3000/films");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); //wait for table to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/table/tbody/tr[1000]")));
        //for(int i=1;i<1001;i++) { // loop through all table rows to see if displayed
            WebElement tableElement = driver.findElement(By.cssSelector("#root > div > div > div > div.card-body > table > tbody > tr:nth-child(" + 1000 +")" )); //check to see if the 1000th table row is displayed
            boolean isDisplayed = tableElement.isDisplayed();
            Assertions.assertTrue(isDisplayed);
         //}

    }

    @Test
    public void accountCreationTest(){

    }

}
