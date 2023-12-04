package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPaymentInfoPage extends Utility {

    //Master card
    By masterCard = By.xpath("//select[@id='CreditCardType']");

    //card name
    By cardHolderName = By.xpath("//input[@id='CardholderName']");

    //card Number
    By cardNumber = By.xpath("//input[@id='CardNumber']");

    //expire date
    By expireDate = By.xpath("//select[@id='ExpireMonth']");

    //expire year
    By expireYear = By.xpath("//select[@id='ExpireYear']");

    //code
    By codeEnter = By.xpath("//input[@id='CardCode']");

    //continue
    By continueButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");


    //Master card
    public void selectMasterCardByValue(String Value){
        selectByValueFromDropDown(masterCard,Value);
    }

    //card name
    public void sendCardHolderName(String Name){
        sendTextToElement(cardHolderName,Name);
    }

    //card Number
    public void sendCardNumber(String Number){
        sendTextToElement(cardNumber,Number);
    }

    //expire date
    public void selectDateByValue(String Value){
        selectByValueFromDropDown(expireDate,Value);
    }

    //expire year
    public void selectYearByValue(String Value){
        selectByValueFromDropDown(expireYear,Value);
    }

    //code
    public void sendCodeEnter (String Code){
        sendTextToElement(codeEnter,Code);
    }

    //continue
    public void clickOnContinueButton (){
        clickOnElement(continueButton);
    }




}
