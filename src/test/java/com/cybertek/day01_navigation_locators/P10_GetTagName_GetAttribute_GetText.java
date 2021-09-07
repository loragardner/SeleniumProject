package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_GetTagName_GetAttribute_GetText {
    public static void main(String[] args) {

        // set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // navigate to google.com"
        driver.get("https://google.com");
        // identify and save the search box element and enter Selenium
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        // get tag name of the element
        System.out.println("searchBox.getTagName() = " + searchBox.getTagName());
        // get value attribute of the element
        System.out.println("searchBox.getAttribute(\"value\") = " + searchBox.getAttribute("value"));
        // identify and save the search button element
        WebElement searchBtn = driver.findElement(By.name("btnK"));
        // get tag name of the element, get class attribute
        System.out.println("searchBtn.getTagName() = " + searchBtn.getTagName());
        System.out.println("searchBtn.getAttribute(\"class\") = " + searchBtn.getAttribute("class"));

        // click on the search button
        searchBtn.submit();

        // identify the element that hold search result number
        WebElement searchResult = driver.findElement(By.id("result-stats"));
        // get the text of that element
        String resultText = searchResult.getText();
        System.out.println("resultText = " + resultText);







    }
}
