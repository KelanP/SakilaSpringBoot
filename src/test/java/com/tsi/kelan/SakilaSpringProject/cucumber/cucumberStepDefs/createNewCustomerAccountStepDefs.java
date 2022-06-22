package com.tsi.kelan.SakilaSpringProject.cucumber.cucumberStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class createNewCustomerAccountStepDefs {
    private WebDriver driver;
    @Given("the application is online and running")
    public void the_application_is_online_and_running() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @When("the account creation page is open")
    public void the_account_creation_page_is_open() {
        driver.get("http://localhost:3000/accountCreation");
    }

    @When("the user details are filled in")
    public void the_user_details_are_filled_in() {

        WebElement firstNameBox = driver.findElement(By.id("formBasicFirstName"));
        WebElement lastNameBox = driver.findElement(By.id("formBasicFirstName"));
        WebElement emailBox = driver.findElement(By.id("formBasicFirstName"));
        WebElement passwordBox = driver.findElement(By.id("formBasicFirstName"));

        firstNameBox.sendKeys("John");
        lastNameBox.sendKeys("Valjean");
        emailBox.sendKeys("JValjean@aol.com");
        passwordBox.sendKeys("John24601");


    }

    @Then("the account creation form is submitted")
    public void the_account_creation_form_is_submitted() {
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/button"));
        submit.click();
    }
}
