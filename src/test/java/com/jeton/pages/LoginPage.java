package com.jeton.pages;

import com.jeton.utilities.Driver;
import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class=\"menu-link border-none font-14\"]")
    public WebElement loginBtn;

    @FindBy(xpath = "//li[.=' Phone Number ']")
    public WebElement phoneNumberOption;

    @FindBy(xpath = "//li[.=' UserID or E-mail ']")
    public WebElement userIdOrEmailOption;

    @FindBy(xpath = "//div[@role='combobox']")
    public WebElement countryCode;

    @FindBy(xpath = "//input[@placeholder='Search For Country']")
    public WebElement countrySearch;

    @FindBy(xpath = "(//div[@class='jl-phone-dropdown-item'])[2]")
    public WebElement selectedCountry;

    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    public WebElement phoneNumber;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(name = "userId")
    public WebElement email;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(id = "vCode")
    public WebElement OTPCode;





}
