package com.phonebook.tests;

import com.phonebook.fw.DataProviders;
import com.phonebook.model.Contact;
import com.phonebook.model.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateContactTest extends TestBase {
    @BeforeMethod

    public void ensurePrecondition() {
        if (!app.getHeader().isLoginLinkPresent()) {
            app.getHeader().clickOnSignOutButton();
        }

        // click on login link
        //driver.findElement(By.xpath("//a[.='LOGIN']")).click();
        app.getHeader().click(By.xpath("//a[.='LOGIN']"));


        app.getUser().fillLoginRegistrationForm(new User().setEmail("akr@gmail.com").setPassword("Ka12345$") );
        //click on Registration
        //by.name-registration

        app.getUser().clickOnLoginButton();
    }
  @Test
    public void addContactPositiveTest(){
        //click on the ADD link
        app.getHeader().clickOnAddLink();
      //  int i= (int) (System.currentTimeMillis()/1000)%3600; unikalnyj nomer
        //fill in the add contact form
      app.getContact().fillAddContactForm(new Contact()
              .setName("Sting")
              .setLastname("Sting")
              .setPhone("1234567890")
              .setEmail("sting@gm.com")
              .setAddress("London")
              .setDesc("singer"));
      //click on the Save button
      app.getContact().clickOnSaveButton();
      //assert the contact is added
      Assert.assertTrue(app.getContact().isContactCreated("Sting"));


  }
  @Test(dataProviderClass = DataProviders.class,dataProvider = "addContactFromCSVFile")
    public void addContactFromCsvFilePositiveTest(Contact contact){
        //click on the ADD link
        app.getHeader().clickOnAddLink();
      //  int i= (int) (System.currentTimeMillis()/1000)%3600; unikalnyj nomer
        //fill in the add contact form
      app.getContact().fillAddContactForm(contact);
      //click on the Save button
      app.getContact().clickOnSaveButton();
      //assert the contact is added



  }
  @AfterMethod
    public void deleteContact(){
      app.getContact().deleteContact();
  }



}