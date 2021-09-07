package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //navigate to google
        driver.get("https://google.com");

        //search for `selenium`
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        //get tag name
        System.out.println("searchBox.getTagName() = " + searchBox.getTagName());

        //get attributes
        System.out.println("searchBox.getAttribute(\"name\") = " + searchBox.getAttribute("name"));

        // click google search button
        searchBox.click();

        // identify the div that hold the search result count on next page `About 95,900,000 results (0.58 seconds)`
        WebElement searchResult=driver.findElement(By.id("result-stats"));

        //get the text of that element
        System.out.println("searchResult.getText() = " + searchResult.getText());

        // Optionally , if you want some java practice , go ahead and extract the number of result and save it into long variable OPTIONALLY
        System.out.println(String.valueOf(searchResult.getText().substring(6,16)));

        // get all the links that contain text `selenium` into a List<WebElement>
        List<WebElement> allSelenium=driver.findElements(By.partialLinkText("Selenium"));

        // get the count
        System.out.println("All selenium text size is:"+allSelenium.size());

        //get the first one text
        System.out.println(allSelenium.get(0).getText());

        // get the last one text
        System.out.println(allSelenium.get(allSelenium.size() - 1).getText());

        // iterate over the list and print the text of each link
        for (WebElement eachSelenium : allSelenium) {
            System.out.println(eachSelenium.getText());
        }

        //navigate go back to google homepage
        driver.navigate().back();

        // watch the short to learn more about `findElement(By.tagName("tag here"))`
        List <WebElement> aTagList=driver.findElements(By.tagName("a"));
        for (WebElement eachaTag : aTagList) {
            System.out.println(eachaTag.getText());
        }
        System.out.println("aTagList.size() = " + aTagList.size());

        driver.quit();


    }
}

// Homework
// Identify the Google search button and get below attributes
// class , type , value  and anything else you see