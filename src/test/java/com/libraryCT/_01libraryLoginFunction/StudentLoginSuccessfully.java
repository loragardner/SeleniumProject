package com.libraryCT._01libraryLoginFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentLoginSuccessfully {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");
        driver.manage().window().maximize();

        //check the URL
        String expectedUrl = "https://library2.cybertekschool.com/login.html";
        String actualUrl = driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println("Passed");
            System.out.println("Expected URL and Actual URL is the same");
        }else{
            System.out.println("Failed");
            System.out.println("expectedUrl = " + expectedUrl);
            System.out.println("actualUrl = " + actualUrl);
        }
        System.out.println("-----------------------------------------");


        //find Email address box and send valid keys
        WebElement eMailAddressBox = driver.findElement(By.id("inputEmail"));
        eMailAddressBox.submit();
        eMailAddressBox.sendKeys("student62@library");
        Thread.sleep(2000);

        //find password box and send valid keys
        WebElement addressBox = driver.findElement(By.id("inputPassword"));
        addressBox.submit();
        addressBox.sendKeys("Sdet2022*");
        Thread.sleep(2000);

        //find sign in button and click it
        WebElement signInBtn = driver.findElement(new By.ByCssSelector("button"));
        if(signInBtn.isEnabled()){
            signInBtn.click();
        }else{
            System.out.println("This button is not clickable");
        }
        Thread.sleep(1500);

        //verify that there are 2 modules

        List<String> expectedModules = new ArrayList<>(Arrays.asList("Books", "Borrowing Books"));
        String actualModule1 = driver.findElement(new By.ByCssSelector("#menu_item .nav-item:nth-of-type(1) .title")).getText();
        String actualModule2 = driver.findElement(new By.ByCssSelector("#menu_item .nav-item:nth-of-type(2) .nav-link")).getText();
        List<String> actualModules = new ArrayList<>(Arrays.asList(actualModule1,actualModule2));

        System.out.println("expectedModules.size() = " + expectedModules.size());
        System.out.println("actualModules.size() = " + actualModules.size());
        System.out.println("expectedModules = " + expectedModules);
        System.out.println("actualModules = " + actualModules);

        if(expectedModules.size() == actualModules.size() && expectedModules.equals(actualModules)){
            System.out.println("Test Passed");
            System.out.println("There are 2 modules on the page");
            System.out.println("Expected Modules Equal to Actual Modules");
        }else{
            System.out.println("Test Failed");
            System.out.println("Modules' size are different");
            System.out.println("Expected Modules ARE NOT Equal to Actual Modules");
        }
        System.out.println("---------------------------------------------");
        Thread.sleep(1500);

        driver.quit();


    }
}