package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    //First name
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");

    // Last name
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");

    //Email
    By emailEnter = By.xpath("//input[@id='BillingNewAddress_Email']");

    //Country
    By countryNameByValue = By.xpath("//select[@id='BillingNewAddress_CountryId']");

    // state
    By stateNameByValue = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");

    //Address
    By addressName = By.xpath("//input[@id='BillingNewAddress_Address1']");

    //City
    By cityName = By.xpath("//input[@id='BillingNewAddress_City']");

    //Zip cord
    By zipCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");

    // Phone number
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");

    // continue
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");

    //First name
    public void sendFirstName(String FirstName){
        sendTextToElement(firstName,FirstName);
    }

    //Last name
    public void sendLastName(String LastName){
        sendTextToElement(lastName,LastName);
    }

    //Email
    public void sendEmail(String Email){
        sendTextToElement(emailEnter,Email);
    }

    //Country name
    public void selectCountryByValue(String Value){
        selectByValueFromDropDown(countryNameByValue,Value);
    }

    //State name
    public void selectStateByValue(String Value){
        selectByValueFromDropDown(stateNameByValue,Value);
    }

    //Address
    public void sendAddress(String Address){
        sendTextToElement(addressName,Address);
    }

    //city name
    public void sendCityName(String CityName){
        sendTextToElement(cityName,CityName);
    }

    //zip code
    public void sendZipCord (String ZipCode){
        sendTextToElement(zipCode,ZipCode);
    }

    //phone number
    public void sendPhoneNumber(String PhoneNumber){
        sendTextToElement(phoneNumber,PhoneNumber);
    }

    // click on button
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }


}
