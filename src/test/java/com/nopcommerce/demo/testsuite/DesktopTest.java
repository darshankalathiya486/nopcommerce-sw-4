package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopTest extends BaseTest {

    HomePage homePage = new HomePage();

    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();

    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();

    CartPage cartPage = new CartPage();

    CheckOutGuestPage checkOutGuestPage = new CheckOutGuestPage();

    CheckOutPage checkOutPage = new CheckOutPage();

    CheckOutShippingMethodPage checkOutShippingMethodPage = new CheckOutShippingMethodPage();

    CheckOutPaymentMethodPage checkOutPaymentMethodPage = new CheckOutPaymentMethodPage();

    CheckOutPaymentInfoPage checkOutPaymentInfoPage = new CheckOutPaymentInfoPage();

    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();

    CheckOutCompletedPage checkOutCompletedPage = new CheckOutCompletedPage();





    @Test
    // Method name verifyProductArrangeInAlphaBalticOrder
    public void verifyProductArrangeInAlphaBalticOrder()throws InterruptedException{

        // Click on Computer Menu
        computersPage.clickOnComputersTab();

        //Click on Desktop
        desktopPage.clickOnDesktopMenu();

        //Verify the Product will arrange in Descending order
        List<WebElement> name = desktopPage.getProductNameWithoutFilter();
        ArrayList originalList = new ArrayList();
        for (WebElement element : name){
            originalList.add(element.getText());
        }
        Collections.reverse(originalList);
        System.out.println(originalList);

        //Select Sort By position "Name: Z to A"
        desktopPage.selectFilterZToA("6");
        Thread.sleep(2000);
        ArrayList sortedList = new ArrayList();
        name = desktopPage.getProductNameWithoutFilter();
        for (WebElement element : name){
            sortedList.add(element.getText());
        }

        System.out.println(sortedList);
        Assert.assertEquals(originalList,sortedList);
    }

    @Test
    //Method name verifyProductAddedToShoppingCartSuccessFully
    public void verifyProductAddedToShoppingCartSuccessFully() throws  InterruptedException{
        // Click on Computer Menu
        computersPage.clickOnComputersTab();

        //Click on Desktop
        desktopPage.clickOnDesktopMenu();

        //Verify the Product will arrange in Descending order
        List<WebElement> name = desktopPage.getProductNameWithoutFilter();
        ArrayList originalList = new ArrayList();
        for (WebElement element : name){
            originalList.add(element.getText());
        }
        System.out.println(originalList);

        //Select Sort By position "Name: A to Z"
        desktopPage.selectFilterAToZ("5");
        Thread.sleep(2000);
        ArrayList sortedList = new ArrayList();
        name = desktopPage.getProductNameWithoutFilter();
        for (WebElement element : name){
            sortedList.add(element.getText());
        }

        System.out.println(sortedList);
        Assert.assertEquals(originalList,sortedList);

        // Click on "Add To Cart"
        desktopPage.clickAddToCart();

        //Verify the Text "Build your own computer"
        String expectedText = "Build your own computer";
        String actualText = buildYourOwnComputerPage.getBuildYourOwnComputerText();
        Assert.assertEquals(expectedText,actualText);

        //Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputerPage.selectProcessor("1");

        //Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputerPage.selectRam("5");

        //Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputerPage.clickHdd();

        //Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputerPage.clickOs();

        //select "Microsoft Office [+$50.00]"
        buildYourOwnComputerPage.clickSoftware();
        Thread.sleep(2000);

        //select "Total Commander [+$5.00]"
        List<WebElement> software = buildYourOwnComputerPage.selectSoftware();
        for (WebElement element : software){
            if (element.getText().equalsIgnoreCase("Microsoft Office [+$50.00]"));
            element.click();
        }

        //Verify the price "$1,475.00"
        Thread.sleep(2000);
        String expectedText1 = "$1,475.00";
        String actualText1 = buildYourOwnComputerPage.getPriceText();
        Assert.assertEquals(actualText1,expectedText1);

        //Click on "ADD TO CARD" Button.
        buildYourOwnComputerPage.clickOnAddToCartButton();

        //Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedText2 = "The product has been added to your shopping cart";
        String actualText2 = buildYourOwnComputerPage.getTheProductHasBeenAddedToYourShoppingCartText();
        Assert.assertEquals(actualText2,expectedText2);

        //After that close the bar clicking on the cross button.
        buildYourOwnComputerPage.clickCrossMark();

        //Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        buildYourOwnComputerPage.clickOnGoToShoppingCartButton();

        //Verify the message "Shopping cart"
        String expectedText3 = "Shopping cart";
        String actualText3 = cartPage.getShoppingCartText();
        Assert.assertEquals(actualText3,expectedText3);

        //Change the Qty to "2" and Click on "Update shopping cart
        cartPage.clickQuantityBox();
        Thread.sleep(2000);
        cartPage.clearQuantityBox();
        cartPage.sendQuantityInBox("2");

        // click on update cart button
        cartPage.clickOnUpdateShoppingCart();

        //Verify the Total"$2,950.00"
        String expectedText4 = "$2,950.00";
        String actualText4 = cartPage.getTotalText();
        Assert.assertEquals(actualText4,expectedText4);

        //click on checkbox “I agree with the terms of service”
        cartPage.clickOnCheckBox();

        //Click on “CHECKOUT”
        cartPage.clickOnCheckOutButton();

        //Verify the Text “Welcome, Please Sign In!”
        String expectedText5 = "Welcome, Please Sign In!";
        String actualText5 = checkOutGuestPage.getWelcomePleaseSignInText();
        Assert.assertEquals(actualText5,expectedText5);

        //Click on “CHECKOUT AS GUEST” Tab
        checkOutGuestPage.clickOnCheckOutButton();

        //First name
        checkOutPage.sendFirstName("Meet");
        // Last name
        checkOutPage.sendLastName("Patel");
        //Email
        checkOutPage.sendEmail("abcd124@gmail.com");
        //Country
        checkOutPage.selectCountryByValue("1");
        //state
        checkOutPage.selectStateByValue("53");
        //Address
        checkOutPage.sendAddress("ddddddddd");
        //City
        checkOutPage.sendCityName("Mexico");
        //Zip cord
        checkOutPage.sendZipCord("12345");
        //phone number
        checkOutPage.sendPhoneNumber("1234567890");

        //Click on “CONTINUE”
        checkOutPage.clickOnContinueButton();

        //Click on Radio Button “Next Day Air($0.00)
        checkOutShippingMethodPage.clickOnRadioButton();

        //Click on “CONTINUE”
        checkOutShippingMethodPage.clickOnContinueButton();

        // Select Radio Button “Credit Card”
        checkOutPaymentMethodPage.clickCreditCardButton();

        // Click on “CONTINUE”
        checkOutPaymentMethodPage.clickContinueButton();

        // Fill all the details
        checkOutPaymentInfoPage.selectMasterCardByValue("MasterCard");
        // Cardholder name
        checkOutPaymentInfoPage.sendCardHolderName("Meet Patel");
        //card number
        checkOutPaymentInfoPage.sendCardNumber("5555 5537 5304 8194");
        //select expire date
        checkOutPaymentInfoPage.selectDateByValue("5");
        //select expire year
        checkOutPaymentInfoPage.selectYearByValue("2030");
        // code
        checkOutPaymentInfoPage.sendCodeEnter("234");
        // Click on “CONTINUE”
        checkOutPaymentInfoPage.clickOnContinueButton();

        //Verify “Payment Method” is “Credit Card”
        String expectedText6 = "Payment Method: Credit Card";
        String actualText6 = confirmOrderPage.getPaymentMethodIsCreditCardText();
        Assert.assertEquals(actualText6,expectedText6);

        //Verify “Shipping Method” is “Next Day Air”
        String expectedText7 = "Shipping Method: Next Day Air";
        String actualText7 = confirmOrderPage.getShippingMethodIsNextDayAirText();
        Assert.assertEquals(actualText7,expectedText7);

        // Verify Total is “$2,950.00”
        String expectedText8 ="$2,950.00";
        String actualText8 = confirmOrderPage.getTotalText();
        Assert.assertEquals(actualText8,expectedText8);

        // Click on “CONFIRM”
        confirmOrderPage.clickOnConfirmButton();

        //Verify the Text “Thank You”
        String expectedText9 = "Thank you";
        String actualText9 = checkOutCompletedPage.getThankYouText();
        Assert.assertEquals(actualText9,expectedText9);

        //Verify the message “Your order has been successfully processed!”
        String expectedText10 = "Your order has been successfully processed!";
        String actualText10 = checkOutCompletedPage.getYourOrderHasBeenSuccessFullyProcessedText();
        Assert.assertEquals(actualText10, expectedText10);

        //Click on “CONTINUE”
        checkOutCompletedPage.clickOnContinueButton();

        //Verify the text “Welcome to our store”
        String expectedText11 = "Welcome to our store";
        String actualText11 = homePage.getWelcomeToOurStoreText();
        Assert.assertEquals(actualText11,expectedText11);

    }
}
