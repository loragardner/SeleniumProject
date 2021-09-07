package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P05_GettingPageSource_CurrentUrl {
    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // navigate to google and print out the current url
        driver.get("https://amazon.com");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // get the page source of html
        System.out.println("driver.getPageSource() = " + driver.getPageSource());


        driver.quit();


    }
}
