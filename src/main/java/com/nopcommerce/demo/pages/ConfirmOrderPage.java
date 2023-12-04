package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utility {

    //Text “Payment Method” is “Credit Card”
    By paymentMethodIsCreditCard = By.xpath("//li[@class='payment-method']");

    //Text “Shipping Method” is “Next Day Air”
    By shippingMethodIsNextDayAir = By.xpath("//li[@class='shipping-method']");

    //Total “$2,950.00”
    By totalText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");

    //confirm
    By confirmButton = By.xpath("//button[normalize-space()='Confirm']");

    //Text “Payment Method” is “Credit Card”
    public String getPaymentMethodIsCreditCardText (){
        return  getTextFromElement(paymentMethodIsCreditCard);
    }

    //Text “Shipping Method” is “Next Day Air”
    public String getShippingMethodIsNextDayAirText (){
        return getTextFromElement(shippingMethodIsNextDayAir);
    }

    //Total “$2,950.00”
    public String getTotalText (){
        return getTextFromElement(totalText);
    }

    //confirm
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }

}
