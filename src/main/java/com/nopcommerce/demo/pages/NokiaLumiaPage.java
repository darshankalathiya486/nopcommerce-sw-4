package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaPage extends Utility {

    // Text “Nokia Lumia 1020”
    By nokiaLumiaText = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");

    //price “$349.00”
    By priceText = By.xpath("//span[@id='price-value-20']");

    //click quantity
    By quantityBox = By.xpath("//input[@id='product_enteredQuantity_20']");

    //click “ADD TO CART” tab
    By addToCartTab = By.xpath("//button[@id='add-to-cart-button-20']");

    //Text "The product has been added to your shopping cart"
    By theProductHasBeenAddedToYourShoppingCart = By.xpath("//p[@class='content']");

    //click on cross button
    By crossButton = By.xpath("//span[@title='Close']");

    //MouseHover on "Shopping cart"
    By shoppingCart = By.xpath("//li[@id='topcartlink']");

    // click on "GO TO CART" button
    By goToCartButton = By.xpath("//button[normalize-space()='Go to cart']");




    // Text “Nokia Lumia 1020”
    public String getNokiaLumiaText (){
        return getTextFromElement(nokiaLumiaText);
    }

    //price “$349.00”
    public String getPriceText (){
        return getTextFromElement(priceText);
    }

    //click quantity
    public void clickQuantityBox (){
        clickOnElement(quantityBox);
    }

    //clear quantity
    public void clearQuantityBox (){
        clearInput(quantityBox);
    }

    //send quantity
    public void sendQuantityInBox (String quantity){
        sendTextToElement(quantityBox,quantity);
    }

    //click “ADD TO CART” tab
    public void clickOnAddToCartTab (){
        clickOnElement(addToCartTab);
    }

    //Text "The product has been added to your shopping cart"
    public String getTheProductHasBeenAddedToYourShoppingCartText (){
        return getTextFromElement(theProductHasBeenAddedToYourShoppingCart);
    }

    //click on cross button
    public void clickOnCrossButton(){
        clickOnElement(crossButton);
    }

    //MouseHover on "Shopping cart"
    public void mouseHoverShoppingCart (){
        mouseHoverToElement(shoppingCart);
    }

    // click on "GO TO CART" button
    public void clickOnGoTOCartButton (){
        clickOnElement(goToCartButton);
    }








}
