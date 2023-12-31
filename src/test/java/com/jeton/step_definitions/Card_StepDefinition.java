package com.jeton.step_definitions;

import com.jeton.pages.CardPage;
import com.jeton.pages.RegisterPage;
import com.jeton.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Card_StepDefinition {

    WebDriver driver = Driver.getDriver();
    CardPage cardPage = new CardPage();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @Given("user is on the Jeton home web page")
    public void user_is_on_the_jeton_home_web_page() {


    }
    @When("user clicks JetonCard button")
    public void user_clicks_jeton_card_button() {

    }
/*
    @And("user clicks Virtual Card button")
    public void userClicksVirtualCardButton() {

    }

    @And("user clicks Get Your Card button")
    public void userClicksGetYourCardButton() {


    }

 */
    @And("user clicks Physical Card button")
    public void userClicksPhysicalCardButton() {

     }
    @And("user clicks order a physical card button")
    public void userClicksOrderAPhysicalCardButton() {
    }
    @When("user click continue button")
    public void user_click_continue_button() {

    }
    @When("user click privacy policy")
    public void user_click_privacy_policy() {

    }
    @When("user click complete order button")
    public void user_click_complete_order_button() {

    }

}
