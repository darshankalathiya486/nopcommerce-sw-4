package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {

    //Computer
    By computersTab = By.xpath("//a[contains(text(), 'Computers')][1]");

    public void clickOnComputersTab(){
        clickOnElement(computersTab);
    }
}
