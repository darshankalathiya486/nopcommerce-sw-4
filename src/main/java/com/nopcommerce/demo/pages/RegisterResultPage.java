package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterResultPage extends Utility {

    //Text “Your registration completed”
    By yourRegistrationCompletedText = By.xpath("//div[@class='result']");

    // click on continue
    By continueButton = By.xpath("//a[normalize-space()='Continue']");





    //Text “Your registration completed”
    public String getYourRegistrationCompletedText (){
        return getTextFromElement(yourRegistrationCompletedText);
    }

    // click on continue
    public void clickOnContinueButton (){
        clickOnElement(continueButton);
    }



}
