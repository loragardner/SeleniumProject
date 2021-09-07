package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_CloseAndQuitBrowser {
    public static void main(String[] args) throws InterruptedException {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // navigate to a practice page that open new tab
        driver.get("http://practice.cybertekschool.com/open new tab");

        Thread.sleep(5000);
        // close method any current browser tab that in focus
        driver.close();

        // close all browser windows opened by driver
        driver.quit();





    }
}
