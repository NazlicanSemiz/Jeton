package com.jeton.pages;

import com.jeton.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Sign up for free']")
    public WebElement signUpForFree;

    @FindBy(xpath = "//div[@role='combobox']")
    public WebElement countryCode;

    @FindBy(xpath = "//input[@placeholder='Search For Country']")
    public WebElement countrySearch;

    @FindBy(xpath = "(//div[@class='jl-phone-dropdown-item'])[2]")
    public WebElement selectedCountry;

    @FindBy(xpath = "//input[@placeholder='Phone Number']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@placeholder='E-mail Address ']")
    public WebElement email;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Date of Birth']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signUpButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement warningMessageBox;

    @FindBy(xpath = "//a[.='Log in here']")
    public WebElement logInHereLink;

    @FindBy(id = "vCode")
    public WebElement OTPCode;

    @FindBy(xpath = "//div[@role='combobox']")
    public WebElement countrySelect;

    @FindBy(xpath = "//a[@class='dropdown-item selected ng-star-inserted']")
    public WebElement unitedKingdom;

    @FindBy(xpath = "//input[@placeholder='Address']")
    public WebElement address;

    @FindBy(xpath = "//input[@placeholder='City']")
    public WebElement city;

    @FindBy(xpath = "//input[@placeholder='Postal Code']")
    public WebElement postalCode;

    @FindBy( id ="termsbox")
    public WebElement agreeBtn;

    @FindBy( xpath = "//span[@class='ng-star-inserted']" )
    public WebElement goToWallet;


}
