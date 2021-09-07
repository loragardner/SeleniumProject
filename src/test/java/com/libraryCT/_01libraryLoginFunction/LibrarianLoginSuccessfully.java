package com.libraryCT._01libraryLoginFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibrarianLoginSuccessfully {

    public static void main(String[] args) throws InterruptedException {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");
        driver.manage().window().maximize();
        //title
        System.out.println("driver.getTitle() = " + driver.getTitle());
        String expectedTitle = "Login - Library";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Titles Match");
            System.out.println("Expected Title : "+expectedTitle);
            System.out.println("Actual Title : "+actualTitle);
        }else{
            System.out.println("Titles NOT Match");
            System.out.println("Expected Title : "+expectedTitle);
            System.out.println("Actual Title : "+actualTitle);
        }
        System.out.println("---------------------------------------------------");

        //find Email address box and send valid keys
        WebElement eMailAddressBox = driver.findElement(By.id("inputEmail"));
        eMailAddressBox.submit();
        eMailAddressBox.sendKeys("librarian53@library");
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
        Thread.sleep(2000);

        //make sure that there are 3 modules
        List<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboard","Users","Books"));

        String actualModule1 = driver.findElement(By.linkText("Dashboard")).getText();
        String actualModule2 = driver.findElement(By.linkText("Users")).getText();
        String actualModule3 = driver.findElement(By.linkText("Books")).getText();
        List<String> actualModules = new ArrayList<>(Arrays.asList(actualModule1,actualModule2,actualModule3));

        System.out.println("expectedModules.size() = " + expectedModules.size());
        System.out.println("actualModules.size() = " + actualModules.size());
        System.out.println("expectedModules = " + expectedModules);
        System.out.println("actualModules = " + actualModules);

        if(expectedModules.size() == actualModules.size() && expectedModules.equals(actualModules)){
            System.out.println("Test Passed");
            System.out.println("There are 3 modules on the page");
            System.out.println("Expected Modules Equal to Actual Modules");
        }else{
            System.out.println("Test Failed");
            System.out.println("Modules' size are different");
            System.out.println("Expected Modules ARE NOT Equal to Actual Modules");
        }
        System.out.println("---------------------------------------------");



        driver.quit();
    }
}