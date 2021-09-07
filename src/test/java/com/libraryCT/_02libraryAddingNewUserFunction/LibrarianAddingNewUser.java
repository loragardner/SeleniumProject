package com.libraryCT._02libraryAddingNewUserFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibrarianAddingNewUser {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");
        driver.manage().window().maximize();

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
        //find "Users" module and click it
        WebElement usersModule = driver.findElement(new By.ByCssSelector("#menu_item .nav-item:nth-of-type(2) .title"));
        usersModule.click();

        Thread.sleep(1500);
        //find "Add User" button and click
        WebElement addUserBtn = driver.findElement(new By.ByCssSelector(".portlet-title [data-target]"));
        addUserBtn.click();
        Thread.sleep(1500);

        //find "full name" and send keys
        WebElement fullNameBox = driver.findElement(new By.ByCssSelector("input[name='full_name']"));
        fullNameBox.click();
        fullNameBox.sendKeys("Muhtar Kral");
        Thread.sleep(1500);

        //find password and send keys
        WebElement passwordBox = driver.findElement(new By.ByCssSelector("input[name='password']"));
        passwordBox.click();
        passwordBox.sendKeys("12345KralimBen!");
        Thread.sleep(1500);

        //find email box and send keys
        WebElement emailBox = driver.findElement(new By.ByCssSelector("input[name='email']"));
        emailBox.click();
        emailBox.sendKeys("muhtar15@gmail.com");                             //everytime change it

        //find "save changes" button and click it
        WebElement saveChangesBtn = driver.findElement(new By.ByCssSelector("#add_user_modal .btn-primary"));
        saveChangesBtn.click();
        Thread.sleep(1000);


        //verify a new user is created

        String expectedToastMsg = "The user has been created.";
        WebElement actualToastMsg = driver.findElement(new By.ByCssSelector(".toast-message"));
        if(expectedToastMsg.equals(actualToastMsg.getText())){
            System.out.println("-------------------------------------");
            System.out.println("Test Passed");
            System.out.println("actualToastMsg = " + actualToastMsg.getText());
            System.out.println("expectedToastMsg = " + expectedToastMsg);
        }else{
            System.out.println("-------------------------------------");
            System.out.println("Test Failed");
            System.out.println("actualToastMsg = " + actualToastMsg);
            System.out.println("expectedToastMsg = " + expectedToastMsg);
        }
        Thread.sleep(1000);
        System.out.println("-------------------------------------");


    }
}