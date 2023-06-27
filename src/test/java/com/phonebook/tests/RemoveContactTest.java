package com.phonebook.tests;

import com.phonebook.model.Contact;
import com.phonebook.model.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTest extends TestBase {

    @BeforeMethod

    public void ensureContact() {
        if (!app.getHeader().isLoginLinkPresent()) {
            app.getHeader().clickOnSignOutButton();
        }
        app.getHeader().click(By.xpath("//a[.='LOGIN']"));
        app.getUser().fillLoginRegistrationForm(new User().setEmail("akr@gmail.com").setPassword("Ka12345$"));
        app.getUser().clickOnLoginButton();
        app.getHeader().clickOnAddLink();
        app.getContact().fillAddContactForm(new Contact()
                .setName("Sting")
                .setLastname("Sting")
                .setPhone("1234567890")
                .setEmail("sting@gm.com")
                .setAddress("London")
                .setDesc("singer"));
        app.getContact().clickOnSaveButton();

    }

    @Test

    public void removeContactTest() {

        int sizeBefore = app.getContact().sizeOfContacts();
        // System.out.println(sizeBefore);

        app.getContact().removeContact();

        app.getContact().pause(1000);

        int sizeAfter = app.getContact().sizeOfContacts();
        // System.out.println(sizeAfter);
        Assert.assertEquals(sizeAfter, sizeBefore - 1);
        // Assert.assertTrue(app.getContact().isContactRemoved("No Contacts here!"));

    }
}
