package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {

    ComputersPage computersPage = new ComputersPage();


    @Test
    // Method name verifyComputersTab
    public void verifyComputersTab() {

        // Click on Computer Menu
        computersPage.clickOnComputersTab();


    }
}
