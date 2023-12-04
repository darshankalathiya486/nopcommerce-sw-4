package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {

    HomePage homePage = new HomePage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    MobilesCartPage mobilesCartPage = new MobilesCartPage();
    CheckOutGuestPage checkOutGuestPage = new CheckOutGuestPage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    CartPage cartPage = new CartPage();

    @Test
    //Method Name verifyUserShouldNavigateToCellPhonesPageSuccessfully
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){

        //Mouse Hover on “Electronics” Tab
        homePage.mouseHoverOnElectronicTab();

        // Mouse Hover on “Cell phones” and click
        homePage.mouseHoverOnCellPhones();
        homePage.clickOnCellPhones();

        // Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = cellPhonesPage.getCellPhone();
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    //Method name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException{

        //Mouse Hover on “Electronics” Tab
        homePage.mouseHoverOnElectronicTab();

        // Mouse Hover on “Cell phones” and click
        homePage.mouseHoverOnCellPhones();
        homePage.clickOnCellPhones();

        // Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = cellPhonesPage.getCellPhone();
        Assert.assertEquals(actualText,expectedText);

        // Click on List View Tab
        cellPhonesPage.clickOnListTab();
        Thread.sleep(2000);

        // Click on product name “Nokia Lumia 1020” link
        cellPhonesPage.clickOnNokiaLumiaLink();

        // Verify the text “Nokia Lumia 1020”
        String expectedText0 = "Nokia Lumia 1020";
        String actualText0 = nokiaLumiaPage.getNokiaLumiaText();
        Assert.assertEquals(actualText0,expectedText0);

        //Verify the price “$349.00”
        String expectedText1 = "$349.00";
        String actualText1 = nokiaLumiaPage.getPriceText();
        Assert.assertEquals(actualText1,expectedText1);

        // Change quantity to 2
        nokiaLumiaPage.clickQuantityBox();
        nokiaLumiaPage.clearQuantityBox();
        nokiaLumiaPage.sendQuantityInBox("2");

        // Click on “ADD TO CART” tab
        nokiaLumiaPage.clickOnAddToCartTab();

        // Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedText2 = "The product has been added to your shopping cart";
        String actualText2 =nokiaLumiaPage.getTheProductHasBeenAddedToYourShoppingCartText();
        Assert.assertEquals(actualText2,expectedText2);

        // Close the bar by clicking on the cross button
        nokiaLumiaPage.clickOnCrossButton();

        // Then MouseHover on "Shopping cart".
        nokiaLumiaPage.mouseHoverShoppingCart();

        // Click on "GO TO CART" button.
        nokiaLumiaPage.clickOnGoTOCartButton();

        // Verify the message "Shopping cart"
        String expectedText3 = "Shopping cart";
        String actualText3 = mobilesCartPage.getShoppingCart();
        Assert.assertEquals(actualText3,expectedText3);

        // Verify the quantity is 2
        String expectedText4 = "2";
        String actualText4 = mobilesCartPage.getQuantity();
        Assert.assertEquals(actualText4,expectedText4);

        //   Verify the Total $698.00
        String expectedText5 = "$698.00";
        String actualText5 = mobilesCartPage.getTotalText();
        Assert.assertEquals(actualText5,expectedText5);

        // click on checkbox “I agree with the terms of service”
        mobilesCartPage.clickOnCheckBox();

        // Click on “CHECKOUT”
        mobilesCartPage.clickOnCheckOutButton();

        //Verify the Text “Welcome, Please Sign In!”
        String expectedText6 = "Welcome, Please Sign In!";
        String actualText6 = checkOutGuestPage.getWelcomePleaseSignInText();
        Assert.assertEquals(actualText6,expectedText6);

        //Click on “REGISTER” tab
        checkOutGuestPage.clickOnRegisterTab();

        // Verify the text “Register”
        String expectedText7 = "Register";
        String actualText7 = registerPage.getRegisterText();
        Assert.assertEquals(actualText7,expectedText7);

        // Fill the mandatory fields
        registerPage.addFirstName("Nill");
        registerPage.addLastName("Patel");
        registerPage.addEmail("abc@gmail.com");
        registerPage.addPassword("123456");
        registerPage.addConfirmPassword("123456");

        //Click on “REGISTER” Button
        registerPage.clickOnRegisterButton();

        // Verify the message “Your registration completed”
        String expectedText8 = "Your registration completed";
        String actualText8 = registerResultPage.getYourRegistrationCompletedText();
        Assert.assertEquals(actualText8,expectedText8);

        // Click on “CONTINUE” tab
        registerResultPage.clickOnContinueButton();

        //Verify the text “Shopping card”
        String expectedText9 = "Shopping cart";
        String actualText9 = cartPage.getShoppingCartText();
        Assert.assertEquals(actualText9,expectedText9);


















    }
}
