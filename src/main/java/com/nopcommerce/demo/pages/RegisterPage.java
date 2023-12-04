package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    // Text “Register”
    By registerText = By.xpath("//h1[normalize-space()='Register']");

    // Add First name
    By firstName = By.xpath("//input[@id='FirstName']");

    // Add Last name
    By lastName = By.xpath("//input[@id='LastName']");

    // Add email
    By emailText = By.xpath("//input[@id='Email']");

    // Add Password
    By passwordText = By.xpath("//input[@id='Password']");

    // confirm password
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");

    //Click on “REGISTER” Button
    By registerButton = By.xpath("//button[@id='register-button']");




    // Text “Register”
    public String getRegisterText (){
        return getTextFromElement(registerText);
    }

    // Add First name
    public void addFirstName (String name) {
        sendTextToElement(firstName, name);
    }

    // Add Last name
    public void addLastName(String name){
        sendTextToElement(lastName,name);
    }

    // Add email
    public void addEmail(String email){
        sendTextToElement(emailText,email);
    }

    // Add Password
    public void addPassword(String password){
        sendTextToElement(passwordText,password);
    }

    // confirm password
    public void addConfirmPassword(String password){
        sendTextToElement(confirmPassword,password);
    }

    //Click on “REGISTER” Button
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }

}
