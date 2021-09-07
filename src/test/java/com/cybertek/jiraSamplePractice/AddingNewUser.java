package com.cybertek.jiraSamplePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AddingNewUser {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // open chrome and navigate to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        // enter text as "Email address" into email address box
        WebElement email = driver.findElement(By.id("inputEmail"));
        email.sendKeys("librarian47@library");

        // enter text "Password" into password box
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("Sdet2022*\n" +
                "\n" +
                "\n" +
                "\n");

        // submit by clicking sign in button
        WebElement signInBtn = driver.findElement(By.name("submit"));
        signInBtn.click();

        // click "Users" module button on navigation bar
        WebElement usersBtn = driver.findElement(By.className("nav-link"));
        usersBtn.click();

        // click “+Add User” button
        WebElement addUserBtn = driver.findElement(By.className("btn btn-lg btn-outline btn-primary btn-sm"));
        addUserBtn.click();

        // enter full name, password, email and address
        // enter text as "Full Name" into Full Name box
        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("some name here");

        // enter text as "Password" into Password box
        WebElement passwordId = driver.findElement(By.id("password"));
        passwordId.sendKeys("some password here");

        // enter text as "Email address" into Email address box
        WebElement emailAddress = driver.findElement(By.id("email"));
        emailAddress.sendKeys("some email here");

        // click save changes, then verify a new user is created

        driver.quit();


    }
}

// Given librarian is on the home Page
// When librarian click Users module
// And librarian click “+Add User” button
// When librarian enter full name, password, email and address
// And librarian click save changes Then verify a new user is created