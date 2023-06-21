package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod

    public void ensurePrecondition(){
        if (!app.isLoginLinkPresent()){
            app.clickOnSignOutButton();
        }

        // click on login link
        //driver.findElement(By.xpath("//a[.='LOGIN']")).click();
        app.click(By.xpath("//a[.='LOGIN']"));

    }
    @Test
    public void loginPositiveTest() {
        // enter email field
        // [placeholder='Email']
        app.fillLoginRegistrationForm(new User()
                .setEmail("akr@gmail.com")
                .setPassword("Ka12345$"));
        //click on Registration
        //by.name-registration

        app.clickOnLoginButton();
        // assert user logged in(check "Sign out" button displayed)
        Assert.assertTrue(app.isSignOutButtonPresent());
    }
        @Test
    public void loginNegativeWithoutPasswordTest(){
        // enter email field
        // [placeholder='Email']
        app.fillLoginRegistrationForm(new User().setEmail("akr@gmail.com") );
        //click on Registration
        //by.name-registration

        app.clickOnLoginButton();
        Assert.assertTrue(app.isAlertPresent());


    }

}
