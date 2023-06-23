package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

// precondition: user should be logged in
    @BeforeMethod

    public void ensurePrecondition(){
        if (!app.getHeader().isLoginLinkPresent()){
            app.getHeader().clickOnSignOutButton();
        }

        // click on login link
        //
        app.getHeader().clickOnLoginLink();

    }


    @Test
  public void existedUserRegistrationNegativeTest(){
      // enter email field
      // [placeholder='Email']
        //enter password field
        // [placeholder='Password']
        app.getUser().fillLoginRegistrationForm(new User().setEmail("akr@gmail.com").setPassword("Ka12345$") );


      
      //click on Registration
      //by.name-registration

        app.getUser().clickOnRegistrationButton();
        // assert user logged in(check "Sign out" button displayed)
      Assert.assertTrue(app.getUser().isAlertPresent());


  }

}
