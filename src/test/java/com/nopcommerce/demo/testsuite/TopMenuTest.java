package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();

    /**
     * 1.1 create method with name "selectMenu" it has one parameter name "menu" of type
     * string
     * 1.2 This method should click on the menu whatever name is passed as parameter.
     * 1.3. create the @Test method name verifyPageNavigation. Use selectMenu method to
     * select the Menu and click on it and verify the page navigation.
     */

    //Method name select Menu with menu parameter
    public void selectMenu(String menu) {
        List<WebElement> topMenuList = homePage.getAllTopManuName();

        try {
                for (WebElement element : topMenuList) {
                    if (element.getText().equalsIgnoreCase(menu)) {
                        element.click();
                    }
                }
            } catch (StaleElementReferenceException e) {
                topMenuList = homePage.getAllTopManuName();
            }
        }


        @Test
        //verify the page navigation
        public void verifyPageNavigation () {
            selectMenu("Apparel");
        }

    }


