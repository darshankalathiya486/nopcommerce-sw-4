package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {

    // Text  “Cell phones”
    By cellPhones = By.xpath("//h1[normalize-space()='Cell phones']");

    // list view tab
    By listViewTab = By.xpath("//a[normalize-space()='List']");

    //click on “Nokia Lumia 1020” link
    By clickNokiaLumia = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");



    // Get “Cell phones”
    public String getCellPhone(){
        return getTextFromElement(cellPhones);
    }

    // list view tab
    public void clickOnListTab (){
        clickOnElement(listViewTab);
    }

    ////click on “Nokia Lumia 1020” link
    public void clickOnNokiaLumiaLink (){
        clickOnElement(clickNokiaLumia);
    }

}
