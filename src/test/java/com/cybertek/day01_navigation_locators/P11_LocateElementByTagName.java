package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class P11_LocateElementByTagName {

    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // navigate to "http://practice.cybertekschool.com"
        driver.get("http://practice.cybertekschool.com");
        // identify and safe the first element with <a> tag
        WebElement firstLnk = driver.findElement(By.tagName("a"));
        // print out the text
        System.out.println("firstLnk.getText() = " + firstLnk.getText());
        // identify and safe all the elements with <a> tag
        // findElements method wil return List<WebElement>
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        // iterate over this list and get the text of all the link weblement
        for(WebElement eachLink:allLinks){
            System.out.println("Link text is " + eachLink.getText());
        }

        // click on the Home link
        firstLnk.click();


        // close the browser
        driver.quit();

    }
}
