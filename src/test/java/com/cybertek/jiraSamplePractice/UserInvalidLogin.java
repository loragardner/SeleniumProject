package com.cybertek.jiraSamplePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UserInvalidLogin {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // open chrome and navigate to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        // enter text as "Email address" into email address box
        WebElement email = driver.findElement(By.id("inputEmail"));
        email.sendKeys("library@library");

        // enter text "Password" into password box
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("Sdet2022*\n" +
                "\n" +
                "\n" +
                "\n");

        // submit by clicking sign in button
        WebElement signInBtn = driver.findElement(By.name("submit"));
        signInBtn.click();

        driver.quit();

    }
}

// Given user is on the login Page
// When user enters invalid email address or password
// And student click sign in button
// Then verify the error message “Sorry, Wrong Email or Password”