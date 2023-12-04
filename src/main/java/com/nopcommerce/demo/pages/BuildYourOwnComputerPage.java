package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BuildYourOwnComputerPage extends Utility {

    // Text "Build your own computer"
    By buildYourOwnComputerText = By.xpath("//h1[normalize-space()='Build your own computer']");

    //Select "2.2 GHz Intel Pentium Dual-Core E2200"
    By getProcessor = By.xpath("//select[@id='product_attribute_1']");

    //Select "8GB [+$60.00]" using Select class.
    By getRam = By.xpath("//select[@id='product_attribute_2']");

    // Select HDD radio "400 GB [+$100.00]"
    By getHDD = By.xpath("//input[@value='7']");

    //Select OS radio "Vista Premium [+$60.00]"
    By getOs = By.xpath("//input[@id='product_attribute_4_9']");

    //Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
    By clickSoftwareText = By.xpath("//dd[@id='product_attribute_input_5']//li[1]");

    //Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
    By getSoftware = By.xpath("(//label[normalize-space()='Total Commander [+$5.00]'])[1]");

    //Text the price "$1,475.00"
    By priceText = By.xpath("//span[@id='price-value-1']");

    //Click on "ADD TO CARD" Button
    By clickAddToCart = By.id("add-to-cart-button-1");

    //Text "The product has been added to your shopping cart" on Top green Bar"
    By theProductHasBeenAddedToYourShoppingCartText = By.xpath("//p[@class='content']");

    //click cross mark
    By clickCross = By.xpath("//span[@title='Close']");

    //Mouse hover on button
    By mouseHover = By.xpath("//li[@id='topcartlink']");

    //click on button
    By clickGoToCart = By.xpath("//button[normalize-space()='Go to cart']");


    //Get buildYourOwnComputerText
    public String getBuildYourOwnComputerText(){
        return getTextFromElement(buildYourOwnComputerText);
    }

    // Get "2.2 GHz Intel Pentium Dual-Core E2200"
    public void selectProcessor (String value){
        selectByValueFromDropDown(getProcessor,value);
    }

    //Get "8GB [+$60.00]"
    public void selectRam(String value){
        selectByValueFromDropDown(getRam,value);
    }

    //Get  HDD radio "400 GB [+$100.00]"
    public void clickHdd(){
        clickOnElement(getHDD);
    }

    //Get OS radio "Vista Premium [+$60.00]"
    public void clickOs(){
        clickOnElement(getOs);
    }

    //Get "Microsoft Office [+$50.00]"
    public void clickSoftware (){
        clickOnElement(clickSoftwareText);
    }

    //Get "Total Commander[+$5.00]
    public List<WebElement> selectSoftware (){
        List<WebElement> selectSoftwareText = driver.findElements(getSoftware);
        return selectSoftwareText;
    }

    // Get price "$1,475.00"
    public String getPriceText(){
        return getTextFromElement(priceText);
    }

    //Click on "ADD TO CARD" Button
    public void clickOnAddToCartButton(){
        clickOnElement(clickAddToCart);
    }

    //Get Text
    public String getTheProductHasBeenAddedToYourShoppingCartText (){
        return getTextFromElement(theProductHasBeenAddedToYourShoppingCartText);
    }

    //click cross mark
    public void clickCrossMark (){
        clickOnElement(clickCross);
    }

    //mouse hover
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(mouseHover);
    }

    //click button
    public void clickOnGoToShoppingCartButton(){
        clickOnElement(clickGoToCart);
    }






}
