package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BasicNavigation_LocalHTML_FIle {

    public static void main(String[] args) throws InterruptedException {

        // set up chrome driver , open chrome browser
        WebDriverManager.chromedriver().setup();
        // navigate to that html file using that path you copied from the browser
        WebDriver driver = new ChromeDriver();
        //   file:///C:/Users/Larisa.DESKTOPDZIRKAL/Desktop/HTML_Class/Day2.html
        // YOU NEED TO REPLACE IT WITH YOUR OWN FILE PATH ON YOUR COMPUTER
        driver.get("file:///C:/Users/Larisa.DESKTOPDZIRKAL/Desktop/HTML_Class/Day2.html");

        Thread.sleep(5000);

        // close the browser
        driver.quit();


    }

}