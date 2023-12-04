package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class MobilesCartPage extends Utility {

    //Text "Shopping cart"
    By shoppingCart = By.xpath("//h1[text() = 'Shopping cart']");

    // Verify quantity is 2
    By quantityCheck = By.xpath("//input[@class ='qty-input']");


    //Verify the Total $698.00
    By priseTotal = By.xpath("//span[text() ='$698.00']");

    //click on checkbox
    By checkBox = By.xpath("//input[@id='termsofservice']");

    //click on check out
    By checkOut = By.xpath("//button[@id='checkout']");



    //Text "Shopping cart"
    public String getShoppingCart (){
        return getTextFromElement(shoppingCart);
    }

    // Verify quantity is 2
    public String getQuantity(){
        return getAttributeFromElement(quantityCheck,"value");
    }

    //Verify the Total $698.00
    public String getTotalText (){
        return getTextFromElement(priseTotal);
    }

    //click on checkbox
    public void clickOnCheckBox(){
        clickOnElement(checkBox);
    }

    //click on check out
    public void clickOnCheckOutButton (){
        clickOnElement(checkOut);
    }









}
