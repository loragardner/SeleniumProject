package com.cybertek.jiraSamplePractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingNewBook {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // open chrome and navigate to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

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

        // click "Books" module button on navigation bar
        WebElement booksBtn = driver.findElement(By.className("fa fa-book"));
        booksBtn.click();

        // click “+Add Book” button
        WebElement addBookBtn = driver.findElement(By.className("btn btn-lg btn-outline btn-primary btn-sm"));
        addBookBtn.click();

        // enter Book Name, ISBN, Year, Author, and Description
        // enter text as "Book Name" into Book Name box
        WebElement bookName = driver.findElement(By.name("name"));
        bookName.sendKeys("some name here");

        // enter text "ISBN" into ISBN box
        WebElement isbn = driver.findElement(By.name("isbn"));
        isbn.sendKeys("some isbn here");

        // enter text as "Author" into Author box Description
        WebElement author = driver.findElement(By.name("author"));
        author.sendKeys("some author here");

        // enter text as "Description" into Description box
        WebElement description = driver.findElement(By.id("description"));
        description.sendKeys("some description here");

        // click save changes, then verify a new book is added

        driver.quit();


    }
}

// Given librarian is on the home Page
// When librarian click Books module
// And librarian click “+Add Book” button
// When librarian enter Book Name, ISBN, Year, Author, and Description
// And librarian click save changes Then verify a new book is added