package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutShippingMethodPage extends Utility {

    //click on Radio
    By radioButton = By.xpath("//div[@class='method-name']//label[text() = 'Next Day Air ($0.00)']");

    // click on continue
    By continueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");


    //click on Radio
    public void clickOnRadioButton(){
        clickOnElement(radioButton);
    }

    // click on continue
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

}
