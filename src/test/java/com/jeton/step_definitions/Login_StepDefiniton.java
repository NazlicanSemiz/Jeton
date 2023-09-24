package com.jeton.step_definitions;

import com.jeton.pages.LoginPage;
import com.jeton.pages.RegisterPage;
import com.jeton.utilities.BrowserUtils;
import com.jeton.utilities.ConfigurationReader;
import com.jeton.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_StepDefiniton {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("user is on the Jeton web page")
    public void user_is_on_the_jeton_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(20);
    }
    @When("User enters the phone number {string}")
    public void user_enters_the_phone_number(String string) {
        loginPage.phoneNumberOption.click();
        loginPage.phoneNumberOption.sendKeys(string);
    }
    @When("User enters the password {string}")
    public void user_enters_the_password(String string) {
        loginPage.password.click();
        loginPage.password.sendKeys(string);
    }
    @When("User enters the email {string}")
    public void user_enters_the_email(String string) {
        loginPage.email.click();
        loginPage.email.sendKeys(string);
    }

    @Then("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
     //   if(LoginPage.warningMessageBox.isDisplayed()){
       //     loginPage.logInHereLink.click();
        }


    @Then("User enters the OTP Code {string}")
    public void userEntersTheOTPCode(String string) {

        loginPage.OTPCode.click();
        loginPage.OTPCode.sendKeys(string);
    }

    @And("User selects User ID tab")
    public void userSelectsUserIDTab() {

        loginPage.userIdOrEmailOption.click();
    }
}

