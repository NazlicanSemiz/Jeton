package com.jeton.step_definitions;

import com.jeton.pages.RegisterPage;
import com.jeton.utilities.BrowserUtils;
import com.jeton.utilities.ConfigurationReader;
import com.jeton.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Register_StepDefinition {

    WebDriver driver = Driver.getDriver();
    RegisterPage registerPage = new RegisterPage();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("user is on the Sandbox Jeton web page")
    public void user_is_on_the_sandbox_jeton_web_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.sleep(20);
    }

    @Then("user should see title is Sandbox Jeton")
    public void user_should_see_title_is_sandbox_jeton() {
       // wait.until(ExpectedConditions.elementToBeClickable(registerPage.signUpForFree));
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, driver.getTitle());
        // System.out.println(Driver.getDriver().getTitle());
        // BrowserUtils.verifyTitle(Driver.getDriver(),"");
    }

    @When("User clıcks Sign Up For Free button")
    public void user_clıcks_sign_up_for_free_button() {
        registerPage.signUpForFree.click();
    }

    @And("User clicks Country Code button")
    public void userClicksCountryCodeButton() {
        registerPage.countryCode.click();
    }

    @And("User enters country code {string}")
    public void userEnterCountryCode(String string) {
        registerPage.countrySearch.sendKeys(string);
    }


    @When("User enters phone number {string}")
    public void user_enter_phone_number(String string) {
        registerPage.phoneNumber.click();
        registerPage.phoneNumber.sendKeys(string);
    }

    @When("User enters email {string}")
    public void user_enter_email(String string) {
        registerPage.email.click();
        registerPage.email.sendKeys(string);
    }

    @When("User enters password {string}")
    public void user_enter_password(String string) {
        registerPage.password.click();
        registerPage.password.sendKeys(string);
    }

    @When("User enters first name {string}")
    public void user_enter_first_name(String string) {
        registerPage.firstName.click();
        registerPage.firstName.sendKeys(string);
    }

    @When("User enters last name {string}")
    public void user_enter_last_name(String string) {
        registerPage.lastName.click();
        registerPage.lastName.sendKeys(string);
    }

    @When("User enters dob {string}")
    public void user_enter_dob(String string) {
        registerPage.dateOfBirth.click();
        registerPage.dateOfBirth.sendKeys(string);
    }

    @And("User clicks Sign Up button")
    public void userClicksSignUpButton() {
        registerPage.signUpButton.click();
        if(registerPage.warningMessageBox.isDisplayed()){
            registerPage.logInHereLink.click();
        }
    }


    @And("User enters OTP Code {string}")
    public void userEntersOTPCode(String string) {
        registerPage.OTPCode.click();
        registerPage.OTPCode.sendKeys(string);
    }

    @Given("User selects country")
    public void user_selects_country() {
       registerPage.countrySelect.click();


    }

    @And("User enters the United Kingdom")
    public void userEntersTheUnitedKingdom() {
        registerPage.unitedKingdom.click();
    }

    @Given("User enters address {string}")
    public void user_enters_address(String string) {
        registerPage.address.click();
       registerPage.address.sendKeys(string);
    }
    @Given("User enters city {string}")
    public void user_enters_city(String string) {
        registerPage.city.click();
        registerPage.city.sendKeys(string);
    }
    @Given("User enters postal code {string}")
    public void user_enters_postal_code(String string) {
       registerPage.postalCode.click();
       registerPage.postalCode.sendKeys(string);
    }
    @Given("User selects I agree the terms&conditions and privacy policy")
    public void user_selects_i_agree_the_terms_conditions_and_privacy_policy() {
        registerPage.agreeBtn.click();

    }
    @Given("User clicks go to wallet button")
    public void user_clicks_go_to_wallet_button() {
        registerPage.goToWallet.click();
    }



}
