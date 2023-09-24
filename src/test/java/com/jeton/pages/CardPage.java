package com.jeton.pages;

import com.jeton.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardPage {

    public CardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(xpath = "(//li[@class='menu-selector jetoncard']/a/span)[1]")
    public WebElement jetonCardButton;

   @FindBy(xpath = "//img[@alt='physical credit card image']")
    public WebElement physicalCard;

   @FindBy( id ="activate-card")
   public WebElement activeCardBtn;

    // @FindBy(xpath = "//a[@class='CardSettings-menu-selector-link virtual']")
    // public WebElement virtualCardBtn;

   // @FindBy( id = "getVirtualCard")
   // public WebElement getVirtualCardBtn;

   // @FindBy( xpath = "//button[@type='submit']")
   // public WebElement createYourCard;








}
