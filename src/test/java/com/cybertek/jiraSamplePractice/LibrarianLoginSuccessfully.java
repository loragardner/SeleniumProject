package com.cybertek.jiraSamplePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LibrarianLoginSuccessfully {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // open chrome and navigate to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        // verify the title is "Login - Library"
        if (driver.getTitle().equals("Login - Library")) {
            driver.navigate().refresh();
        } else {
            driver.quit();

        }

        // enter text as "Email address" into email address box
        WebElement email = driver.findElement(By.id("inputEmail"));
        email.sendKeys("librarian47@library");

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


// Given librarian is on the login Page
// Then verify that the title is “Login - Library”
// When librarian enters valid email address and password
// And librarian click sign in button
// Then verify that there are 3 modules on the page