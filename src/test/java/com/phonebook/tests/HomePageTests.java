package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {


    @Test

    public void openHomePageTest(){
        //driver.findElement(By.xpath("//h1[text()='Home Component']"));
       // System.out.println("Home Component is "+isHomeComponentPresent());

       // isElementPresent(By.xpath("//h1[text()='Home Component']"));
       // isElementPresent1(By.xpath("//h1[text()='Home Component']"));
        Assert.assertTrue(app.getHomePage().isHomeComponentPresent());

    }

}
