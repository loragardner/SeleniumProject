package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // open chrome and navigate to http://zero.webappsecurity.com/
        driver.get("http://zero.webappsecurity.com/");

        //  verify the title is `Zero - Personal Banking - Loans - Credit Cards` with if statement
        if(driver.getTitle().equals("Zero - Personal Banking - Loans - Credit Cards")) {
            driver.navigate().refresh();
        }else{
            driver.quit();
        }
        // click on `sign in button`
        WebElement signInBtn=driver.findElement(By.id("signin_button"));
        signInBtn.click();

        // verify the title is "Zero- Log in"
        if( driver.getTitle().equals("Zero - Log in")) {
            driver.navigate().refresh();
        }else{
            driver.quit();
        }
        // enter text as "username" into username box
        WebElement userNameBox=driver.findElement(By.id("user_login"));
        userNameBox.sendKeys("helloWorld");

        // enter text "password" into password box
        WebElement password=driver.findElement(By.id("user_password"));
        password.sendKeys("123456");

        // submit by clicking login button
        WebElement signIn=driver.findElement(By.name("submit"));
        signIn.submit();

        // verify you are at "Zero - Account Summary" page by checking title
        if(driver.getTitle().equals("Zero - Account Summary")){
            driver.navigate().refresh();
        }else{
            driver.quit();
        }

        driver.quit();
        // now use your imagination to play around here and explore , automate within the capacity we already have so far


    }
}

/*
open chrome and navigate to http://zero.webappsecurity.com/
verify the title is Zero - Personal Banking - Loans - Credit Cards with if statement
click on signing button
verify the title is "Zero- Log in"
enter text as "username" into username box
enter text "password" into password box
submit by clicking login button
verify you are at "Zero - Account Summary" page by checking title
now use your imagination to play around here and explore , automate within the capacity we already have so far.
 */