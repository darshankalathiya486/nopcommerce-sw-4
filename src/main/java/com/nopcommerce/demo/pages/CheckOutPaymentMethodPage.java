package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPaymentMethodPage extends Utility {

    //radio creditCard button
    By creditCard = By.xpath("//label[normalize-space()='Credit Card']");

    //continue
    By continueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    //radio creditCard button
    public void clickCreditCardButton (){
        clickOnElement(creditCard);
    }

    //continue
    public void clickContinueButton (){
        clickOnElement(continueButton);
    }
}
