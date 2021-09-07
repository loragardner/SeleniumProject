package com.cybertek.day01_navigation_locators;

//import io.github.bonigarcia.wdm.WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P00_SeleniumDryRun {
    public static void main(String[] args) {

//        // \Users\Larisa.DESKTOPDZIRKAL\Downloads\chromedriver.exe
//        // 1.set up chrome driver
//        // System.setProperty("webdriver.chrome.driver", "\\Users\\Larisa.DESKTOPDZIRKAL\\Downloads\\chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
//        // 2. create WebDriver instance that points to chrome driver
//        WebDriver driver = new ChromeDriver();
//        // 3. Navigate to https://google.com
//        driver.navigate().to("https://google.com");

        // 1.Setup Firefox Driver so selenium can use it to automate chrome
        WebDriverManager.firefoxdriver().setup();
        // 2. create Firefox Driver Object to open browser
        WebDriver driver = new FirefoxDriver();
        // 3. Navigate to https://google.com in firefox
        driver.navigate().to("https://google.com");

    }

}

