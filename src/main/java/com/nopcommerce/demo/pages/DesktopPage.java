package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {

    //Desktop
    By desktop = By.xpath("//li[@class='active last']//a[normalize-space()='Desktops']");

    //Select Sort By position "Name: Z to A"
    By shortByZToA = By.xpath("//select[@id='products-orderby']");

    // select sort By position "Name: A to Z"
    By shortByAToZ = By.xpath("//select[@id='products-orderby']");


    // get all Desktop product name without filter
    By productName = By.xpath("//div[@class='item-grid']//h2");

    // click on "Add to Cart"
    By addToCart = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");


    //click on desktop
    public void clickOnDesktopMenu (){
        clickOnElement(desktop);
    }

    // select filter Z to A
    public void selectFilterZToA(String shortByValue){
        selectByValueFromDropDown(shortByZToA,shortByValue);
    }


    // select filter A to Z
    public void selectFilterAToZ(String shortByValue){
       selectByValueFromDropDown(shortByAToZ,shortByValue);
    }

    //get product name without filter
    public List<WebElement> getProductNameWithoutFilter (){
        List<WebElement> getProductName = driver.findElements(productName);
        return getProductName;
    }

    //click on add to cart
    public void clickAddToCart(){
        clickOnElement(addToCart);
    }

}
