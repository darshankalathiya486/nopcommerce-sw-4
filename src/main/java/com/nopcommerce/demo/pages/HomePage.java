package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    //Get all product name
    By getAllTopManu = By.xpath("//ul[@class='top-menu notmobile']//li");

    //Text “Welcome to our store”
    By welcomeToOurStore = By.xpath("//h2[normalize-space()='Welcome to our store']");

    //ElectronicTab
    By electronicTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");

    //Cell phones
    By cellPhone = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");




    // get all product name
    public List<WebElement> getAllTopManuName (){
         List<WebElement> getListOfElements = driver.findElements(getAllTopManu);
            return getListOfElements;
        }

    //Text “Welcome to our store”
    public String getWelcomeToOurStoreText(){
        return getTextFromElement(welcomeToOurStore);
    }

    //ElectronicTab
    public void mouseHoverOnElectronicTab(){
        mouseHoverToElement(electronicTab);
    }

    //Cell phones mouseHover
    public void mouseHoverOnCellPhones (){
        mouseHoverToElement(cellPhone);
    }

    //Cell phones click
    public void clickOnCellPhones(){
        clickOnElement(cellPhone);
    }

    }

