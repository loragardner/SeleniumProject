package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_BasicNavigation {
    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate.to(url)
        // driver.get(url) // shorter way of navigating
        driver.get("https://google.com");
        // navigate.back()
        driver.navigate().back();
        // navigate.forward()
        driver.navigate().forward();
        // navigate.refresh()
        driver.navigate().refresh();

        // closing browser
        /*
         * close() method , will close current tab
         * quit() method , will close all tabs if there is more than one
         * */
        //driver.close();
        driver.quit();


    }
}
