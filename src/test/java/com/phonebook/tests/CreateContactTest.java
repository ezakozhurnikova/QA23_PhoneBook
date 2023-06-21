package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateContactTest extends TestBase {
    @BeforeMethod

    public void ensurePrecondition() {
        if (!app.isLoginLinkPresent()) {
            app.clickOnSignOutButton();
        }

        // click on login link
        //driver.findElement(By.xpath("//a[.='LOGIN']")).click();
        app.click(By.xpath("//a[.='LOGIN']"));


        app.fillLoginRegistrationForm(new User().setEmail("akr@gmail.com").setPassword("Ka12345$") );
        //click on Registration
        //by.name-registration

        app.clickOnLoginButton();
    }
  @Test
    public void addContactPositiveTest(){
        //click on the ADD link
        app.clickOnAddLink();
      //  int i= (int) (System.currentTimeMillis()/1000)%3600; unikalnyj nomer
        //fill in the add contact form
      app.fillAddContactForm("Karl", "Smith", "1234567890", "smith@gm.com", "Berlin", "manager");
      //click on the Save button
      app.clickOnSaveButton();
      //assert the contact is added
      Assert.assertTrue(app.isContactCreated("Karl"));


  }
  @AfterMethod
    public void deleteContact(){
      app.deleteContact();
  }



}