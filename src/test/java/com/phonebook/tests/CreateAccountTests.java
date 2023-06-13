package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

// precondition: user should be logged in
    @BeforeMethod

    public void ensurePrecondition(){
        if (!isElementPresent(By.xpath("//a[.='LOGIN']"))){
            driver.findElement(By.xpath("//button[.='Sign Out']")).click();
        }

        // click on login link
        driver.findElement(By.xpath("//a[.='LOGIN']")).click();

    }
  @Test
  public void newUserRegistrationPositiveTest(){
      // enter email field
      // [placeholder='Email']
      driver.findElement(By.cssSelector("[placeholder='Email']")).click();
      driver.findElement(By.cssSelector("[placeholder='Email']")).clear();
      driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("akr@gmail.com");




      //enter password field
     // [placeholder='Password']
      driver.findElement(By.cssSelector("[placeholder='Password']")).click();
      driver.findElement(By.cssSelector("[placeholder='Password']")).clear();
      driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("Ka12345$");
      //click on Registration
      //by.name-registration
      // assert user logged in(check "Sign out" button displayed)


  }

}
