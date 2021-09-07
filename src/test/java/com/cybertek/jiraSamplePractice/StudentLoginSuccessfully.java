package com.cybertek.jiraSamplePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StudentLoginSuccessfully {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // open chrome and navigate to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        // enter text as "Email address" into email address box
        WebElement email = driver.findElement(By.id("inputEmail"));
        email.sendKeys("student95@library");

        // enter text "Password" into password box
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("Sdet2022*\n" +
                "\n" +
                "\n" +
                "\n");

        // submit by clicking sign in button
        WebElement signInBtn = driver.findElement(By.name("submit"));
        signInBtn.click();

            // identify all li elements with class name list-group-item
            List<WebElement> allLiTagElements = driver.findElements(By.className("navbar-nav mr-auto"));

            // get the size of all the elements
            System.out.println("allLiTagElements.size() = " + allLiTagElements.size());

            driver.quit();
        }

    }


// Given student is on the login Page
// Then verify that the URL is “https://library2.cybertekschool.com/login.html”
// When student enters valid email address and password
// And student click sign in button
// Then verify that there are 2 modules on the page