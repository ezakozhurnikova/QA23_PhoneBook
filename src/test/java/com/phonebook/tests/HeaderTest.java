package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTest extends TestBase{

    @Test

    public void phoneBookElementTest(){
        isElementPresent1(By.xpath("//h1[text()='PHONEBOOK']"));
        Assert.assertTrue(isElementPresent(By.xpath("//h1[text()='PHONEBOOK']")));
    }

    public void homeElementTest(){
        isElementPresent1(By.xpath("//a[@href='/home']"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/home']")));
    }
    public void aboutElementTest(){
        isElementPresent1(By.xpath("//a[@href='/about']"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/about']")));
    }
    public void loginElementTest(){
        isElementPresent1(By.xpath("//a[@href='/login']"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/login']")));
    }
}
