package com.phonebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {


    @Test

    public void openHomePageTest(){
//driver.findElement(By.xpath("//h1[text()='Home Component']"));
       // System.out.println("Home Component is "+isHomeComponentPresent());

       // isElementPresent(By.xpath("//h1[text()='Home Component']"));
        isElementPresent1(By.xpath("//h1[text()='Home Component']"));
        Assert.assertTrue(isElementPresent(By.xpath("//h1[text()='Home Component']")));

    }

    public boolean isHomeComponentPresent(){
        return isElementPresent(By.xpath("//h1[text()='Home Component']"));
    }

    public boolean isHomeComponentPresent1(){
        return isElementPresent1(By.xpath("//h1[text()='Home Component']"));
    }
}
