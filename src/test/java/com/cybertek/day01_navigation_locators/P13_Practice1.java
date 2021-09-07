package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13_Practice1 {

    public static void main(String[] args) {

        // Set up ChromeDriver ad open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Navigate to https://saucedemo.com
        driver.get("https://saucedemo.com");

        // make the window maximize
        driver.manage().window().maximize();
        // Print out the page title
        String title = driver.getTitle();
        // Enter username provided: standart_user
        WebElement usernameBox = driver.findElement(By.id("user-name"));
        usernameBox.sendKeys("standart_user");
        // Enter password provided: secret_sauce
        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys("secret_sauce");

        // Click on Login button to log in / id: login-button
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.submit();

        // Get the name and price of first product

        // Get all product names into List<WebElement>
        // get the count
        // print out the text of all products

        // Click on the shopping cart link top right corner

        // Click on continue to shop button to come back to product page

        // Quit the browser
        driver.quit();









    }
}
