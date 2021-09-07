package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P12_LocateElementsByClassName {
    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // navigate to "http://practice.cybertekschool.com"
        driver.get("http://practice.cybertekschool.com");

        // identify the span element with class name 'h1y'
        WebElement elm = driver.findElement(By.className("h1y"));
        System.out.println("elm.getText() = " + elm.getText());

        // identify first item in unordered list using classname
        WebElement firstElm = driver.findElement(By.className("list-group-item"));
        System.out.println("firstElm.getText() = " + firstElm.getText());

        List<WebElement> allItems = driver.findElements(By.className("list-group-item"));
        System.out.println("allItems.size() = " + allItems.size());

        // quit the browser
        driver.quit();
    }
}
