package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod

    public void ensurePrecondition(){
        if (!app.getHeader().isLoginLinkPresent()){
            app.getHeader().clickOnSignOutButton();
        }

        // click on login link
        //driver.findElement(By.xpath("//a[.='LOGIN']")).click();
        app.getHeader().click(By.xpath("//a[.='LOGIN']"));

    }
    @Test(priority = 1)
    public void loginPositiveTest() {
        // enter email field
        // [placeholder='Email']
        app.getUser().fillLoginRegistrationForm(new User()
                .setEmail("akr@gmail.com")
                .setPassword("Ka12345$"));
        //click on Registration
        //by.name-registration

        app.getUser().clickOnLoginButton();
        // assert user logged in(check "Sign out" button displayed)
        Assert.assertTrue(app.getHeader().isSignOutButtonPresent());
    }
        @Test(priority = 2)
    public void loginNegativeWithoutPasswordTest(){
        // enter email field
        // [placeholder='Email']
        app.getUser().fillLoginRegistrationForm(new User().setEmail("akr@gmail.com") );
        //click on Registration
        //by.name-registration

        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getHeader().isAlertPresent());


    }

}
