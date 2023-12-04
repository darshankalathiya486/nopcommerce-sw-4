package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutGuestPage extends Utility {

    //Text “Welcome, Please Sign In!”
    By welcomePleaseSignIn = By.xpath("//h1[text()= 'Welcome, Please Sign In!']");

    //click on Guest
    By checkOutButton = By.xpath("//button[normalize-space()='Checkout as Guest']");

    //click on Register tab
    By registerButton = By.xpath("//button[normalize-space()='Register']");

    // Get text “Welcome, Please Sign In!”
    public String getWelcomePleaseSignInText (){
        return getTextFromElement(welcomePleaseSignIn);
    }

    //click on gust button
    public void clickOnCheckOutButton (){
        clickOnElement(checkOutButton);
    }

    //click on Register tab
    public void clickOnRegisterTab (){
        clickOnElement(registerButton);
    }





    }




