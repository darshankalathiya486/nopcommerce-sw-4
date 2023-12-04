package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutCompletedPage extends Utility {

    //Text “Thank You”
    By thankYouText = By.xpath("//h1[normalize-space()='Thank you']");

    //Verify the message “Your order has been successfully processed!”
    By yourOrderHasBeenSuccessFullyProcessed = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");

    //continue
    By continueButton = By.xpath("//button[normalize-space()='Continue']");

    //Text “Thank You”
    public String getThankYouText (){
        return getTextFromElement(thankYouText);
    }

    //Verify the message “Your order has been successfully processed!”
    public String getYourOrderHasBeenSuccessFullyProcessedText (){
        return getTextFromElement(yourOrderHasBeenSuccessFullyProcessed);
    }

    //continue
    public void clickOnContinueButton (){
        clickOnElement(continueButton);
    }


}
