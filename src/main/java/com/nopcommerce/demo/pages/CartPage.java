package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {

    //Get Text
    By shoppingCart = By.xpath("//h1[text() = 'Shopping cart']");

    //click on box
    By clickOnBox = By.xpath("//td[@class='quantity']//input");

    //clear box
    By clearBox = By.xpath("//td[@class='quantity']//input");

    //send Text
    By addInBox = By.xpath("//td[@class='quantity']//input");

    //click on Button
    By updateShoppingCart = By.xpath("//button[@id='updatecart']");

    //Text total
    By total = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");

    //click checkbox
    By checkBox = By.xpath("//input[@id='termsofservice']");

    //click checkout
    By checkoutClick = By. xpath("//button[@id='checkout']");


    // Get Shopping cart
    public String getShoppingCartText (){
        return getTextFromElement(shoppingCart);
    }

    //click qty box
    public void clickQuantityBox (){
        clickOnElement(clickOnBox);
    }

    // clear box
    public void clearQuantityBox(){
        clearInput(clearBox);
    }

    // send quantity in box
    public void sendQuantityInBox (String Quantity){
        sendTextToElement(addInBox,Quantity);
    }

    // click on update button
    public void clickOnUpdateShoppingCart (){
        clickOnElement(updateShoppingCart);
    }

    // get Text
    public String getTotalText (){
        return getTextFromElement(total);
    }

    // click on checkbox
    public void clickOnCheckBox (){
        clickOnElement(checkBox);
    }

    // click on check out button
    public void clickOnCheckOutButton (){
        clickOnElement(checkoutClick);
    }



}
