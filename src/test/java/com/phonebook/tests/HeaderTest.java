package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTest extends TestBase {

    @Test

    public void phoneBookElementTest() {
        //isElementPresent1(By.xpath("//h1[text()='PHONEBOOK']"));
        Assert.assertTrue(app.getHeader().isLogoPresent());
    }

    @Test
    public void homeElementTest() {
        // isElementPresent1(By.xpath("//a[@href='/home']"));
        Assert.assertTrue(app.getHeader().isHomeLinkPresent());
    }

    @Test
    public void aboutElementTest() {
        //isElementPresent1(By.xpath("//a[@href='/about']"));
        Assert.assertTrue(app.getHeader().isAboutLinkPresent());
    }

    @Test
    public void loginElementTest() {
        // isElementPresent1(By.xpath("//a[@href='/login']"));
        Assert.assertTrue(app.getHeader().isLoginLinkPresent());
    }
}
